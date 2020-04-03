package com.hxsoft.ajitai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.ui.activity.A_Activity_ChengJiDan;
import com.hxsoft.ajitai.ui.activity.A_Activity_GeRenXinXi;
import com.hxsoft.ajitai.ui.activity.A_Activity_GouWuChe;
import com.hxsoft.ajitai.ui.activity.A_Activity_LiuYanJianYi;
import com.hxsoft.ajitai.ui.activity.A_Activity_QianBao;
import com.hxsoft.ajitai.ui.activity.A_Activity_SheZhi;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeFenSi;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeGuanZhu;
import com.hxsoft.ajitai.ui.activity.A_Activity_WoDeShouCang;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_WoDe_Fragment extends MvpFragment {
    @Bind(R.id.QianBaoRL)
    RelativeLayout QianBaoRL;
    @Bind(R.id.ChengJiDan_RL)
    RelativeLayout ChengJiDanRL;
    @Bind(R.id.GeRenXinXi_LL)
    LinearLayout GeRenXinXiLL;
    @Bind(R.id.SheZhi_RL)
    RelativeLayout SheZhiRL;
    @Bind(R.id.FenSi_LL)
    LinearLayout FenSiLL;
    @Bind(R.id.GuanZhu_LL)
    LinearLayout GuanZhuLL;
    @Bind(R.id.ShouCang_LL)
    LinearLayout ShouCangLL;
    @Bind(R.id.LiuYanJianYi_RL)
    RelativeLayout LiuYanJianYiRL;
    @Bind(R.id.GouWuChe_RL)
    RelativeLayout GouWuCheRL;

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_wode;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        GouWuCheRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GouWuChe.class);
                startActivity(intent);
            }
        });
        LiuYanJianYiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_LiuYanJianYi.class);
                startActivity(intent);
            }
        });
        ShouCangLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeShouCang.class);
                startActivity(intent);
            }
        });

        GuanZhuLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeGuanZhu.class);
                startActivity(intent);
            }
        });

        FenSiLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeFenSi.class);
                startActivity(intent);
            }
        });
        SheZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_SheZhi.class);
                startActivity(intent);
            }
        });

        GeRenXinXiLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GeRenXinXi.class);
                startActivity(intent);
            }
        });
        QianBaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_QianBao.class);
                startActivity(intent);
            }
        });

        ChengJiDanRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ChengJiDan.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
