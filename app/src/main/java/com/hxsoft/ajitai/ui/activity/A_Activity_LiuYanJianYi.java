package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_LiuYanJianYi_Operate;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_LiuYanJianYi extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.LiuYan1_LL)
    LinearLayout LiuYan1LL;
    @Bind(R.id.LiuYan2_LL)
    LinearLayout LiuYan2LL;
    @Bind(R.id.FaBu_Btn)
    Button FaBuBtn;
    @Bind(R.id.BottomLL)
    RelativeLayout BottomLL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_liuyanjianyi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        LiuYan1LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_LiuYanFanKui.class);
                startActivity(intent);
            }
        });


        LiuYan2LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_LiuYanFanKui.class);
                startActivity(intent);
            }
        });


        LiuYan1LL.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                CheckControl_Dialog_LiuYanJianYi_Operate.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_LiuYanJianYi_Operate.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
                return false;
            }
        });

        LiuYan2LL.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                CheckControl_Dialog_LiuYanJianYi_Operate.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_LiuYanJianYi_Operate.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
                return false;
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
