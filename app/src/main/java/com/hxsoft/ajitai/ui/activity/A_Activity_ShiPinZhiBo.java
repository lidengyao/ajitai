package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_ALive_Adapter;
import com.hxsoft.ajitai.adapter.A_ShouHuoDiZhi_Adapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.A_ALive_Info;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.present.A_ShiPinZhiBo_Present;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_View;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_ShiPinZhiBo extends MvpActivity<A_ShiPinZhiBo_Present> implements A_ShiPinZhiBo_View {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    private int page = 1;
    private int size = 10;
    private A_ALive_Adapter adapter;
    private ArrayList<A_ALive_Info> infoArrayList = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_zhibo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

//        ImageView imageView1 = (ImageView) IncludeLL1.findViewById(R.id.zhibo_item_bg);
//        ImageView imageView2 = (ImageView) IncludeLL2.findViewById(R.id.zhibo_item_bg);
//        ImageView imageView3 = (ImageView) IncludeLL3.findViewById(R.id.zhibo_item_bg);
//
//        GlideControl.SetFilletImage(getContext(), "http://47.92.221.41/image/a_ditu3.png", imageView1, R.mipmap.jiazaiing, 5);
//        GlideControl.SetFilletImage(getContext(), "http://47.92.221.41/image/a_ditu3.png", imageView2, R.mipmap.jiazaiing, 5);
//        GlideControl.SetFilletImage(getContext(), "http://47.92.221.41/image/a_ditu3.png", imageView3, R.mipmap.jiazaiing, 5);
//
//        IncludeLL1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_ShiPinZhiBo_XiangQing.class);
//                startActivity(intent);
//            }
//        });
//
//        IncludeLL2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_ShiPinZhiBo_XiangQing.class);
//                startActivity(intent);
//            }
//        });
//
//        IncludeLL3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_ShiPinZhiBo_XiangQing.class);
//                startActivity(intent);
//            }
//        });
        adapter = new A_ALive_Adapter(getContext(), infoArrayList, R.layout.a_item_zhibo, 0);

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

//        DataListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getContext(), A_Activity_XinJianShouHuoDiZhi.class);
//                intent.putExtra("type", "1");
//                intent.putExtra("RecordsBean", infoArrayList.get(position));
//                startActivity(intent);
//            }
//        });

        getData();
    }

    private void getData() {
        mPresenter.cvideostreamAlivepage(getContext());
    }

    @Override
    protected A_ShiPinZhiBo_Present createPresenter() {
        return new A_ShiPinZhiBo_Present();
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
    public void cvideostreamAlivepageSuccess(A_ALive_Total_Info model) {
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<A_ALive_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
