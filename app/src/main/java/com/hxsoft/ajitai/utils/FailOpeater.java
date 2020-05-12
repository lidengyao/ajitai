package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.ui.activity.A_LoginActivity;

public class FailOpeater {

    public static void SetFail(Integer code, String tip, String msg, Context context) {
        if (code.equals(401)) {
            Toast.makeText(context, R.string.tokentimeout, Toast.LENGTH_LONG).show();
            SpUtils.saveSettingNote(context, DbKeyS.token, null);
            SpUtils.saveSettingNote(context, DbKeyS.isLogin, null);
            Intent intent = new Intent(context, A_LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            context.startActivity(intent);
        } else {
            Toast.makeText(context, LogCode.GetCode(tip) + msg, Toast.LENGTH_LONG).show();
        }
    }

}
