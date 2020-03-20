package com.hxsoft.ajitai.utils;

import android.content.Context;

import java.util.ArrayList;

public class ArrayUtils {
    public static String ArrayDataToString(ArrayList<String> stringArrayList, Context context, String split) {
        String result = "";
        for (int m = 0; m < stringArrayList.size(); m++) {
            if (m == stringArrayList.size() - 1) {
                result += stringArrayList.get(m);
            } else {
                result += stringArrayList.get(m) + split;
            }

        }
        return result;
    }
}
