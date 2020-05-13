package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.CreateOrder_Bean;
import com.hxsoft.ajitai.model.info.CreateOrder_Info;
import com.hxsoft.ajitai.present.A_ChongZhi_Present;
import com.hxsoft.ajitai.present.A_WoDeKeCheng_XuanZeKeCheng_Present;
import com.hxsoft.ajitai.ui.view.A_ChongZhi_View;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_XuanZeKeCheng_View;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.SpUtils;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ChongZhi extends MvpActivity<A_ChongZhi_Present> implements A_ChongZhi_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.QingKong_IV)
    ImageView QingKongIV;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.Jine_ET)
    EditText JineET;
    private Integer goodstype;
    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_chongzhi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        JineET.setFocusable(true);
        JineET.setFocusableInTouchMode(true);
        JineET.requestFocus();
        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (JineET.getText().toString().trim().equals("")) {
                    showMessage(R.string.chongzhitishi);
                    return;
                }

                goodstype=4;
                CreateOrder_Bean createOrder_bean = new CreateOrder_Bean();
                createOrder_bean.setConferUid(Integer.parseInt(SpUtils.getSettingNote(getContext(), DbKeyS.uid)));
                createOrder_bean.setGoodstype(goodstype);
                createOrder_bean.setIsNeedReceipt(0);
                createOrder_bean.setIsFormCart(0);

                CreateOrder_Bean.ProductArrayListBean productArrayListBean = new CreateOrder_Bean.ProductArrayListBean();
                productArrayListBean.setGoodsid("f21b1a0f211e253454f5c632a2e711c7");
                productArrayListBean.setNum(1);
                productArrayListBean.setPrice(Double.parseDouble(JineET.getText().toString()));
                productArrayListBean.setRemark("充值");

                createOrder_bean.setProductArrayList(new ArrayList<CreateOrder_Bean.ProductArrayListBean>());
                createOrder_bean.getProductArrayList().add(productArrayListBean);

                mPresenter.orderCreate(createOrder_bean, getContext());


            }
        });

        QingKongIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JineET.setText("");
            }
        });
    }

    @Override
    protected A_ChongZhi_Present createPresenter() {
        return new A_ChongZhi_Present();
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
    public void orderCreateSuccess(CreateOrder_Info model) {
        if (model == null)
            return;
        if (model.isIsNeedPay()) {
            Intent intent = new Intent(getContext(), A_Activity_ShouYinTai.class);
            intent.putExtra("orderNo", model.getOrderNo());
            intent.putExtra("body", "充值");
            intent.putExtra("price", JineET.getText().toString());
            intent.putExtra("type",goodstype+"");
            startActivity(intent);
        } else {
            showMessage("已下单");
            finish();
        }
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
