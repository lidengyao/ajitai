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

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ShouYinTai extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.QianBaoRL)
    RelativeLayout QianBaoRL;
    @Bind(R.id.WeiXinRL)
    RelativeLayout WeiXinRL;
    @Bind(R.id.ZhiFuBaoRL)
    RelativeLayout ZhiFuBaoRL;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.QianBao_IV)
    ImageView QianBaoIV;
    @Bind(R.id.WeiXin_IV)
    ImageView WeiXinIV;
    @Bind(R.id.ZhiFuBao_IV)
    ImageView ZhiFuBaoIV;

    private int zhifuType = 0;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_shouyintai;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        QianBaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QianBaoIV.setImageResource(R.mipmap.a_chongzhi_xuanzhong);
                WeiXinIV.setImageResource(R.mipmap.a_chongzhi_weixuanzhong);
                ZhiFuBaoIV.setImageResource(R.mipmap.a_chongzhi_weixuanzhong);
                zhifuType = 0;

            }
        });


        WeiXinRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QianBaoIV.setImageResource(R.mipmap.a_chongzhi_weixuanzhong);
                WeiXinIV.setImageResource(R.mipmap.a_chongzhi_xuanzhong);
                ZhiFuBaoIV.setImageResource(R.mipmap.a_chongzhi_weixuanzhong);
                zhifuType = 1;
            }
        });


        ZhiFuBaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QianBaoIV.setImageResource(R.mipmap.a_chongzhi_weixuanzhong);
                WeiXinIV.setImageResource(R.mipmap.a_chongzhi_weixuanzhong);
                ZhiFuBaoIV.setImageResource(R.mipmap.a_chongzhi_xuanzhong);
                zhifuType = 2;
            }
        });

        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //钱包
                if (zhifuType == 0) {

                }

                //微信
                if (zhifuType == 1) {

                }

                //支付宝
                if (zhifuType == 2) {

                }
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
