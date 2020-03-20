package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hxsoft.ajitai.model.info.BaseCodeInfo;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

public class CheckListView_Bean_Side {
    private Context context;
    private Activity activity;
    private ArrayList<BaseCodeInfo> baseCodeInfoArrayList;
    private EditText editText;

    private View FilterListview;
    private TextView DicLeftTitleTV;
    private PullLoadMoreListView pullLoadMoreListView;
    private String TypeKey;

    public String getTypeKey() {
        return TypeKey;
    }

    public void setTypeKey(String typeKey) {
        TypeKey = typeKey;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public View getFilterListview() {
        return FilterListview;
    }

    public void setFilterListview(View filterListview) {
        FilterListview = filterListview;
    }

    public TextView getDicLeftTitleTV() {
        return DicLeftTitleTV;
    }

    public void setDicLeftTitleTV(TextView dicLeftTitleTV) {
        DicLeftTitleTV = dicLeftTitleTV;
    }

    public PullLoadMoreListView getPullLoadMoreListView() {
        return pullLoadMoreListView;
    }

    public void setPullLoadMoreListView(PullLoadMoreListView pullLoadMoreListView) {
        this.pullLoadMoreListView = pullLoadMoreListView;
    }

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
