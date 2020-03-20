package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.base.BasePresent;

public class TimeOutUtil extends BasePresent<BaseMvpView> {
    public static void LogOut(Context context, Activity activity,int code, String msg) {
        //REFRESH TOKEN过期
        Toast.makeText(activity, "登录超时，请重新登录", Toast.LENGTH_SHORT).show();
        //ACCESS TOKEN过期
//        Intent intent = new Intent(context, Z_Login_Activity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        activity.startActivity(intent);
    }
}
