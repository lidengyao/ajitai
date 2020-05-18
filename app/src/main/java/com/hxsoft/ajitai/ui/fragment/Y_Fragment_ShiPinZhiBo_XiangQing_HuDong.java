package com.hxsoft.ajitai.ui.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_Cvideocomment_Adapter;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.info.A_Cvideocomment_Info;
import com.hxsoft.ajitai.model.info.A_Cvideocomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;
import com.hxsoft.ajitai.model.info.A_addcomment_Bean;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.present.A_ShiPinZhiBo_XiangQing_HuDong_Present;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_XiangQing_HuDong_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class Y_Fragment_ShiPinZhiBo_XiangQing_HuDong extends MvpFragment<A_ShiPinZhiBo_XiangQing_HuDong_Present> implements A_ShiPinZhiBo_XiangQing_HuDong_View {


    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    private int page = 1;
    private int size = 10;
    private A_Cvideocomment_Adapter adapter;
    private ArrayList<A_Cvideocomment_Info> infoArrayList = new ArrayList<>();
    private Integer vid;
    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_shipinzhibo_xiangqing_hudong;
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

        adapter = new A_Cvideocomment_Adapter(getContext(), infoArrayList, R.layout.a_item_zhibopinglun, 0);

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

    }

    public void SetData(A_Cvideostream_Info a_cvideostream_info) {
        vid=a_cvideostream_info.getVid();
    }

    public void SenMsg(Integer vid, String msg) {
        A_addcomment_Bean a_addcomment_bean = new A_addcomment_Bean();
        a_addcomment_bean.setComment(msg);
        a_addcomment_bean.setVid(vid);
        a_addcomment_bean.setCtype(1);
        presenter.cvideocommentAddcomment(a_addcomment_bean, getContext());
    }

    public void getData() {
        presenter.cvideostreamPage( vid,page, size, getContext());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
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
    protected A_ShiPinZhiBo_XiangQing_HuDong_Present createPresenter() {
        return new A_ShiPinZhiBo_XiangQing_HuDong_Present();
    }

    @Override
    public void cvideocommentAddcommentSuccess(Boolean model) {
        getData();
    }

    @Override
    public void cvideostreamPageSuccess(A_Cvideocomment_Total_Info model) {
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<A_Cvideocomment_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
