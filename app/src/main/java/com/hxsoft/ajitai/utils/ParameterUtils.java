package com.hxsoft.ajitai.utils;

import java.util.Map;

public class ParameterUtils {
    public static String GetSign(String[] strs) {
        return "";
    }

    public static String GetSignRequest(Map<String, String> requestDataMap) {
        return "";
    }

    public static String Gettimestamp() {
        long time = System.currentTimeMillis() / 1000;//获取系统时间的10位的时间戳
        String str = String.valueOf(time);
        return str;
    }

    public static int GettimesInt() {
        long time = System.currentTimeMillis() / 1000;//获取系统时间的10位的时间戳
        int i = Integer.parseInt(String.valueOf(time));
        return i;
    }
}
