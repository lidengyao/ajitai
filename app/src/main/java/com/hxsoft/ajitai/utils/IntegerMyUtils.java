package com.hxsoft.ajitai.utils;

import java.util.ArrayList;

public class IntegerMyUtils {
    public static String strip(ArrayList<Integer> integerArrayList) {
        return integerArrayList.toString().replace("[", "").replace("]", "");
    }
}
