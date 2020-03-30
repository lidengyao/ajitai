package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_DuShuiHui_GanWu_FenXiang;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_ShiPinZhiBoFenXiang;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XinLingGanLu extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.GengDuoRL)
    RelativeLayout GengDuoRL;
    @Bind(R.id.FaBuGanWu_RL)
    RelativeLayout FaBuGanWuRL;
    @Bind(R.id.GanWuLLOne_LL)
    LinearLayout GanWuLLOneLL;
    @Bind(R.id.GanWuLLTwo_LL)
    LinearLayout GanWuLLTwoLL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinlingganlu;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        GengDuoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinLingGanLu_JianJie.class);
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

        LinearLayout PingLun_LL_One = (LinearLayout) GanWuLLOneLL.findViewById(R.id.PingLun_LL);
        LinearLayout PingLun_LL_Two = (LinearLayout) GanWuLLTwoLL.findViewById(R.id.PingLun_LL);
        PingLun_LL_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_DuShuHui_PingLun.class);
                startActivity(intent);
            }
        });

        PingLun_LL_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_DuShuHui_PingLun.class);
                startActivity(intent);
            }
        });

        LinearLayout FenXiang_LL_One = (LinearLayout) GanWuLLOneLL.findViewById(R.id.FenXiang_LL);
        LinearLayout FenXiang_LL_Two = (LinearLayout) GanWuLLTwoLL.findViewById(R.id.FenXiang_LL);
        FenXiang_LL_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_DuShuiHui_GanWu_FenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_DuShuiHui_GanWu_FenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
        FenXiang_LL_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_DuShuiHui_GanWu_FenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_DuShuiHui_GanWu_FenXiang.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
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
