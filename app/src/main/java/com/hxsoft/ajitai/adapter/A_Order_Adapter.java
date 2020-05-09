package com.hxsoft.ajitai.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.A_Order_Info;
import com.hxsoft.ajitai.model.info.A_Order_Total_Info;
import com.hxsoft.ajitai.model.info.Order_Info;
import com.hxsoft.ajitai.ui.activity.A_Activity_DingDanXiangQing;
import com.hxsoft.ajitai.ui.activity.A_Activity_ShouYinTai;
import com.hxsoft.ajitai.utils.GlideControl;

import java.util.List;

/**
 * Created by lidengyao on 2016-09-01 0001.
 */
public class A_Order_Adapter extends CommonAdapter<A_Order_Info> {

    private Context _Context;
    private OnCheckControl_dialogClickListener _OnCheckControl_dialogClickListener;

    public A_Order_Adapter(Context context, List<A_Order_Info> data, int itemLayoutId, OnCheckControl_dialogClickListener onCheckControl_dialogClickListener) {
        super(context, data, itemLayoutId);
        _Context = context;
        _OnCheckControl_dialogClickListener = onCheckControl_dialogClickListener;
    }

    @Override
    public void convert(int position, ViewHolder helper, A_Order_Info item) {


        if (item.getProductList().size() > 0) {
            LinearLayout ShangPin_Root = (LinearLayout) helper.getView(R.id.ShangPin_Root);
            ShangPin_Root.removeAllViews();
            for (int i = 0; i < item.getProductList().size(); i++) {
                A_Order_Info.ProductListBean productListBean = item.getProductList().get(i);
                View view = View.inflate(_Context, R.layout.a_item_dingdan_shangpin, null);
                ImageView image_IV = (ImageView) view.findViewById(R.id.image_IV);
                TextView title_TV = (TextView) view.findViewById(R.id.title_TV);
                TextView price_TV = (TextView) view.findViewById(R.id.price_TV);
                TextView num_TV = (TextView) view.findViewById(R.id.num_TV);

                GlideControl.SetImage(_Context, productListBean.getImage(), image_IV, R.mipmap.jiazaiing);
                title_TV.setText(productListBean.getTitle());
                price_TV.setText(productListBean.getPrice() + "");
                num_TV.setText(productListBean.getNum() + "");

                ShangPin_Root.addView(view);
            }
        }

        //0：待付款；1：待发货；2：已发货；3：取消订单；4：支付失败;5:已完成

        TextView status_TV = (TextView) helper.getView(R.id.status_TV);
        TextView payment_TV = (TextView) helper.getView(R.id.payment_TV);
        TextView goodsNum_TV = (TextView) helper.getView(R.id.goodsNum_TV);
        LinearLayout DaiFuKuanLL = (LinearLayout) helper.getView(R.id.DaiFuKuanLL);
        LinearLayout DaiFaHuoLL = (LinearLayout) helper.getView(R.id.DaiFaHuoLL);
        LinearLayout DaiShouHuoLL = (LinearLayout) helper.getView(R.id.DaiShouHuoLL);
        LinearLayout YiWanChengLL = (LinearLayout) helper.getView(R.id.YiWanChengLL);
        LinearLayout DingDan_Root_LL = (LinearLayout) helper.getView(R.id.DingDan_Root_LL);

        payment_TV.setText(item.getPayment() + "");
        goodsNum_TV.setText(item.getGoodsNum() + "");

        //待付款
        if (item.getStatus() == 0) {
            status_TV.setText("待付款");
            DaiFuKuanLL.setVisibility(View.VISIBLE);
            DaiFaHuoLL.setVisibility(View.GONE);
            DaiShouHuoLL.setVisibility(View.GONE);
            YiWanChengLL.setVisibility(View.GONE);

            Button QuXiaoDingDan_Btn = (Button) DaiFuKuanLL.findViewById(R.id.QuXiaoDingDan_Btn);
            Button FuKuan_Btn = (Button) DaiFuKuanLL.findViewById(R.id.FuKuan_Btn);

            FuKuan_Btn.setTag(R.id.one, item);
            FuKuan_Btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    A_Order_Info a_order_info = (A_Order_Info) v.getTag(R.id.one);

                    String body = "";
                    for (int i = 0; i < a_order_info.getProductList().size(); i++) {
                        body += a_order_info.getProductList().get(i).getTitle();
                    }

                    Intent intent = new Intent(_Context, A_Activity_ShouYinTai.class);
                    intent.putExtra("orderNo", a_order_info.getOrderNo());
                    intent.putExtra("body", body);
                    _Context.startActivity(intent);
                }
            });

            QuXiaoDingDan_Btn.setTag(R.id.one, item);
            QuXiaoDingDan_Btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    A_Order_Info a_order_info = (A_Order_Info) v.getTag(R.id.one);
                    _OnCheckControl_dialogClickListener.OnClick(3, a_order_info.getOrderNo());
                }
            });
        }

        //待发货
        if (item.getStatus() == 1) {
            status_TV.setText("待发货");
            DaiFuKuanLL.setVisibility(View.GONE);
            DaiFaHuoLL.setVisibility(View.VISIBLE);
            DaiShouHuoLL.setVisibility(View.GONE);
            YiWanChengLL.setVisibility(View.GONE);
        }

        //待收货
        if (item.getStatus() == 2) {
            status_TV.setText("待收货");
            DaiFuKuanLL.setVisibility(View.GONE);
            DaiFaHuoLL.setVisibility(View.GONE);
            DaiShouHuoLL.setVisibility(View.VISIBLE);
            YiWanChengLL.setVisibility(View.GONE);
        }

        //已取消
        if (item.getStatus() == 3) {
            status_TV.setText("交易关闭");
            DaiFuKuanLL.setVisibility(View.INVISIBLE);
            DaiFaHuoLL.setVisibility(View.GONE);
            DaiShouHuoLL.setVisibility(View.GONE);
            YiWanChengLL.setVisibility(View.GONE);
        }

        //已完成
        if (item.getStatus() == 5) {
            status_TV.setText("已完成");
            DaiFuKuanLL.setVisibility(View.GONE);
            DaiFaHuoLL.setVisibility(View.GONE);
            DaiShouHuoLL.setVisibility(View.GONE);
            YiWanChengLL.setVisibility(View.VISIBLE);
        }
        DingDan_Root_LL.setTag(R.id.one, item);
        DingDan_Root_LL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A_Order_Info recordsBean = (A_Order_Info) v.getTag(R.id.one);
                Intent intent = new Intent(_Context, A_Activity_DingDanXiangQing.class);
                intent.putExtra("orderNo", recordsBean.getOrderNo());
                _Context.startActivity(intent);
            }
        });

//        ImageView Tip_IV = (ImageView) helper.getView(R.id.Tip_IV);
//        if (item.getIsdefault() == 1) {
//            Tip_IV.setImageResource(R.mipmap.a_shoucang_juse);
//            helper.setText(R.id.FirstCharacter_TV, "默");
//        }
//        if (item.getIsdefault() == 0) {
//            Tip_IV.setImageResource(R.mipmap.a_shouhuodizhi_touxiang);
//            if (item.getUsername().length() > 0) {
//                helper.setText(R.id.FirstCharacter_TV, item.getUsername().substring(0, 1));
//            }
//        }
//
//        helper.setText(R.id.username_TV, item.getUsername());
//        helper.setText(R.id.phone_TV, item.getPhone());
//        helper.setText(R.id.address_TV, item.getAddress());

    }

    public interface OnCheckControl_dialogClickListener {
        void OnClick(int type, String orderNo);
    }

}
