package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.Y_ZhangDan_Adapter;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.MoneyLog_Total_Info;
import com.hxsoft.ajitai.timepaker.ChangeDatePopwindow;
import com.hxsoft.ajitai.utils.ListData_Control_Normal;
import com.hxsoft.ajitai.widget.PullLoadMoreListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

public class A_ZhangDan_Activity extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.SaveRL)
    RelativeLayout SaveRL;
    @Bind(R.id.RiQiTV)
    TextView RiQiTV;
    @Bind(R.id.XuanZeRiQiRL)
    RelativeLayout XuanZeRiQiRL;
    @Bind(R.id.DataListView)
    PullLoadMoreListView DataListView;


    private int page = 1;
    private int pageSize = 10;
    private Y_ZhangDan_Adapter adapter;
    private ArrayList<String> infoArrayList = new ArrayList<>();
    private int _year;
    private int _month;

    @Override
    protected int getLayoutId() {
        return R.layout.y_activity_zhangdan;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        Calendar calendar = Calendar.getInstance();
        _year = calendar.get(Calendar.YEAR);
        _month = calendar.get(Calendar.MONTH) + 1;

        RiQiTV.setText(_year + "年" + _month + "月");
        XuanZeRiQiRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ChangeDatePopwindow mChangeBirthDialog = new ChangeDatePopwindow();
                mChangeBirthDialog.ShowDialog(getContext(), getActivity(), true, true, false,
                        new ChangeDatePopwindow.OnBirthListener() {
                            @Override
                            public void onClick(String year, String month, String day) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(year.substring(0, year.length() - 1)).append("年").append(month.substring(0, month.length() - 1)).append("月");
                                String showDate = sb.toString();
                                _year = Integer.parseInt(year.substring(0, year.length() - 1));
                                _month = Integer.parseInt(month.substring(0, month.length() - 1));
                                RiQiTV.setText(showDate);

                                getData();
                            }
                        });
            }
        });

        adapter = new Y_ZhangDan_Adapter(getContext(), infoArrayList, R.layout.a_item_zhangdan);

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
    protected BasePresent createPresenter() {
        return null;
    }

    private void getData() {
        for (int i = 0; i < 10; i++) {
            infoArrayList.add(i + "");
        }

        SetData(infoArrayList);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void SetData(final ArrayList<String> model) {
        infoArrayList = new ListData_Control_Normal().BandData(infoArrayList, model, this.page, this.pageSize, adapter, DataListView, getActivity(), getContext());
    }

}
