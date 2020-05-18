package com.hxsoft.ajitai.ui.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_ShouHuoDiZhi_Adapter;
import com.hxsoft.ajitai.adapter.A_YinPinZhiBo_Adapter;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Info;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Total_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.present.A_YinPinZhiBo_Present;
import com.hxsoft.ajitai.ui.view.A_YinPinZhiBo_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class Y_Fragment_YinPinZhiBo_HanYu extends MvpFragment<A_YinPinZhiBo_Present> implements A_YinPinZhiBo_View {


    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;


    private int page = 1;
    private int size = 10;
    private A_YinPinZhiBo_Adapter adapter;
    private ArrayList<A_Cmediaclasses_Info> infoArrayList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_yinpinzhibo_hanyu;
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

        //
//        Item1LL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_YinPinZhiBo_XiangQing.class);
//                startActivity(intent);
//            }
//        });
//
//        Item2LL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_YinPinZhiBo_XiangQing.class);
//                startActivity(intent);
//            }
//        });
//
//        Item3LL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_YinPinZhiBo_XiangQing.class);
//                startActivity(intent);
//            }
//        });

        adapter = new A_YinPinZhiBo_Adapter(getContext(), infoArrayList, R.layout.a_item_yinpinzhibo, 0);

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

        getData();
    }

    private void getData() {
        presenter.cmediaclassesPageSuccess(page, size, 1, getContext());
    }


    @Override
    public void onResume() {
        super.onResume();
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
    protected A_YinPinZhiBo_Present createPresenter() {
        return new A_YinPinZhiBo_Present();
    }

    @Override
    public void cmediaclassesPageSuccess(A_Cmediaclasses_Total_Info model) {
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<A_Cmediaclasses_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
