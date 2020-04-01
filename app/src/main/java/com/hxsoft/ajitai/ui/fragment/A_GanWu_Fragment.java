package com.hxsoft.ajitai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_FaBuGanWu;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_GuanZhuHaoYou;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_SouSuo;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_ZhuanFa;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GanWu;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_ShiPinZhiBoFenXiang;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_GanWu_Fragment extends MvpFragment {
    @Bind(R.id.WenZhangYueDuLL)
    LinearLayout SouSuoLL;
    @Bind(R.id.HaoYouLL)
    LinearLayout HaoYouLL;
    @Bind(R.id.ShouYeTopRL)
    RelativeLayout ShouYeTopRL;
    @Bind(R.id.GanwuOneLL)
    LinearLayout GanwuOneLL;
    @Bind(R.id.GanwuTwoLL)
    LinearLayout GanwuTwoLL;
    @Bind(R.id.FaBuGanWu_RL)
    RelativeLayout FaBuGanWuRL;

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_ganwu;
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

        ImageView OperateIVOne = (ImageView) GanwuOneLL.findViewById(R.id.OperateIV);
        ImageView OperateIVTwo = (ImageView) GanwuTwoLL.findViewById(R.id.OperateIV);
        LinearLayout ZhuanFa_LL_One = (LinearLayout) GanwuOneLL.findViewById(R.id.ZhuanFa_LL);
        LinearLayout ZhuanFa_LL_Two = (LinearLayout) GanwuTwoLL.findViewById(R.id.ZhuanFa_LL);

        LinearLayout FenXiang_LL_One = (LinearLayout) GanwuOneLL.findViewById(R.id.FenXiang_LL);
        LinearLayout FenXiang_LL_Two = (LinearLayout) GanwuTwoLL.findViewById(R.id.FenXiang_LL);

        FenXiang_LL_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        FenXiang_LL_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        OperateIVOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_GanWu.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });


        OperateIVTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_GanWu.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });

        ZhuanFa_LL_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
                startActivity(intent);
            }
        });
        ZhuanFa_LL_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
                startActivity(intent);
            }
        });

        FaBuGanWuRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_FaBuGanWu.class);
                startActivity(intent);
            }
        });

        SouSuoLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_SouSuo.class);
                startActivity(intent);
            }
        });

        HaoYouLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_GuanZhuHaoYou.class);
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
