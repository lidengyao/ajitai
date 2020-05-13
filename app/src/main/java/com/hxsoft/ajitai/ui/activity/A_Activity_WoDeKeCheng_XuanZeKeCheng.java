package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.RecyclerViewAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.CreateOrder_Bean;
import com.hxsoft.ajitai.model.info.CreateOrder_Info;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.present.A_WoDeKeCheng_Present;
import com.hxsoft.ajitai.present.A_WoDeKeCheng_XuanZeKeCheng_Present;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_View;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_XuanZeKeCheng_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GouMaiKeCheng_QueRen;
import com.hxsoft.ajitai.utils.DbKeyS;
import com.hxsoft.ajitai.utils.SpUtils;
import com.hxsoft.ajitai.widget.PullLoadMoreRecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.hutool.db.Db;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WoDeKeCheng_XuanZeKeCheng extends MvpActivity<A_WoDeKeCheng_XuanZeKeCheng_Present> implements A_WoDeKeCheng_XuanZeKeCheng_View {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.pullLoadMoreRecyclerView)
    PullLoadMoreRecyclerView pullLoadMoreRecyclerView;
    @Bind(R.id.QuXiao_TV)
    TextView QuXiaoTV;
    @Bind(R.id.QueDing_TV)
    TextView QueDingTV;
    @Bind(R.id.Bottom_LL)
    LinearLayout BottomLL;
    private Integer page = 1;
    private Integer size = 10;
    private String title;
    private String price;
    private String goodsid;
    private Integer goodstype;


    private View checkKeChengView;

    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_wodekecheng_xuanzekecheng;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);


        QuXiaoTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        QueDingTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(title)) {
                    showMessage(R.string.qingxuanzekecheng);
                    return;
                }
                CheckControl_Dialog_GouMaiKeCheng_QueRen.ShowDialog(getContext(), getActivity(), price, title, new CheckControl_Dialog_GouMaiKeCheng_QueRen.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {
                        if (type == 1) {

                            CreateOrder_Bean createOrder_bean = new CreateOrder_Bean();
                            createOrder_bean.setConferUid(Integer.parseInt(SpUtils.getSettingNote(getContext(), DbKeyS.uid)));
                            createOrder_bean.setGoodstype(goodstype);
                            createOrder_bean.setIsNeedReceipt(0);
                            createOrder_bean.setIsFormCart(0);

                            CreateOrder_Bean.ProductArrayListBean productArrayListBean = new CreateOrder_Bean.ProductArrayListBean();
                            productArrayListBean.setGoodsid(goodsid);
                            productArrayListBean.setNum(1);
                            productArrayListBean.setRemark("");

                            createOrder_bean.setProductArrayList(new ArrayList<CreateOrder_Bean.ProductArrayListBean>());
                            createOrder_bean.getProductArrayList().add(productArrayListBean);

                            mPresenter.orderCreate(createOrder_bean, getContext());
                        }

                    }
                });
            }
        });

        //mPullLoadMoreRecyclerView.setRefreshing(true);
        pullLoadMoreRecyclerView.setGridLayout(2);
        mRecyclerViewAdapter = new RecyclerViewAdapter(getActivity(), new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void OnClick(View view, KeCheng_Info keCheng_info) {
                if (checkKeChengView == null) {

                } else {
                    TextView price_TV = (TextView) checkKeChengView.findViewById(R.id.price_TV);
                    TextView goodsname_TV = (TextView) checkKeChengView.findViewById(R.id.goodsname_TV);

                    price_TV.setTextColor(getResources().getColor(R.color.C808080));
                    goodsname_TV.setTextColor(getResources().getColor(R.color.C808080));

                    checkKeChengView.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffffff_4_line_shape));

                }
                view.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));
                TextView price_TV = (TextView) view.findViewById(R.id.price_TV);
                TextView goodsname_TV = (TextView) view.findViewById(R.id.goodsname_TV);

                price_TV.setTextColor(getResources().getColor(R.color.C242424));
                goodsname_TV.setTextColor(getResources().getColor(R.color.C242424));

                title = keCheng_info.getGoodsname();
                price = keCheng_info.getPrice() + "";
                goodstype = keCheng_info.getGoodstype();
                goodsid = keCheng_info.getGoodsid();
                checkKeChengView = view;
            }
        });
        pullLoadMoreRecyclerView.setAdapter(mRecyclerViewAdapter);
        pullLoadMoreRecyclerView.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {
                mRecyclerViewAdapter.clearData();
                page = 0;
                getData();
            }

            @Override
            public void onLoadMore() {
                page = page + 1;
                getData();
            }
        });

        getData();
    }

    private void getData() {
        mPresenter.goodsCgoodsCourselist(getContext());
    }


    @Override
    protected A_WoDeKeCheng_XuanZeKeCheng_Present createPresenter() {
        return new A_WoDeKeCheng_XuanZeKeCheng_Present();
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
    public void goodsCgoodsCourselistSuccess(ArrayList<KeCheng_Info> model) {
        if (model == null)
            return;
        mRecyclerViewAdapter.addAllData(model);
        pullLoadMoreRecyclerView.setPullLoadMoreCompleted();

    }

    @Override
    public void orderCreateSuccess(CreateOrder_Info model) {
        if (model == null)
            return;
        if (model.isIsNeedPay()) {
            Intent intent = new Intent(getContext(), A_Activity_ShouYinTai.class);
            intent.putExtra("orderNo", model.getOrderNo());
            intent.putExtra("body", title);
            intent.putExtra("price", price);
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
