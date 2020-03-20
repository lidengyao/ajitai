package com.hxsoft.ajitai.utils;

import java.util.ArrayList;

public class StringMyUtils {
    public static String strip(ArrayList<String> strings) {
        return strings.toString().replace("[", "").replace("]", "").replace(" ","");
    }
}
