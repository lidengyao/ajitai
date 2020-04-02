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
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShouCang_GanWu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShouCang_QuanBu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShouCang_WenZhang;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_ShouCang_YinYue;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WoDeShouCang extends MvpActivity {

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
    private String[] titles = new String[]{"全部", "文章", "感悟", "音乐"};
    private Y_Fragment_ShouCang_QuanBu y_fragment_shouCang_quanBu;
    private Y_Fragment_ShouCang_WenZhang y_fragment_shouCang_wenZhang;
    private Y_Fragment_ShouCang_GanWu y_fragment_shouCang_ganWu;
    private Y_Fragment_ShouCang_YinYue y_fragment_shouCang_yinYue;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_wodeshoucang;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();
    }

    private void init() {

        y_fragment_shouCang_quanBu = new Y_Fragment_ShouCang_QuanBu();
        y_fragment_shouCang_wenZhang = new Y_Fragment_ShouCang_WenZhang();
        y_fragment_shouCang_ganWu = new Y_Fragment_ShouCang_GanWu();
        y_fragment_shouCang_yinYue = new Y_Fragment_ShouCang_YinYue();
        fragments.add(y_fragment_shouCang_quanBu);
        fragments.add(y_fragment_shouCang_wenZhang);
        fragments.add(y_fragment_shouCang_ganWu);
        fragments.add(y_fragment_shouCang_yinYue);

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
