package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.widget.EditText;

import com.hxsoft.ajitai.model.info.BaseCodeInfo;

import java.util.ArrayList;

public class CheckListView_Bean {
    private Context context;
    private ArrayList<BaseCodeInfo> baseCodeInfoArrayList;
    private EditText editText;


    public EditText getEditText() {
        return editText;
    }

    public void setEditText(EditText editText) {
        this.editText = editText;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<BaseCodeInfo> getBaseCodeInfoArrayList() {
        return baseCodeInfoArrayList;
    }

    public void setBaseCodeInfoArrayList(ArrayList<BaseCodeInfo> baseCodeInfoArrayList) {
        this.baseCodeInfoArrayList = baseCodeInfoArrayList;
    }

}
