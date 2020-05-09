package com.hxsoft.ajitai.ui.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.A_Order_Info;
import com.hxsoft.ajitai.present.A_DingDanXiangQing_Present;
import com.hxsoft.ajitai.ui.view.A_DingDanXiangQing_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_QuXiaoDingDan;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_DingDanXiangQing extends MvpActivity<A_DingDanXiangQing_Present> implements A_DingDanXiangQing_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.status_TV)
    TextView statusTV;
    @Bind(R.id.shippingReceiverName_TV)
    TextView shippingReceiverNameTV;
    @Bind(R.id.shippingReceiverMobile_TV)
    TextView shippingReceiverMobileTV;
    @Bind(R.id.shippingReceiverAddress_TV)
    TextView shippingReceiverAddressTV;
    @Bind(R.id.status_one_TV)
    TextView statusOneTV;
    @Bind(R.id.productList_LL)
    LinearLayout productListLL;
    @Bind(R.id.payment_TV)
    TextView paymentTV;
    @Bind(R.id.payment_one_TV)
    TextView paymentOneTV;
    @Bind(R.id.orderNo_TV)
    TextView orderNoTV;
    @Bind(R.id.createTime_TV)
    TextView createTimeTV;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.QuXiaoDingDan_Btn)
    Button QuXiaoDingDanBtn;
    @Bind(R.id.FuKuan_Btn)
    Button FuKuanBtn;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_dingdanxiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        String orderNo = getIntent().getStringExtra("orderNo");

        QuXiaoDingDanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("提示").setMessage("确定取消当前订单吗").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        mPresenter.orderCannel(orderNo, getContext());
                    }
                }).show();

//                CheckControl_Dialog_QuXiaoDingDan.ShowDialog(getContext(), getActivity(), new CheckControl_Dialog_QuXiaoDingDan.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });

            }
        });
        mPresenter.orderQuery(orderNo, getContext());


    }


    @Override
    protected A_DingDanXiangQing_Present createPresenter() {
        return new A_DingDanXiangQing_Present();
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
    public void orderQuerySuccess(A_Order_Info model) {
        productListLL.removeAllViews();
        if (model == null)
            return;

        if (model.getProductList().size() > 0) {

            for (int i = 0; i < model.getProductList().size(); i++) {
                A_Order_Info.ProductListBean productListBean = model.getProductList().get(i);
                View view = View.inflate(getContext(), R.layout.a_item_dingdan_shangpin, null);
                ImageView image_IV = (ImageView) view.findViewById(R.id.image_IV);
                TextView title_TV = (TextView) view.findViewById(R.id.title_TV);
                TextView price_TV = (TextView) view.findViewById(R.id.price_TV);
                TextView num_TV = (TextView) view.findViewById(R.id.num_TV);

                GlideControl.SetImage(getContext(), productListBean.getImage(), image_IV, R.mipmap.jiazaiing);
                title_TV.setText(productListBean.getTitle());
                price_TV.setText(productListBean.getPrice() + "");
                num_TV.setText(productListBean.getNum() + "");

                productListLL.addView(view);
            }
        }

        //待付款
        if (model.getStatus() == 0) {
            statusTV.setText("待付款");
            statusOneTV.setText("待付款");
        }

        //待发货
        if (model.getStatus() == 1) {
            statusTV.setText("待发货");
            statusOneTV.setText("待发货");
        }

        //待收货
        if (model.getStatus() == 2) {
            statusTV.setText("待收货");
            statusOneTV.setText("待收货");
        }

        //订单取消
        if (model.getStatus() == 3) {
            statusTV.setText("交易关闭");
            statusOneTV.setText("交易关闭");
            BottomLL.setVisibility(View.GONE);
        }

        //已完成
        if (model.getStatus() == 5) {
            statusTV.setText("已完成");
            statusOneTV.setText("已完成");
        }

        shippingReceiverNameTV.setText(model.getShippingReceiverName());
        shippingReceiverMobileTV.setText(model.getShippingReceiverMobile());
        shippingReceiverAddressTV.setText(model.getShippingReceiverAddress());
        paymentTV.setText(model.getPayment() + "");
        paymentOneTV.setText(model.getPayment() + "");
        orderNoTV.setText(model.getOrderNo());
        createTimeTV.setText(model.getCreateTime());


    }

    @Override
    public void orderCannelSuccess(String model) {
        showMessage("取消成功");
        finish();
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
