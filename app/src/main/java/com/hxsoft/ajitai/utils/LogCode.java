package com.hxsoft.ajitai.utils;

public class LogCode {
    public static boolean isShowCode = false;

    public static String GetCode(String code) {
        if (isShowCode) {
            return code;
        } else
            return "";
    }

}
