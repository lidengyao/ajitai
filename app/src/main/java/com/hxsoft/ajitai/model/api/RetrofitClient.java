package com.hxsoft.ajitai.model.api;

import android.content.Context;
import android.util.Log;

import com.hxsoft.ajitai.AppContext;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.SpUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONException;
import cn.hutool.json.JSONObject;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static cn.hutool.system.SystemUtil.LINE_SEPARATOR;

/**
 * Created by jinxh on 16/2/17.
 */
public class RetrofitClient {
    public static Retrofit mRetrofit;

    private RetrofitClient(Context context) {

    }

    public static Retrofit builderRetrofit(final Context context) {
        if (mRetrofit == null) {
//            MHttpLoggingInterceptor logging = new MHttpLoggingInterceptor();
//            logging.setLevel(MHttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

            //添加head
            httpClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    Request original = chain.request();

                    // Request customization: add request headers
                    Request.Builder requestBuilder = original.newBuilder();

                    String token = SpUtils.getSettingNote(context, DbKeyS.token);
                    requestBuilder.addHeader("Content-Type", "application/json");
                    requestBuilder.addHeader("VERSION", "1.0");
                    requestBuilder.addHeader("Accept", "application/json");
                    if (token != null)
                        requestBuilder.addHeader("Authorization", "bearer " + token);

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            httpClient.addInterceptor(mLoggingInterceptor);
            Gson gson = new GsonBuilder().registerTypeAdapterFactory(new NullToDefaultValueAdapterFactory()).create();

            mRetrofit = new Retrofit.Builder()
                    .baseUrl(AppContext.API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(httpClient.build())
                    .build();

        }
        return mRetrofit;
    }

    /**
     * 日志拦截器
     */
    private static final Interceptor mLoggingInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            long t1 = System.nanoTime();//请求发起的时间
            FileUtils.writeLogToFile("URL---------------------------\r\n");
            FileUtils.writeLogToFile("URL：" + request.url() + "\r\n");
//            Log.e("Interceptor", String.format("发送请求 %s on %s%n%s", request.url(), chain.connection(), request.headers()));
            Response response = chain.proceed(request);
            long t2 = System.nanoTime();//收到响应的时间
            //这里不能直接使用response.body().string()的方式输出日志
            //因为response.body().string()之后，response中的流会被关闭，程序会报错，我们需要创建出一个新的response给应用层处理
            ResponseBody responseBody = response.peekBody(1024 * 1024);
//            printLog("接受响应", responseBody.string());
            FileUtils.writeLogToFile("Body---------------------------\r\n");
            FileUtils.writeLogToFile("Body：" + responseBody.string() + "\r\n");
            return response;
        }
    };

    /**
     * 三个参数 Tag就是log中的tag，msg为具体信息
     */
    public static void printLog(String tag, String msg) {
        String message = null;
        try {//需判断json是什么格式
//            if (msg.startsWith("{")) {
//                JSONObject jsonObject = new JSONObject(msg);
//                message = jsonObject.toString(4);//最重要的方法，就一行，返回格式化的json字符串，其中的数字4是缩进字符数
//            } else if (msg.startsWith("[")) {
//                JSONArray jsonArray = new JSONArray(msg);
//                message = jsonArray.toString(4);
//            } else {
//                message = msg;
//            }
        } catch (JSONException e) {
            message = msg;
        }
//        String[] lines = message.split(LINE_SEPARATOR);
//        //此处也可以画分割线
//        //log.e(tag,"----------------------------------------------")
//        for (String line : lines) {
//            Log.d(tag, "|" + line);
//        }
        //log.e(tag,"----------------------------------------------")
    }

    public static class NullToDefaultValueAdapterFactory<T> implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            Class<T> rawType = (Class<T>) type.getRawType();
            if (rawType == String.class) {
                return (TypeAdapter<T>) new StringNullAdapter();
            } else if (rawType == Boolean.class) {
                return (TypeAdapter<T>) new BooleanNullAdapter();
            } else if (rawType == Integer.class) {
                return (TypeAdapter<T>) new IntegerNullAdapter();
            } else if (rawType == Double.class) {
                return (TypeAdapter<T>) new DoubleNullAdapter();
            } else if (rawType == Long.class) {
                return (TypeAdapter<T>) new LongNullAdapter();
            }
            return null;
        }
    }

    public static class LongNullAdapter extends TypeAdapter<Long> {
        @Override
        public Long read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return 0l;
            }
            return reader.nextLong();
        }

        @Override
        public void write(JsonWriter writer, Long value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }

    public static class DoubleNullAdapter extends TypeAdapter<Double> {
        @Override
        public Double read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            double doubleValue = 0.0d;
            try {
                String stringValue = reader.nextString();
                doubleValue = Double.parseDouble(stringValue);
            } catch (NumberFormatException e) {
                return null;
            }
            return doubleValue;
        }

        @Override
        public void write(JsonWriter writer, Double value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }

    public static class IntegerNullAdapter extends TypeAdapter<Integer> {
        @Override
        public Integer read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            return reader.nextInt();
        }

        @Override
        public void write(JsonWriter writer, Integer value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }

    public static class BooleanNullAdapter extends TypeAdapter<Boolean> {
        @Override
        public Boolean read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return false;
            }
            return reader.nextBoolean();
        }

        @Override
        public void write(JsonWriter writer, Boolean value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }

    public static class StringNullAdapter extends TypeAdapter<String> {
        @Override
        public String read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return "";
            }
            return reader.nextString();
        }

        @Override
        public void write(JsonWriter writer, String value) throws IOException {
            if (value == null) {
                writer.nullValue();
                return;
            }
            writer.value(value);
        }
    }
}
