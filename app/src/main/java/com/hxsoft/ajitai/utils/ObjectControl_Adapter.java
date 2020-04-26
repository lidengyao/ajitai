package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.widget.Toast;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.widget.Normal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class ObjectControl_Adapter <T>{
    /* 根据属性名获取属性值
     * */
    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            return value;
        } catch (Exception e) {

            return null;
        }
    }

    public static HashMap<String, String> ObjectToHashMap(Object object) {
        HashMap<String, String> dic = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String fieldName = fields[i].getName();
            if (fields[i].isSynthetic())
                continue;
            if (fieldName.equals("serialVersionUID"))
                continue;
            Object oValue = ObjectControl_Adapter.getFieldValueByName(fieldName, object);
            if (oValue != null) {
                String value = ObjectControl_Adapter.getFieldValueByName(fieldName, object).toString();
                if (value.equals("")) {
                    dic.put(fieldName, "无");
                } else {
                    dic.put(fieldName, value);
                }

            } else {
                dic.put(fieldName, "无");
            }
        }
        return dic;
    }

    public static boolean IsNullDialog(Context context, ArrayList<Normal> normalArrayList) {
        boolean isnull = true;
        for (int i = 0; i < normalArrayList.size(); i++) {
            if (normalArrayList.get(i).getNull() == false && normalArrayList.get(i).getNormalEditText().getText().toString().equals("")) {

                isnull = false;
                break;
            }
        }
        return isnull;
    }


    public static void SetData(ArrayList<Normal> tempNormalList, HashMap<String, String> dic, Context context) {
        Normal tempNormal = null;
        try {
            for (int i = 0; i < tempNormalList.size(); i++) {
                 tempNormal = tempNormalList.get(i);
                String normalKey = tempNormal.getKey();
                boolean IsHavThisKey = false;
                for (String key : dic.keySet()) {

                    DataSetColor.setEditTextColor(context, tempNormal.getNormalEditText(), tempNormal.getColorID());
                    if (key.equals(normalKey)) {
                        IsHavThisKey = true;
                        String value = dic.get(key);
//                    if (tempNormal.getIsTime() == null) {
//                        tempNormal.getNormalEditText().setText(value);
//                    } else {
//                       else {
//                            tempNormal.getNormalEditText().setText(value);
//                        }
//
//                    }

                        if (tempNormal.getTime()) {
                            tempNormal.getNormalEditText().setText(TimeUtils.DateToHMSString(Long.parseLong(value)));
                        } else if (tempNormal.getBaseCode()) {
                            tempNormal.getNormalEditText().setText(BaseCodeUtils.getValue(Integer.parseInt(value), context));
                        } else if (tempNormal.getUser()) {
                            tempNormal.getNormalEditText().setText(DicUtils.getUser(Integer.parseInt(value), context));
                        } else if (tempNormal.getUnit()) {
                            tempNormal.getNormalEditText().setText(DicUtils.getUnit(Integer.parseInt(value), context));
                        } else {
                            tempNormal.getNormalEditText().setText(value);
                        }

                        if (tempNormal.getNormalEditText().getText().toString().equals("字典里没有查到")) {
                            tempNormal.getNormalEditText().setTextColor(context.getResources().getColor(R.color.color26));
                        }

                        if (tempNormal.getNormalEditText().getText().toString().equals("无")) {
//                        tempNormal.getNormalEditText().setText("无");
                            tempNormal.getNormalEditText().setTextColor(context.getResources().getColor(R.color.color15));
                        }
                        break;
                    }


                }
                if (IsHavThisKey == false && tempNormal.getType().equals("Normal")) {
                    tempNormal.getNormalEditText().setText("当前值未配置");
                    tempNormal.getNormalEditText().setTextColor(context.getResources().getColor(R.color.color26));
                }

            }
        } catch (Exception e) {
            Toast.makeText(context, "异常，请联系管理员\n" + tempNormal.getKey() + ":" + e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }


    public static void SetData_Item(ArrayList<Normal> tempNormalList, HashMap<String, String> dic, Context context) {
        Normal tempNormal = null;
        try {
            for (int i = 0; i < tempNormalList.size(); i++) {
                tempNormal = tempNormalList.get(i);
                String normalKey = tempNormal.getKey();
                boolean IsHavThisKey = false;
                for (String key : dic.keySet()) {

                    if (key.equals(normalKey)) {
                        IsHavThisKey = true;
                        String value = dic.get(key);

                        if (tempNormal.getTime()) {
                            tempNormal.getTextView().setText(TimeUtils.DateToHMSString(Long.parseLong(value)));
                        } else if (tempNormal.getBaseCode()) {
                            tempNormal.getTextView().setText(BaseCodeUtils.getValue(Integer.parseInt(value), context));
                        } else if (tempNormal.getStatus()) {
                            tempNormal.getTextView().setText(BaseCodeUtils.getValue(Integer.parseInt(value), context));
                            DicUtils.SetStatus(DbKeyS.test, Integer.parseInt(value), context,   tempNormal.getTextView());
                        } else {
                            tempNormal.getTextView().setText(value);
                        }

                        if (tempNormal.getTextView().getText().toString().equals("字典里没有查到")) {
                            tempNormal.getTextView().setTextColor(context.getResources().getColor(R.color.color26));
                        }

                        if (tempNormal.getTextView().getText().toString().equals("无")) {
//                        tempNormal.getNormalEditText().setText("无");
                            tempNormal.getTextView().setTextColor(context.getResources().getColor(R.color.color15));
                        }
                        break;
                    }


                }
                if (IsHavThisKey == false && tempNormal.getType().equals("Normal")) {
                    tempNormal.getTextView().setText("当前值未配置");
                    tempNormal.getTextView().setTextColor(context.getResources().getColor(R.color.color26));
                }

            }
        } catch (Exception e) {
            Toast.makeText(context, "异常，请联系管理员\n" + tempNormal.getKey() + ":" + e.getMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
}
