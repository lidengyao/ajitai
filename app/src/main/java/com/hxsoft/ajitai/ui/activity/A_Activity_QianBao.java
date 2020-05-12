package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.QianBao_Info;
import com.hxsoft.ajitai.present.A_QianBao_Present;
import com.hxsoft.ajitai.ui.view.A_QianBao_View;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_QianBao extends MvpActivity<A_QianBao_Present> implements A_QianBao_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.ChongZhi_RL)
    RelativeLayout ChongZhiRL;
    @Bind(R.id.DingDan_RL)
    RelativeLayout DingDanRL;
    @Bind(R.id.ChongZhi_HaoYou_RL)
    RelativeLayout ChongZhiHaoYouRL;
    @Bind(R.id.ZhangDan_RL)
    RelativeLayout ZhangDanRL;
    @Bind(R.id.BalanceTV)
    TextView BalanceTV;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_qianbao;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        DingDanRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeDingDan.class);
                startActivity(intent);
            }
        });

        ChongZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ChongZhi.class);
                startActivity(intent);
            }
        });
        ChongZhiHaoYouRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ChongZhi_HaoYou.class);
                startActivity(intent);
            }
        });

        ZhangDanRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_ZhangDan_Activity.class);
                startActivity(intent);
            }
        });

        getBalanceData();

    }

    private void getBalanceData() {
        mPresenter.ajitaipayQueryBalance(getContext());
    }

    @Override
    protected A_QianBao_Present createPresenter() {
        return new A_QianBao_Present();
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


    @Override
    public void ajitaipayQueryBalanceSuccess(Double model) {
        if (model == null)
            return;

        BalanceTV.setText("¥" + model);
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
