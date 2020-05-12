package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GouMaiKeCheng_QueRen;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ChongZhi extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.QingKong_IV)
    ImageView QingKongIV;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_chongzhi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                CheckControl_Dialog_GouMaiKeCheng_QueRen.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GouMaiKeCheng_QueRen.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
            }
        });
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
