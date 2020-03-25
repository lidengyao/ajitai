package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_XinLingGanLu_JianJie_QuanZhu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_XinLingGanLu_JianJie_QuanZi;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_XinShenHuDong_JianJie_QuanZhu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_XinShenHuDong_JianJie_QuanZi;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_XinLingGanLu_JianJie extends MvpActivity {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.GengDuoRL)
    RelativeLayout GengDuoRL;
    @Bind(R.id.SendBtn)
    Button SendBtn;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"圈子介绍", "圈主介绍"};
    private Y_Fragment_XinLingGanLu_JianJie_QuanZhu y_fragment_xinLingGanLu_jianJie_quanZhu;
    private Y_Fragment_XinLingGanLu_JianJie_QuanZi y_fragment_xinLingGanLu_jianJie_quanZi;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_xinlingganlu_jianjie;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        y_fragment_xinLingGanLu_jianJie_quanZi = new Y_Fragment_XinLingGanLu_JianJie_QuanZi();
        y_fragment_xinLingGanLu_jianJie_quanZhu = new Y_Fragment_XinLingGanLu_JianJie_QuanZhu();
        fragments.add(y_fragment_xinLingGanLu_jianJie_quanZi);
        fragments.add(y_fragment_xinLingGanLu_jianJie_quanZhu);


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
