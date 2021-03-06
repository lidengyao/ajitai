package com.hxsoft.ajitai.utils;

import android.content.Context;

import com.hxsoft.ajitai.model.bean.LoginInfo;
import com.google.gson.Gson;

public class TokenUtils {
    public static void ResetToken(String model, Context context) {
        Gson gson = new Gson();
//        String s = AppContext.dbHelper.GetValue(DbKeyS.logininfo);
        String s = SpUtils.getSettingNote(context, DbKeyS.test);
        LoginInfo loginInfo = gson.fromJson(s, LoginInfo.class);
        loginInfo.setAccess_token(model);

        Gson setGson = new Gson();
        String setGsonData = setGson.toJson(loginInfo);
//        AppContext.dbHelper.SetData_Bottom(DbKeyS.logininfo, setGsonData);
        SpUtils.saveSettingNote(context, DbKeyS.test, setGsonData);
    }
}
