package com.hxsoft.ajitai.utils;

import android.view.View;

import com.hxsoft.ajitai.widget.Normal;

import java.io.Serializable;
import java.util.ArrayList;

public class ViewHoder_GetDataBean implements Serializable {
    private View view;
    private ArrayList<Normal> normalArrayList;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ArrayList<Normal> getNormalArrayList() {
        return normalArrayList;
    }

    public void setNormalArrayList(ArrayList<Normal> normalArrayList) {
        this.normalArrayList = normalArrayList;
    }
}
