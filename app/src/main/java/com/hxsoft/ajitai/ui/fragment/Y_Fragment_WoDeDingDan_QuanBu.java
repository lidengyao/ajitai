package com.hxsoft.ajitai.ui.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_Order_Adapter;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.info.A_Order_Info;
import com.hxsoft.ajitai.model.info.A_Order_Total_Info;
import com.hxsoft.ajitai.present.A_Order_Present;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinJianShouHuoDiZhi;
import com.hxsoft.ajitai.ui.view.A_Order_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class Y_Fragment_WoDeDingDan_QuanBu extends MvpFragment<A_Order_Present> implements A_Order_View {


    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;


    private int current = 1;
    private int size = 10;
    private A_Order_Adapter adapter;
    private ArrayList<A_Order_Info> infoArrayList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_wodedingdan_quanbu;
    }

    @Override
    protected A_Order_Present createPresenter() {
        return new A_Order_Present();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view

        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        WeiChuLi1LL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_DingDanXiangQing.class);
//                startActivity(intent);
//            }
//        });
        adapter = new A_Order_Adapter(getContext(), infoArrayList, R.layout.a_item_dingdan_all, new A_Order_Adapter.OnCheckControl_dialogClickListener() {
            @Override
            public void OnClick(int type, String orderNo) {

                //取消订单
                if (type == 3) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("提示").setMessage("确定取消当前订单吗").setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            presenter.orderCannel(orderNo, getContext());
                        }
                    }).show();
                }
            }
        });

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
                Intent intent = new Intent(getContext(), A_Activity_XinJianShouHuoDiZhi.class);
                intent.putExtra("type", "1");
                intent.putExtra("RecordsBean", infoArrayList.get(position));
                startActivity(intent);
            }
        });

    }

    private void getData() {

        presenter.orderPage(current, size, null, getContext());
    }

    @Override
    public void onResume() {
        super.onResume();
        getData();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void orderPageSuccess(A_Order_Total_Info model) {
        if (model == null)
            return;
        SetData(model.getRecords());
    }

    @Override
    public void orderCannelSuccess(String model) {
        showMessage("取消成功");
        getData();
    }

    private void SetData(final ArrayList<A_Order_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.current, this.size, adapter, DataListView, getActivity(), getContext());
    }


    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
