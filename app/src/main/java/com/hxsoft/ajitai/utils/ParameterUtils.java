package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import com.hxsoft.ajitai.model.info.ParameterCheckListener;

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


    //先定义
    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    //region 读写文件权限
    private static String[] PERMISSIONS_STORAGE = {
            "android.permission.READ_EXTERNAL_STORAGE",
            "android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void WRITE_EXTERNAL_STORAGE(Activity activity, ParameterCheckListener parameterCheckListener) {
        try {
            //检测是否有写的权限
            int permission = ActivityCompat.checkSelfPermission(activity,
                    "android.permission.WRITE_EXTERNAL_STORAGE");
            if (permission != PackageManager.PERMISSION_GRANTED) {
                // 没有写的权限，去申请写的权限，会弹出对话框
                ActivityCompat.requestPermissions(activity, PERMISSIONS_STORAGE, REQUEST_EXTERNAL_STORAGE);
            } else {
                parameterCheckListener.setData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //endregion


    //region

    private static String[] PERMISSIONS_PHONE={
            "android.permission.READ_PHONE_STATE"
    };
    public static void READ_PHONE_STATE(Activity activity, ParameterCheckListener parameterCheckListener) {
        try {
            //检测是否有写的权限
            int permission = ActivityCompat.checkSelfPermission(activity,
                    "android.permission.READ_PHONE_STATE");
            if (permission != PackageManager.PERMISSION_GRANTED) {
                // 没有写的权限，去申请写的权限，会弹出对话框
                ActivityCompat.requestPermissions(activity, PERMISSIONS_PHONE, REQUEST_EXTERNAL_STORAGE);
            } else {
                parameterCheckListener.setData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //endregion
}
