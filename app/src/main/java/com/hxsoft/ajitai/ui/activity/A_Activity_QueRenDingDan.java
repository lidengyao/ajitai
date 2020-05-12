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
import com.hxsoft.ajitai.model.info.Cuseraddress_Total_Info;
import com.hxsoft.ajitai.present.A_QueRenDingDan_Present;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.view.A_QueRenDingDan_View;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_QueRenDingDan extends MvpActivity<A_QueRenDingDan_Present> implements A_QueRenDingDan_View {


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
    private String price;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_querendingdan;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        orderNo = getIntent().getStringExtra("orderNo");
        body = getIntent().getStringExtra("body");
        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_ShouYinTai.class);
                intent.putExtra("orderNo", orderNo);
                intent.putExtra("body", body);
                intent.putExtra("price", price);
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

        getAdminCuseraddressDefaultbyperson();
    }

    private void getAdminCuseraddressDefaultbyperson() {
        mPresenter.adminCuseraddressDefaultbyperson(getContext());
    }

    @Override
    protected A_QueRenDingDan_Present createPresenter() {
        return new A_QueRenDingDan_Present();
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
    public void adminCuseraddressDefaultbypersonSuccess(Cuseraddress_Info model) {
        if (model == null)
            return;
        usernameTV.setText(model.getUsername());
        phoneTV.setText(model.getPhone());
        addressTV.setText(model.getAddress());

    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
