package com.hxsoft.ajitai.utils;

import android.content.Context;

import com.hxsoft.ajitai.model.info.BaseCodeInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class BaseCodeUtils {

    public static String getValue(Integer id, Context context) {
        String value = "";
        try {
            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(context, DbKeyS.basecodelist);

            ArrayList<BaseCodeInfo> baseCodeInfoArrayList = new ArrayList<>();
            if (!gsonData.equals("")) {
                ArrayList<BaseCodeInfo> tempGList = gson.fromJson(gsonData, new TypeToken<List<BaseCodeInfo>>() {
                }.getType());
                baseCodeInfoArrayList.addAll(tempGList);
            }

            for (int i = 0; i < baseCodeInfoArrayList.size(); i++) {
                BaseCodeInfo baseCodeInfo = baseCodeInfoArrayList.get(i);
                Integer tempid = baseCodeInfo.getId();
                if (tempid.equals(id)) {
                    value = baseCodeInfo.getCardNo();
                }
            }
            return value == "" ? "" : value;
        } catch (Exception e) {
            e.printStackTrace();
            return value == "" ? "" : value;
        }
    }
}
