package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XinShenHuDong extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.GengDuoRL)
    RelativeLayout GengDuoRL;
    @Bind(R.id.FaBuGanWu_RL)
    RelativeLayout FaBuGanWuRL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinshenhudong;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        GengDuoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinShenHuDong_JianJie.class);
                startActivity(intent);
            }
        });

        FaBuGanWuRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_DuShuHui_FaBuGanWu.class);
                startActivity(intent);
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
