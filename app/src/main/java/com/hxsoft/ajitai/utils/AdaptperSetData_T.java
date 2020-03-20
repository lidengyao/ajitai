package com.hxsoft.ajitai.utils;

import android.content.Context;

import com.hxsoft.ajitai.adapter.ViewHolder_Normal;
import com.hxsoft.ajitai.widget.Normal;

import java.util.ArrayList;
import java.util.HashMap;

public class AdaptperSetData_T<T> {

    public void SetData(ViewHolder_Normal helper, T t, Context context) {
        ArrayList<Normal> normalArrayList = helper.getNormalArrayList();
        if (t == null)
            return;
        HashMap<String, String> dic = new HashMap<>();
        dic = ObjectControl.ObjectToHashMap(t);
        ObjectControl.SetData_Item(normalArrayList, dic, context);
    }
}
