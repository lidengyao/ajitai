package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_LiuYanFanKui_WeiChuLi;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_LiuYanFanKui_YiChuLi;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_LiuYanFanKui extends MvpActivity {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"未处理", "已处理"};
    private Y_Fragment_LiuYanFanKui_WeiChuLi y_fragment_liuYanFanKui_weiChuLi;
    private Y_Fragment_LiuYanFanKui_YiChuLi y_fragment_liuYanFanKui_yiChuLi;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_liuyanfankui;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        init();
    }

    private void init() {

        y_fragment_liuYanFanKui_weiChuLi = new Y_Fragment_LiuYanFanKui_WeiChuLi();
        y_fragment_liuYanFanKui_yiChuLi = new Y_Fragment_LiuYanFanKui_YiChuLi();
        fragments.add(y_fragment_liuYanFanKui_weiChuLi);
        fragments.add(y_fragment_liuYanFanKui_yiChuLi);

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
    protected BasePresent createPresenter() {
        return null;
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
