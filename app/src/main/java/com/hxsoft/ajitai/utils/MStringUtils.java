package com.hxsoft.ajitai.utils;

public class MStringUtils {

    public static boolean IsNullOrEmpty(String value) {
        if (value == null)
            return true;
        else if (value.trim().equals(""))
            return true;
        else
            return false;
    }

}
