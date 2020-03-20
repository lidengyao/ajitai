package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.widget.Toast;

import com.hxsoft.ajitai.widget.Normal;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Filter_Control<T> {

    private T t;

    public Filter_Control(T t) {
        this.t = t;
    }

    public T getTBean(ArrayList<Normal> normalArrayList, Context context) {

        try {
            Field[] fields = t.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                String filedName = fields[i].getName();
                if (fields[i].isSynthetic())
                    continue;
                if (filedName.equals("serialVersionUID"))
                    continue;
                fields[i].setAccessible(true);

                //如果normalArrayList里包含filedName就继续
//                if (AnalyzeNormalControl.isHavFieldName(filedName, normalArrayList))
//                    fields[i].set(t, AnalyzeNormalControl.getData(filedName, normalArrayList));
//                else {
//                    fields[i].set(t, null);
//                }
            }

        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

        return t;
    }
}
