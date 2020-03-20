package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.Toast;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.BaseCodeInfo;
import com.hxsoft.ajitai.widget.Normal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class ObjectControl {
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
            Object oValue = ObjectControl.getFieldValueByName(fieldName, object);
            if (oValue != null) {
                String value = ObjectControl.getFieldValueByName(fieldName, object).toString();
                if (value.equals("")) {
                    dic.put(fieldName, "");
                } else {
                    dic.put(fieldName, value);
                }

            } else {
                dic.put(fieldName, null);
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
        for (int i = 0; i < tempNormalList.size(); i++) {
            tempNormal = tempNormalList.get(i);
            String normalKey = tempNormal.getKey();
            boolean IsHavThisKey = false;
            for (String key : dic.keySet()) {

                try {
                    DataSetColor.setEditTextColor(context, tempNormal.getNormalEditText(), tempNormal.getColorID());
                    if (key.equals(normalKey)) {
                        IsHavThisKey = true;
                        String value = dic.get(key);

                        if (tempNormal.getTime()) {
                            tempNormal.getNormalEditText().setText(TimeUtils.DateToHMSString(Long.parseLong(value)));
                        } else if (tempNormal.getBaseCode()) {
                            tempNormal.getNormalEditText().setText(value == null || value.equals("") ? "无" : BaseCodeUtils.getValue(Integer.parseInt(value), context));
                        } else if (tempNormal.getUser()) {
                            tempNormal.getNormalEditText().setText(DicUtils.getUser(Integer.parseInt(value), context));
                        } else if (tempNormal.getUnit()) {
                            tempNormal.getNormalEditText().setText(DicUtils.getUnit(Integer.parseInt(value), context));
                        } else if (tempNormal.getStatus()) {
//                            tempNormal.getNormalEditText().setText(DicUtils.getStatusDic(context,tempNormal.getStatusName()));
                            DicUtils.SetStatus(tempNormal.getStatusName(), value == null ? null : Integer.parseInt(value), context, tempNormal.getNormalEditText());
                        } else if (tempNormal.isOpinion()) {
                            String result = "";
                            if (value.equals("1")) {
                                result = "同意";
                            }
                            if (value.equals("2")) {
                                result = "不同意";
                            }
                            tempNormal.getNormalEditText().setText(result);
                        } else if (tempNormal.isOkCheckList()) {
                            String[] strings = value.split(",");
                            ArrayList<String> stringArrayList = new ArrayList<>();
                            for (int n = 0; n < strings.length; n++) {
                                stringArrayList.add(strings[n]);
                            }

                            for (int k = 0; k < tempNormal.getCheckBoxArrayList().size(); k++) {
                                CheckBox checkBox = tempNormal.getCheckBoxArrayList().get(k);
                                BaseCodeInfo baseCodeInfo = (BaseCodeInfo) checkBox.getTag();
                                if (stringArrayList.contains(baseCodeInfo.getId() + "")) {
                                    checkBox.setChecked(true);
                                }
                                checkBox.setClickable(false);
                            }
                        } else {
                            tempNormal.getNormalEditText().setText(value == null || value.equals("") ? "无" : value);
                        }

                        if (tempNormal.isOkCheckList() == false) {
                            if (tempNormal.getNormalEditText().getText().toString().equals("字典里没有查到")) {
                                tempNormal.getNormalEditText().setTextColor(context.getResources().getColor(R.color.color26));
                            }

                            if (tempNormal.getNormalEditText().getText().toString().equals("无")) {
//                        tempNormal.getNormalEditText().setText("无");
                                tempNormal.getNormalEditText().setTextColor(context.getResources().getColor(R.color.color15));
                            }
                        }

//                        break;
                    }
                } catch (Exception e) {
                    Toast.makeText(context, "异常，请联系管理员\n" + tempNormal.getValue() + ":" + e.getMessage(), Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }


            }
            if (IsHavThisKey == false && tempNormal.getType().equals("Normal")) {
                tempNormal.getNormalEditText().setText("当前值未配置");
                tempNormal.getNormalEditText().setTextColor(context.getResources().getColor(R.color.color26));
            }

        }

    }


    public static void SetData_Item(ArrayList<Normal> tempNormalList, HashMap<String, String> dic, Context context) {
        Normal tempNormal = null;
        for (int i = 0; i < tempNormalList.size(); i++) {
            tempNormal = tempNormalList.get(i);
            String normalKey = tempNormal.getKey();
            boolean IsHavThisKey = false;
            for (String key : dic.keySet()) {

                try {
                    if (key.equals(normalKey)) {
                        IsHavThisKey = true;
                        String value = dic.get(key);

                        if (tempNormal.getTime()) {
                            tempNormal.getTextView().setText(TimeUtils.DateToHMSString(Long.parseLong(value)));
                        } else if (tempNormal.getBaseCode()) {
                            tempNormal.getTextView().setText(value == null || value == "" ? "无" : BaseCodeUtils.getValue(Integer.parseInt(value), context));
                        } else if (tempNormal.getStatus()) {
//                            tempNormal.getTextView().setText(value == null ? "无" :  BaseCodeUtils.getValue(Integer.parseInt(value), context));
                            DicUtils.SetStatus(tempNormal.getStatusName(), value == null ? null : Integer.parseInt(value), context, tempNormal.getTextView());
                        } else {
                            tempNormal.getTextView().setText(value == null || value == "" ? "无" : value);
                        }

                        if (tempNormal.getTextView().getText().toString().equals("字典里没有查到")) {
                            tempNormal.getTextView().setTextColor(context.getResources().getColor(R.color.color26));
                        }

                        if (tempNormal.getTextView().getText().toString().equals("无")) {
//                        tempNormal.getNormalEditText().setText("无");
//                            tempNormal.getTextView().setTextColor(context.getResources().getColor(R.color.color15));
                        }
//                        break;
                    }

                } catch (Exception e) {
                    Toast.makeText(context, "异常，请联系管理员\n" + tempNormal.getKey() + ":" + e.getMessage(), Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }


            }
            if (IsHavThisKey == false && tempNormal.getType().equals("Normal")) {
                tempNormal.getTextView().setText("当前值未配置");
                tempNormal.getTextView().setTextColor(context.getResources().getColor(R.color.color26));
            }

        }


    }
}
