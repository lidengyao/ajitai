package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_FaXian_SouSuo_DuShuHui;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_FaXian_SouSuo_WenZhang;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_FaXian_SouSuo_XinLingXiangYue;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_FaXian_SouSuo_ZhuanShuTuiJian;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_FaXian_SouSuo_ZongHe;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_FaXian_SouSuo extends MvpActivity {


    @Bind(R.id.ExitLL)
    RelativeLayout ExitLL;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"综合", "文章", "读书会", "心灵相约", "专属推荐"};
    private Y_Fragment_FaXian_SouSuo_ZongHe y_fragment_faXian_souSuo_zongHe;
    private Y_Fragment_FaXian_SouSuo_WenZhang y_fragment_faXian_souSuo_wenZhang;
    private Y_Fragment_FaXian_SouSuo_DuShuHui y_fragment_faXian_souSuo_duShuHui;
    private Y_Fragment_FaXian_SouSuo_XinLingXiangYue y_fragment_faXian_souSuo_xinLingXiangYue;
    private Y_Fragment_FaXian_SouSuo_ZhuanShuTuiJian y_fragment_faXian_souSuo_zhuanShuTuiJian;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_faxian_sousuo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        ExitLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        init();
    }


    private void init() {

        y_fragment_faXian_souSuo_zongHe = new Y_Fragment_FaXian_SouSuo_ZongHe();
        y_fragment_faXian_souSuo_wenZhang = new Y_Fragment_FaXian_SouSuo_WenZhang();
        y_fragment_faXian_souSuo_duShuHui = new Y_Fragment_FaXian_SouSuo_DuShuHui();
        y_fragment_faXian_souSuo_xinLingXiangYue = new Y_Fragment_FaXian_SouSuo_XinLingXiangYue();
        y_fragment_faXian_souSuo_zhuanShuTuiJian = new Y_Fragment_FaXian_SouSuo_ZhuanShuTuiJian();
        fragments.add(y_fragment_faXian_souSuo_zongHe);
        fragments.add(y_fragment_faXian_souSuo_wenZhang);
        fragments.add(y_fragment_faXian_souSuo_duShuHui);
        fragments.add(y_fragment_faXian_souSuo_xinLingXiangYue);
        fragments.add(y_fragment_faXian_souSuo_zhuanShuTuiJian);

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
