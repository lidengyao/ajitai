package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.present.LoginPresent;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_QueRenDingDan extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.A_Next_IV)
    ImageView ANextIV;
    @Bind(R.id.Price_LL)
    LinearLayout PriceLL;
    @Bind(R.id.textView)
    TextView textView;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.FaPiaoRL)
    RelativeLayout FaPiaoRL;
    @Bind(R.id.DiZhi_RL)
    RelativeLayout DiZhiRL;
    @Bind(R.id.username_TV)
    TextView usernameTV;
    @Bind(R.id.phone_TV)
    TextView phoneTV;
    @Bind(R.id.address_TV)
    TextView addressTV;
    private String orderNo;
    private String body;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_querendingdan;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        orderNo=getIntent().getStringExtra("orderNo");
        body=getIntent().getStringExtra("body");
        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShouYinTai.class);
                intent.putExtra("orderNo", orderNo);
                intent.putExtra("body", body);
                startActivity(intent);
            }
        });

        FaPiaoRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_QueRenDingDan_FaPiao.class);
                startActivity(intent);
            }
        });

        DiZhiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XuanZe_ShouHuoDiZhi.class);
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            if (data != null) {
                Cuseraddress_Info.RecordsBean recordsBean = (Cuseraddress_Info.RecordsBean) data.getSerializableExtra("RecordsBean");
                usernameTV.setText(recordsBean.getUsername());
                phoneTV.setText(recordsBean.getPhone());
                addressTV.setText(recordsBean.getAddress());
            }

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
