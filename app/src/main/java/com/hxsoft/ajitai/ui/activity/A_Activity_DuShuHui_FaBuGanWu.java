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
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_FaBuGanWu_YuYin;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_DuShuHui_FaBuGanWu extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.YuYin_IV)
    ImageView YuYinIV;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.LuYinIngRL)
    RelativeLayout LuYinIngRL;
    @Bind(R.id.GuanBiLuYin_IV)
    ImageView GuanBiLuYinIV;
    @Bind(R.id.BoFang_IV)
    ImageView BoFangIV;
    @Bind(R.id.ShiJian_TV)
    TextView ShiJianTV;
    @Bind(R.id.WanChengLuYin_RL)
    RelativeLayout WanChengLuYinRL;
    @Bind(R.id.WanCheng_TV)
    TextView WanChengTV;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_dushuhui_fabuganwu;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        YuYinIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_FaBuGanWu_YuYin.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_FaBuGanWu_YuYin.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {
                        if (type == 1) {
                            LuYinIngRL.setVisibility(View.VISIBLE);
                            YuYinIV.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        GuanBiLuYinIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LuYinIngRL.setVisibility(View.GONE);
                YuYinIV.setVisibility(View.VISIBLE);
            }
        });

        WanChengTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("正常上传录音");
                LuYinIngRL.setVisibility(View.GONE);
                WanChengLuYinRL.setVisibility(View.VISIBLE);
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
