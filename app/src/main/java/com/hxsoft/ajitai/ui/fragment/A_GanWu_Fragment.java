package com.hxsoft.ajitai.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.A_Cconscious_Adapter;
import com.hxsoft.ajitai.adapter.A_ShouHuoDiZhi_Adapter;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.present.A_GanWu_Present;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_FaBuGanWu;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_GuanZhuHaoYou;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_SouSuo;
import com.hxsoft.ajitai.ui.activity.A_Activity_GanWu_ZhuanFa;
import com.hxsoft.ajitai.ui.activity.A_Activity_XinJianShouHuoDiZhi;
import com.hxsoft.ajitai.ui.view.A_GanWu_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GanWu;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_ShiPinZhiBoFenXiang;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_GanWu_Fragment extends MvpFragment<A_GanWu_Present> implements A_GanWu_View {


    @Bind(R.id.WenZhangYueDuLL)
    LinearLayout WenZhangYueDuLL;
    @Bind(R.id.HaoYouLL)
    LinearLayout HaoYouLL;
    @Bind(R.id.ShouYeTopRL)
    RelativeLayout ShouYeTopRL;
    @Bind(R.id.FaBuGanWu_RL)
    RelativeLayout FaBuGanWuRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;
    private int page = 1;
    private int size = 10;
    private A_Cconscious_Adapter adapter;
    private ArrayList<A_Conscious_Info> infoArrayList = new ArrayList<>();

    @Override
    protected A_GanWu_Present createPresenter() {
        return new A_GanWu_Present();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_ganwu;
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

//        ImageView OperateIVOne = (ImageView) GanwuOneLL.findViewById(R.id.OperateIV);
//        ImageView OperateIVTwo = (ImageView) GanwuTwoLL.findViewById(R.id.OperateIV);
//        LinearLayout ZhuanFa_LL_One = (LinearLayout) GanwuOneLL.findViewById(R.id.ZhuanFa_LL);
//        LinearLayout ZhuanFa_LL_Two = (LinearLayout) GanwuTwoLL.findViewById(R.id.ZhuanFa_LL);
//
//        LinearLayout FenXiang_LL_One = (LinearLayout) GanwuOneLL.findViewById(R.id.FenXiang_LL);
//        LinearLayout FenXiang_LL_Two = (LinearLayout) GanwuTwoLL.findViewById(R.id.FenXiang_LL);

//        FenXiang_LL_One.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//        FenXiang_LL_Two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_ShiPinZhiBoFenXiang.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_ShiPinZhiBoFenXiang.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//        OperateIVOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_GanWu.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//
//
//        OperateIVTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CheckControl_Dialog_GanWu.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_GanWu.OnCheckControl_dialogClickListener() {
//                    @Override
//                    public void OnClick(int type) {
//
//                    }
//                });
//            }
//        });
//
//        ZhuanFa_LL_One.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
//                startActivity(intent);
//            }
//        });
//        ZhuanFa_LL_Two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_GanWu_ZhuanFa.class);
//                startActivity(intent);
//            }
//        });

        FaBuGanWuRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_FaBuGanWu.class);
                startActivity(intent);
            }
        });

//        SouSuoLL.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), A_Activity_GanWu_SouSuo.class);
//                startActivity(intent);
//            }
//        });

        HaoYouLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_GanWu_GuanZhuHaoYou.class);
                startActivity(intent);
            }
        });
        adapter = new A_Cconscious_Adapter(getContext(), getActivity(), infoArrayList, R.layout.a_item_ganwu);

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

    @Override
    public void onResume() {
        super.onResume();
    }

    private void getData() {
        presenter.queryConscious(page, size, getContext());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void queryConsciousSuccess(A_Conscious_Total_Info model) {
//        if (model == null)
//            return;
        SetData(model.getRecords());
    }

    private void SetData(final ArrayList<A_Conscious_Info> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.size, adapter, DataListView, getActivity(), getContext());
    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }
}
