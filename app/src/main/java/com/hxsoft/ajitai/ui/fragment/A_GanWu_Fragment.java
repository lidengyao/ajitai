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
import com.hxsoft.ajitai.ui.activity.A_Activity_FaBuGanWu;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GanWu;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_GanWu_Fragment extends MvpFragment {
    @Bind(R.id.LeftLL)
    LinearLayout LeftLL;
    @Bind(R.id.RightLL)
    LinearLayout RightLL;
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



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
