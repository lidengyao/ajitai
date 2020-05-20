package com.hxsoft.ajitai.ui.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.utils.VideoControl;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.jzvd.JzvdStd;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_Vedio extends MvpActivity {


    @Bind(R.id.jz_video)
    JzvdStd jzVideo;
    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_vedio;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);


        String url = getIntent().getStringExtra("url");

        jzVideo.setUp(url, "");
        jzVideo.startVideo();
        Bitmap bitmap = VideoControl.getNetVideoBitmap(url);

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
