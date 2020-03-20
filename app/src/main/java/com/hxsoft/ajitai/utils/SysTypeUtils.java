package com.hxsoft.ajitai.utils;


import android.content.Context;

public class SysTypeUtils {
    public static Integer getSysTypeInt(Context context) {
        return Integer.parseInt(SpUtils.getSettingNote(context, DbKeyS.systype));
    }

    public static String getSysTypeStr(Context context) {
        return SpUtils.getSettingNote(context, DbKeyS.systype);
    }
}
