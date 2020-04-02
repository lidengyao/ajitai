package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_LiuYanJianYi_Operate;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_LiuYanJianYi_XiangQing extends MvpActivity {



    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_liuyanjianyi_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);


    }

    @Override
    protected BasePresent createPresenter() {
        return null;
    }


    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
    }


}
