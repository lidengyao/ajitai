package com.hxsoft.ajitai.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.adapter.RecyclerViewAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.present.A_WoDeKeCheng_Present;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_WoDeKeCheng_WeiWanCheng;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_WoDeKeCheng_YiWanCheng;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_GouMaiKeCheng_QueRen;
import com.hxsoft.ajitai.widget.PullLoadMoreRecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WoDeKeCheng extends MvpActivity<A_WoDeKeCheng_Present> implements A_WoDeKeCheng_View {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    @Bind(R.id.GouMai_TV)
    TextView GouMaiTV;
    @Bind(R.id.Bottom_LL)
    LinearLayout BottomLL;
    @Bind(R.id.GeiHaoYouGouMaiTV)
    TextView GeiHaoYouGouMaiTV;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"未完成", "已完成"};
    private Y_Fragment_WoDeKeCheng_WeiWanCheng y_fragment_woDeKeCheng_weiWanCheng;
    private Y_Fragment_WoDeKeCheng_YiWanCheng y_fragment_woDeKeCheng_yiWanCheng;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_wodekecheng;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();


        GouMaiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), A_Activity_WoDeKeCheng_XuanZeKeCheng.class);
                startActivity(intent);
            }
        });

        GeiHaoYouGouMaiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), A_Activity_WoDeKeCheng_XuanZeKeCheng.class);
                startActivity(intent);
            }
        });

    }

    private void init() {

        y_fragment_woDeKeCheng_weiWanCheng = new Y_Fragment_WoDeKeCheng_WeiWanCheng();
        y_fragment_woDeKeCheng_yiWanCheng = new Y_Fragment_WoDeKeCheng_YiWanCheng();
        fragments.add(y_fragment_woDeKeCheng_weiWanCheng);
        fragments.add(y_fragment_woDeKeCheng_yiWanCheng);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.addTab(MenuTablayout.newTab());
        }

        MenuTablayout.setupWithViewPager(viewPager, false);
        pagerAdapter = new FmPagerAdapter(fragments, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        for (int i = 0; i < titles.length; i++) {
            MenuTablayout.getTabAt(i).setText(titles[i]);
        }

    }

    @Override
    protected A_WoDeKeCheng_Present createPresenter() {
        return new A_WoDeKeCheng_Present();
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
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }


}
