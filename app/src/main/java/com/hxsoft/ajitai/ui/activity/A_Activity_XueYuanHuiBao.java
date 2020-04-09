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
public class A_Activity_XueYuanHuiBao extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.SouSuoRL)
    RelativeLayout SouSuoRL;
    @Bind(R.id.TuPian_RL)
    RelativeLayout TuPianRL;
    @Bind(R.id.YinShiPin_RL)
    RelativeLayout YinShiPinRL;
    @Bind(R.id.JianChaBaoGao_RL)
    RelativeLayout JianChaBaoGaoRL;
    @Bind(R.id.HuiBaoCaiLiao_RL)
    RelativeLayout HuiBaoCaiLiaoRL;
    @Bind(R.id.GeRenZiLiao_RL)
    RelativeLayout GeRenZiLiaoRL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xueyuanhuibao;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        SouSuoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao_SouSuo.class);
                startActivity(intent);
            }
        });
        TuPianRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao_TuPian.class);
                startActivity(intent);
            }
        });

        YinShiPinRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao_YinShiPin.class);
                startActivity(intent);
            }
        });

        JianChaBaoGaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao_JianChaBaoGao.class);
                startActivity(intent);
            }
        });

        HuiBaoCaiLiaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao_HuiBaoZiLiao.class);
                startActivity(intent);
            }
        });

        GeRenZiLiaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao_GeRenZiLiao.class);
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
