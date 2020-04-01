package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.YiJiType_Info;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.utils.YiJiCaiDan_Popwindow;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ChengJiDan extends MvpActivity {


    @Bind(R.id.Back_LL)
    LinearLayout BackLL;
    @Bind(R.id.ShaiXuan_RL)
    RelativeLayout ShaiXuanRL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_chengjidan;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ShaiXuanRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }


    @Override
    protected LoginPresent createPresenter() {
        return new LoginPresent();
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
