package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.YiJiType_Info;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.utils.YiJiCaiDan_Popwindow;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_FaXian_WenZhangYueDu extends MvpActivity {


    @Bind(R.id.Back_LL)
    LinearLayout BackLL;
    @Bind(R.id.ShaiXuan_RL)
    RelativeLayout ShaiXuanRL;

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

                YiJiCaiDan_Popwindow qrsType_popwindow = new YiJiCaiDan_Popwindow(getContext(),getActivity(), model);

            }
        });

    }


    @Override
    protected LoginPresent createPresenter() {
        return new LoginPresent();
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


}
