package com.hxsoft.ajitai.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XinLingXiangYue_XiangQing extends MvpActivity {


    @Bind(R.id.MySL)
    ScrollView MySL;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.HeadToolbar)
    Toolbar HeadToolbar;
    @Bind(R.id.BackIV)
    ImageView BackIV;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinlingxiangyue_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        HeadToolbar.getBackground().setAlpha(0);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            MySL.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                    if (scrollY > 180 || scrollY < 0) {
                        HeadToolbar.getBackground().setAlpha(255);
                        SysNameIV.setVisibility(View.VISIBLE);
                        BackIV.setImageResource(R.mipmap.fanhui);
                    } else {
                        Integer alpha = (scrollY * 255) / 180;
                        HeadToolbar.getBackground().setAlpha(alpha);
                        SysNameIV.setVisibility(View.GONE);
                        BackIV.setImageResource(R.mipmap.back_white);
                    }
                }
            });
        }
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
