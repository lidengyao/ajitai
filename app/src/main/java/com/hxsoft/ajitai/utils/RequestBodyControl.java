package com.hxsoft.ajitai.utils;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class RequestBodyControl {
    /**
     * 转换为 form-data
     *
     * @param requestDataMap
     * @return
     */
    public static Map<String, RequestBody> GenerateRequestBody(Map<String, String> requestDataMap ) {
        Map<String, RequestBody> requestBodyMap = new HashMap<>();
        String[] strings = new String[requestBodyMap.size()];
        for (int i = 0; i < requestBodyMap.size(); i++) {
        }
        for (String key : requestDataMap.keySet()) {

            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"),
                    requestDataMap.get(key) == null ? "" : requestDataMap.get(key));
            requestBodyMap.put(key, requestBody);
        }

        int timestamp = ParameterUtils.GettimesInt();
        RequestBody requestBody_timestamp = RequestBody.create(MediaType.parse("multipart/form-data"),
                timestamp + "");
        requestBodyMap.put("timestamp", requestBody_timestamp);
        //region 计算sign
        String sign = ParameterUtils.GetSignRequest(requestDataMap);

        RequestBody requestBody_sign = RequestBody.create(MediaType.parse("multipart/form-data"),
                sign + "");
        requestBodyMap.put("sign", requestBody_sign);
        //endregion
        return requestBodyMap;
    }
}
