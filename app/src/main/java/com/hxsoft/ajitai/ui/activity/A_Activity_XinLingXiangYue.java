package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.utils.GlideControl;

import butterknife.Bind;
import butterknife.ButterKnife;
import okhttp3.internal.Internal;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XinLingXiangYue extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.HuoDongLL1)
    LinearLayout HuoDongLL1;
    @Bind(R.id.HuoDongLL2)
    LinearLayout HuoDongLL2;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinlingxiangyue;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        String imgUrl1 = "http://47.92.221.41/image/xinlingxiangyue1.png";
        String imgUrl2 = "http://47.92.221.41/image/xinlingxiangyue2.png";

        ImageView imageView1 = (ImageView) HuoDongLL1.findViewById(R.id.zhibo_item_bg);
        ImageView imageView2 = (ImageView) HuoDongLL2.findViewById(R.id.zhibo_item_bg);
        GlideControl.SetFilletImage(getContext(), imgUrl1, imageView1, R.mipmap.jiazaiing, 10);
        GlideControl.SetFilletImage(getContext(), imgUrl2, imageView2, R.mipmap.jiazaiing, 10);

        HuoDongLL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue_XiangQing.class);
                startActivity(intent);
            }
        });
        HuoDongLL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinLingXiangYue_XiangQing.class);
                startActivity(intent);
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
