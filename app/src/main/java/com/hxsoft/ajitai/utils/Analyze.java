package com.hxsoft.ajitai.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.model.Inf.NormalArrayListCheckListener;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

public class Analyze {

    private Context context;
    private Activity activity;
    private String xmlName;
    private LinearLayout rootLL;
    private String dialogType;
    private View FilterListview;
    private PullLoadMoreListView pullLoadMoreListView;
    private View mainview;
    private TextView DicLeftTitleTV;
    private NormalArrayListCheckListener normalArrayListCheckListener;

    public NormalArrayListCheckListener getNormalArrayListCheckListener() {
        return normalArrayListCheckListener;
    }

    public void setNormalArrayListCheckListener(NormalArrayListCheckListener normalArrayListCheckListener) {
        this.normalArrayListCheckListener = normalArrayListCheckListener;
    }

    public TextView getDicLeftTitleTV() {
        return DicLeftTitleTV;
    }

    public void setDicLeftTitleTV(TextView dicLeftTitleTV) {
        DicLeftTitleTV = dicLeftTitleTV;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String getXmlName() {
        return xmlName;
    }

    public void setXmlName(String xmlName) {
        this.xmlName = xmlName;
    }

    public LinearLayout getRootLL() {
        return rootLL;
    }

    public void setRootLL(LinearLayout rootLL) {
        this.rootLL = rootLL;
    }

    public String getDialogType() {
        return dialogType;
    }

    public void setDialogType(String dialogType) {
        this.dialogType = dialogType;
    }

    public View getFilterListview() {
        return FilterListview;
    }

    public void setFilterListview(View filterListview) {
        FilterListview = filterListview;
    }

    public PullLoadMoreListView getPullLoadMoreListView() {
        return pullLoadMoreListView;
    }

    public void setPullLoadMoreListView(PullLoadMoreListView pullLoadMoreListView) {
        this.pullLoadMoreListView = pullLoadMoreListView;
    }

    public View getMainview() {
        return mainview;
    }

    public void setMainview(View mainview) {
        this.mainview = mainview;
    }
}
