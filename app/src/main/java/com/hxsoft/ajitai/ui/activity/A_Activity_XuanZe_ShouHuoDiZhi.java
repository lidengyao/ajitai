package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_ShouHuoDiZhi_Adapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Total_Info;
import com.hxsoft.ajitai.present.A_ShouHuoDiZhi_Present;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XuanZe_ShouHuoDiZhi extends MvpActivity<A_ShouHuoDiZhi_Present> implements A_ShouHuoDiZhi_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.BottomLL)
    LinearLayout BottomLL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    @Bind(R.id.textView)
    TextView textView;

    private int current = 1;
    private int size = 10;
    private A_ShouHuoDiZhi_Adapter adapter;
    private ArrayList<Cuseraddress_Info> infoArrayList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xuanze_shouhuodizhi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        BottomLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_XinJianShouHuoDiZhi.class);
                intent.putExtra("type", "0");
                startActivity(intent);
            }
        });

        adapter = new A_ShouHuoDiZhi_Adapter(getContext(), infoArrayList, R.layout.a_item_shouhuodizhi, 1);

        DataListView.setAdapter(adapter);
        DataListView.setOnPullLoadMoreListener(new PullLoadMoreListView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {

                current = 1;
                getData();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 500);

            }

            @Override
            public void onLoadMore() {
                current += 1;
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

                Cuseraddress_Info recordsBean = infoArrayList.get(position);
                //数据是使用Intent返回
                Intent intent = new Intent();
                //把返回数据存入Intent
                intent.putExtra("RecordsBean", recordsBean);
                //设置返回数据
                setResult(RESULT_OK, intent);
                //关闭Activity
                finish();

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        getData();
    }


    private void getData() {
        mPresenter.adminCuseraddressPage(current, size, getContext());
    }

    @Override
    protected A_ShouHuoDiZhi_Present createPresenter() {
        return new A_ShouHuoDiZhi_Present();
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
    public void adminCuseraddressPageSuccess(Cuseraddress_Total_Info model) {
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<Cuseraddress_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.current, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
