package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_ShouHuoDiZhi_Adapter;
import com.hxsoft.ajitai.adapter.A_WenZhang_Adapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Heartnectar_Info;
import com.hxsoft.ajitai.model.info.WenZhang_Total_Info;
import com.hxsoft.ajitai.model.info.YiJiType_Info;
import com.hxsoft.ajitai.present.A_WenZhangYueDu_Present;
import com.hxsoft.ajitai.ui.view.A_WenZhangYueDu_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.utils.YiJiCaiDan_Popwindow;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_FaXian_WenZhangYueDu extends MvpActivity<A_WenZhangYueDu_Present> implements A_WenZhangYueDu_View {


    @Bind(R.id.Back_LL)
    LinearLayout BackLL;
    @Bind(R.id.ShaiXuan_RL)
    RelativeLayout ShaiXuanRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;

    private int page = 1;
    private int size = 10;
    private A_WenZhang_Adapter adapter;
    private ArrayList<Heartnectar_Info> infoArrayList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_faxian_wenzhangyuedu;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ShaiXuanRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("全部类型");
                arrayList.add("健康旅游");
                arrayList.add("心灵甘露");
                arrayList.add("心灵相约");
                arrayList.add("报道");
                arrayList.add("学科介绍");
                arrayList.add("内蒙古蒙药股份有限公司");
                arrayList.add("额尔顿");
                arrayList.add("鄂托克前旗阿吉泰养生园");
                arrayList.add("西乌旗阿吉泰养生园");
                arrayList.add("大讲堂");
                arrayList.add("统计报道");
                arrayList.add("数据统计");
                arrayList.add("有奖征集");
                arrayList.add("招聘");


                ArrayList<YiJiType_Info> model = new ArrayList<>();
                for (int i = 0; i < arrayList.size(); i++) {
                    YiJiType_Info yiJiType_info = new YiJiType_Info();
                    yiJiType_info.setName(arrayList.get(i));
                    model.add(yiJiType_info);
                }

                YiJiCaiDan_Popwindow qrsType_popwindow = new YiJiCaiDan_Popwindow(getContext(), getActivity(), model);

            }
        });

        adapter = new A_WenZhang_Adapter(getContext(), infoArrayList, R.layout.a_item_wenzhang, 0);

        DataListView.setAdapter(adapter);
        DataListView.setOnPullLoadMoreListener(new PullLoadMoreListView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

                page = 1;
                getData();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);

            }

            @Override
            public void onLoadMore() {
                page += 1;
                getData();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);
            }
        });

        DataListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Heartnectar_Info heartnectar_info = infoArrayList.get(position);
                Intent intent = new Intent(getContext(), A_Activity_WenZhangYueDu_XiangQing.class);
                intent.putExtra("aid", heartnectar_info.getAid() + "");
                startActivity(intent);
            }
        });


        getData();
    }

    private void getData() {

        mPresenter.adminCuseraddressPage(page, size, getContext());
    }

    @Override
    protected A_WenZhangYueDu_Present createPresenter() {
        return new A_WenZhangYueDu_Present();
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
    public void heartnectarPageSuccess(WenZhang_Total_Info model) {
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<Heartnectar_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
