package com.hxsoft.ajitai.model.api;


import com.hxsoft.ajitai.utils.FileUtils;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.concurrent.TimeUnit;

import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

public final class MHttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");

    public enum Level {
        /**
         * No logs.
         */
        NONE,
        /**
         * Logs request and response lines.
         *
         * <p>Example:
         * <pre>{@code
         * --> POST /greeting http/1.1 (3-byte body)
         *
         * <-- 200 OK (22ms, 6-byte body)
         * }</pre>
         */
        BASIC,
        /**
         * Logs request and response lines and their respective headers.
         *
         * <p>Example:
         * <pre>{@code
         * --> POST /greeting http/1.1
         * Host: example.com
         * Content-Type: plain/text
         * Content-Length: 3
         * --> END POST
         *
         * <-- 200 OK (22ms)
         * Content-Type: plain/text
         * Content-Length: 6
         * <-- END HTTP
         * }</pre>
         */
        HEADERS,
        /**
         * Logs request and response lines and their respective headers and bodies (if present).
         *
         * <p>Example:
         * <pre>{@code
         * --> POST /greeting http/1.1
         * Host: example.com
         * Content-Type: plain/text
         * Content-Length: 3
         *
         * Hi?
         * --> END GET
         *
         * <-- 200 OK (22ms)
         * Content-Type: plain/text
         * Content-Length: 6
         *
         * Hello!
         * <-- END HTTP
         * }</pre>
         */
        BODY
    }

    public interface Logger {
        void log(String message);

        /**
         * A {@link Logger} defaults output appropriate for the current platform.
         */
        Logger DEFAULT = new Logger() {
            @Override
            public void log(String message) {
//                Platform.get().log(message);
            }
        };
    }

    public MHttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public MHttpLoggingInterceptor(Logger logger) {
        this.logger = logger;
    }

    private final Logger logger;

    private volatile Level level = Level.NONE;

    /**
     * Change the level at which this interceptor logs.
     */
    public MHttpLoggingInterceptor setLevel(Level level) {
        if (level == null) throw new NullPointerException("level == null. Use Level.NONE instead.");
        this.level = level;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Level level = this.level;

        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }

        boolean logBody = level == Level.BODY;
        boolean logHeaders = logBody || level == Level.HEADERS;

        RequestBody requestBody = request.body();
        boolean hasRequestBody = requestBody != null;

        Connection connection = chain.connection();
        Protocol protocol = connection != null ? connection.protocol() : Protocol.HTTP_1_1;
        String requestStartMessage = "--> " + request.method() + ' ' + request.url() + ' ' + protocol;
        if (!logHeaders && hasRequestBody) {
            requestStartMessage += " (" + requestBody.contentLength() + "-byte body)";
        }
//        FileUtils.writeLogToFile("---------------------line--------------------\r\n");
        logger.log("TAG001:" + requestStartMessage);
        FileUtils.writeLogToFile("TAG001:" + requestStartMessage + "\r\n");
        if (logHeaders) {
            if (hasRequestBody) {
                // Request body headers are only present when installed as a network interceptor. Force
                // them to be included (when available) so there values are known.
                if (requestBody.contentType() != null) {
                    logger.log("TAG002:" + "Content-Type: " + requestBody.contentType());
                }
                if (requestBody.contentLength() != -1) {
                    logger.log("TAG003:" + "Content-Length: " + requestBody.contentLength());
                }
            }

            Headers headers = request.headers();
            for (int i = 0, count = headers.size(); i < count; i++) {
                String name = headers.name(i);
                // Skip headers from the request body as they are explicitly logged above.
                if (!"Content-Type".equalsIgnoreCase(name) && !"Content-Length".equalsIgnoreCase(name)) {

                    String headerData = headers.value(i);
                    logger.log("TAG004:" + name + ": " + headerData);
                    if (name.equals("token") || name.equals("moduleType")) {
                        String tag04 = "TAG004:" + name + ": " + headerData;
                        FileUtils.writeLogToFile(tag04 + "\r\n");
                    }
                }
            }

            if (!logBody || !hasRequestBody) {
                logger.log("TAG005:" + "--> END " + request.method());
            } else if (bodyEncoded(request.headers())) {
                logger.log("TAG006:" + "--> END " + request.method() + " (encoded body omitted)");
            } else {
                Buffer buffer = new Buffer();
                requestBody.writeTo(buffer);

                Charset charset = UTF8;
                MediaType contentType = requestBody.contentType();
                if (contentType != null) {
                    charset = contentType.charset(UTF8);
                }

                logger.log("TAG007:" + "");
                if (isPlaintext(buffer)) {
                    String tag008 = "TAG008:" + buffer.readString(charset);
                    logger.log(tag008);
                    if (!tag008.equals("TAG008:")) {
                        FileUtils.writeLogToFile(tag008 + "\r\n");
                    }

                    logger.log("TAG009:" + "--> END " + request.method()
                            + " (" + requestBody.contentLength() + "-byte body)");
                } else {
                    logger.log("TAG010:" + "--> END " + request.method() + " (binary "
                            + requestBody.contentLength() + "-byte body omitted)");
                }
            }
        }

        long startNs = System.nanoTime();
        Response response;
        try {
            response = chain.proceed(request);
        } catch (Exception e) {
            logger.log("TAG011:" + "<-- HTTP FAILED: " + e);
            throw e;
        }
        long tookMs = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNs);

        ResponseBody responseBody = response.body();
        long contentLength = responseBody.contentLength();
        String bodySize = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
        logger.log("TAG012:" + "<-- " + response.code() + ' ' + response.message() + ' '
                + response.request().url() + " (" + tookMs + "ms" + (!logHeaders ? ", "
                + bodySize + " body" : "") + ')');


        if (logHeaders) {
            Headers headers = response.headers();
            for (int i = 0, count = headers.size(); i < count; i++) {
                logger.log("TAG013:" + headers.name(i) + ": " + headers.value(i));
            }

            if (!logBody || !hasRequestBody) {
                logger.log("TAG014:" + "<-- END HTTP");
            } else if (bodyEncoded(response.headers())) {
                logger.log("TAG015:" + "<-- END HTTP (encoded body omitted)");
            } else {
                BufferedSource source = responseBody.source();
                source.request(Long.MAX_VALUE); // Buffer the entire body.
                Buffer buffer = source.buffer();

                Charset charset = UTF8;
                MediaType contentType = responseBody.contentType();
                if (contentType != null) {
                    try {
                        charset = contentType.charset(UTF8);
                    } catch (UnsupportedCharsetException e) {
                        logger.log("TAG016:" + "");
                        logger.log("TAG017:" + "Couldn't decode the response body; charset is likely malformed.");
                        logger.log("TAG018:" + "<-- END HTTP");

                        return response;
                    }
                }

                if (!isPlaintext(buffer)) {
                    logger.log("TAG019:" + "");
                    logger.log("TAG020:" + "<-- END HTTP (binary " + buffer.size() + "-byte body omitted)");
                    return response;
                }

                if (contentLength != 0) {
                    logger.log("TAG021:" + "");
                    logger.log("TAG022:" + buffer.clone().readString(charset));
                    StringBuilder sb = new StringBuilder();
                    sb.append("method:")
                            .append(request.method())
                            .append(";")
                            .append("url:")
                            .append(request.url())
                            .append(";");

                    if (!(!logBody || !hasRequestBody || bodyEncoded(request.headers()))) {
                        Buffer buffer1 = new Buffer();
                        requestBody.writeTo(buffer1);

                        if (isPlaintext(buffer1)) {
                            sb.append("body:")
                                    .append(buffer1.readString(charset))
                                    .append(";");
                        }
                    }


                    sb.append("response:")
                            .append(buffer.clone().readString(charset))
                            .append(";");
//                    L.sendLogToServer("httpDetail",sb.toString());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("method:")
                            .append(request.method())
                            .append(";")
                            .append("\n")
                            .append("url:")
                            .append(request.url())
                            .append(";")
                            .append("\n");

                    if (!(!logBody || !hasRequestBody || bodyEncoded(request.headers()))) {
                        Buffer buffer1 = new Buffer();
                        requestBody.writeTo(buffer1);

                        MediaType contentType1 = requestBody.contentType();
                        if (contentType != null) {
                            charset = contentType1.charset(UTF8);
                        }
                        if (isPlaintext(buffer1)) {
                            sb.append("body:")
                                    .append(buffer.readString(charset))
                                    .append(";")
                                    .append("\n");
                        }
                    }
                    sb.append("response:")
                            .append(response.code())
                            .append(";")
                            .append("\n");
//                    L.sendLogToServer("httpDetail",sb.toString());
                    String TAG024 = "TAG024:" + sb.toString();
                    FileUtils.writeLogToFile(TAG024 + "\r\n");
                }

                logger.log("TAG023:" + "<-- END HTTP (" + buffer.size() + "-byte body)");
            }
        }

        return response;
    }


    public void printLogToService(Chain chain, int code) throws IOException {
        StringBuilder sb = new StringBuilder();

        boolean logBody = level == Level.BODY;
        Request request = chain.request();
        RequestBody requestBody = request.body();
        boolean hasRequestBody = requestBody != null;

        sb.append("method:")
                .append(request.method())
                .append(";")
                .append("url:")
                .append(request.url())
                .append(";");


        if (!logBody || !hasRequestBody) {
            android.util.Log.i("djx", "--> END " + request.method());
        } else if (bodyEncoded(request.headers())) {
            android.util.Log.i("djx", "--> END " + request.method() + " (encoded body omitted)");
        } else {
            Buffer buffer = new Buffer();
            requestBody.writeTo(buffer);

            Charset charset = UTF8;
            MediaType contentType = requestBody.contentType();
            if (contentType != null) {
                charset = contentType.charset(UTF8);
            }

            if (isPlaintext(buffer)) {
                sb.append("body:")
                        .append(buffer.readString(charset))
                        .append(";");
            }
        }


        Response response;
        try {
            response = chain.proceed(request);
        } catch (Exception e) {
            logger.log("TAG024:" + "<-- HTTP FAILED: " + e);
            throw e;
        }


        ResponseBody responseBody = response.body();
        BufferedSource source = responseBody.source();
        source.request(Long.MAX_VALUE); // Buffer the entire body.
        Buffer rspButter = source.buffer();
        if (code != 200) {
            sb.append("response:")
                    .append(code)
                    .append(";");
        } else {

            Charset charset = UTF8;
            if (!isPlaintext(rspButter)) {
                sb.append("response:")
                        .append(rspButter.clone().readString(charset))
                        .append(";");
            }
        }

//        L.sendLogToServer("httpDetail",sb.toString());
        android.util.Log.i("djx", "printLogToService: " + sb.toString());

    }

    /**
     * Returns true if the body in question probably contains human readable text. Uses a small sample
     * of code points to detect unicode control characters commonly used in binary file signatures.
     */
    static boolean isPlaintext(Buffer buffer) throws EOFException {
        try {
            Buffer prefix = new Buffer();
            long byteCount = buffer.size() < 64 ? buffer.size() : 64;
            buffer.copyTo(prefix, 0, byteCount);
            for (int i = 0; i < 16; i++) {
                if (prefix.exhausted()) {
                    break;
                }
                int codePoint = prefix.readUtf8CodePoint();
                if (Character.isISOControl(codePoint) && !Character.isWhitespace(codePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException e) {
            return false; // Truncated UTF-8 sequence.
        }
    }

    private boolean bodyEncoded(Headers headers) {
        String contentEncoding = headers.get("Content-Encoding");
        return contentEncoding != null && !contentEncoding.equalsIgnoreCase("identity");
    }
}
