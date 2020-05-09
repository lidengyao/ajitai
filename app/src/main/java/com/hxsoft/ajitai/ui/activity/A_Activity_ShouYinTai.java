package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.A_ShouYinTai_Present;
import com.hxsoft.ajitai.ui.view.A_ShouYinTai_View;
import com.hxsoft.ajitai.wxapi.WXAPI;

import java.io.Serializable;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ShouYinTai extends MvpActivity<A_ShouYinTai_Present> implements A_ShouYinTai_View {


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

    private int zhifuType = 1;
    private String orderNo;
    private String body;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_shouyintai;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        orderNo = getIntent().getStringExtra("orderNo");
        body = getIntent().getStringExtra("body");
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
                    mPresenter.wxPayAppPay(orderNo, body, getContext());
                }

                //支付宝
                if (zhifuType == 2) {

                }
            }
        });
    }

    @Override
    protected A_ShouYinTai_Present createPresenter() {
        return new A_ShouYinTai_Present();
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


    @Override
    public void wxPayAppPaySuccess(String model) {
        if (model == null || model.equals(""))
            return;

        String wx = model.replace("\\", "");
        Gson gsonZU = new Gson();
        WxPay wxPay = gsonZU.fromJson(wx, WxPay.class);
        WXAPI.WXPay(wxPay.getAppid(), wxPay.getPartnerid(), wxPay.getPrepayid(),
                wxPay.getNoncestr(), wxPay.getTimestamp(), wxPay.getPackageX(), wxPay.getSign());

    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }

    public class WxPay implements Serializable {

        /**
         * package : Sign=WXPay
         * appid : wxa5cad93b1a90dff5
         * sign : B6A950D1F8B610C43920A9AE84875E2DEF44654287E94D29F297A985DC7E52E4
         * partnerid : 1410900002
         * prepayid : wx09193427058908a0c9f82e3a1928039800
         * noncestr : 1589024067086
         * timestamp : 1589024067
         */

        @SerializedName("package")
        private String packageX;
        private String appid;
        private String sign;
        private String partnerid;
        private String prepayid;
        private String noncestr;
        private String timestamp;

        public String getPackageX() {
            return packageX;
        }

        public void setPackageX(String packageX) {
            this.packageX = packageX;
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getPartnerid() {
            return partnerid;
        }

        public void setPartnerid(String partnerid) {
            this.partnerid = partnerid;
        }

        public String getPrepayid() {
            return prepayid;
        }

        public void setPrepayid(String prepayid) {
            this.prepayid = prepayid;
        }

        public String getNoncestr() {
            return noncestr;
        }

        public void setNoncestr(String noncestr) {
            this.noncestr = noncestr;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }
}
