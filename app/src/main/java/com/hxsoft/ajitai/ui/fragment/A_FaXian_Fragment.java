package com.hxsoft.ajitai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.ui.activity.A_Activity_DuShuHui;
import com.hxsoft.ajitai.ui.activity.A_Activity_LianMengYiYuan;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShangCheng;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinLingXiangYue;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinYuanQiang;
import com.hxsoft.ajitai.ui.activity.A_Activity_XueYuanHuiBao;
import com.hxsoft.ajitai.ui.activity.A_Activity_YangShengGuan;
import com.hxsoft.ajitai.ui.activity.A_Activity_YinPinZhiBo;
import com.hxsoft.ajitai.ui.activity.A_Activity_YinYue;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_FaXian_Fragment extends MvpFragment {


    @Bind(R.id.LeftLL)
    LinearLayout LeftLL;
    @Bind(R.id.RightLL)
    LinearLayout RightLL;
    @Bind(R.id.ShouYeTopRL)
    RelativeLayout ShouYeTopRL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.DuShuHuiRL)
    RelativeLayout DuShuHuiRL;
    @Bind(R.id.ShangChengLL)
    LinearLayout ShangChengLL;
    @Bind(R.id.TuiJiangRL)
    RelativeLayout TuiJiangRL;
    @Bind(R.id.XinLingXiangYueRL)
    RelativeLayout XinLingXiangYueRL;
    @Bind(R.id.XueYuanHuiBaoLL)
    LinearLayout XueYuanHuiBaoLL;
    @Bind(R.id.YangShengLL)
    LinearLayout YangShengLL;
    @Bind(R.id.YinPinZhiBoLL)
    LinearLayout YinPinZhiBoLL;
    @Bind(R.id.YinYueLL)
    LinearLayout YinYueLL;
    @Bind(R.id.LianMengYiYuanLL)
    LinearLayout LianMengYiYuanLL;
    @Bind(R.id.XinYuanQiangLL)
    LinearLayout XinYuanQiangLL;

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_faxian;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DuShuHuiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_DuShuHui.class);
                startActivity(intent);
            }
        });

        ShangChengLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShangCheng.class);
                startActivity(intent);
            }
        });

        TuiJiangRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShangCheng.class);
                startActivity(intent);
            }
        });

        XinLingXiangYueRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue.class);
                startActivity(intent);
            }
        });

        XueYuanHuiBaoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XueYuanHuiBao.class);
                startActivity(intent);
            }
        });
        YangShengLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_YangShengGuan.class);
                startActivity(intent);
            }
        });

        YinPinZhiBoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_YinPinZhiBo.class);
                startActivity(intent);
            }
        });

        YinYueLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_YinYue.class);
                startActivity(intent);
            }
        });

        LianMengYiYuanLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_LianMengYiYuan.class);
                startActivity(intent);
            }
        });

        XinYuanQiangLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinYuanQiang.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
