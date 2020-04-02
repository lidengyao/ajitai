package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_GanWu_SouSuo extends MvpActivity {


    @Bind(R.id.ExitLL)
    RelativeLayout ExitLL;
    @Bind(R.id.OperateIV)
    ImageView OperateIV;
    @Bind(R.id.ZhuanFa_LL)
    LinearLayout ZhuanFaLL;
    @Bind(R.id.FenXiang_LL)
    LinearLayout FenXiangLL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_ganwu_sousuo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ExitLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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