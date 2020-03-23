package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.utils.GlideControl;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ZhiBo extends MvpActivity {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.IncludeLL1)
    LinearLayout IncludeLL1;
    @Bind(R.id.IncludeLL2)
    LinearLayout IncludeLL2;
    @Bind(R.id.IncludeLL3)
    LinearLayout IncludeLL3;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_zhibo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ImageView imageView1 = (ImageView) IncludeLL1.findViewById(R.id.zhibo_item_bg);
        ImageView imageView2 = (ImageView) IncludeLL2.findViewById(R.id.zhibo_item_bg);
        ImageView imageView3 = (ImageView) IncludeLL3.findViewById(R.id.zhibo_item_bg);

        GlideControl.SetFilletImage(getContext(), "http://47.92.221.41/image/a_ditu3.png", imageView1, R.mipmap.jiazaiing, 5);
        GlideControl.SetFilletImage(getContext(), "http://47.92.221.41/image/a_ditu3.png", imageView2, R.mipmap.jiazaiing, 5);
        GlideControl.SetFilletImage(getContext(), "http://47.92.221.41/image/a_ditu3.png", imageView3, R.mipmap.jiazaiing, 5);

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
