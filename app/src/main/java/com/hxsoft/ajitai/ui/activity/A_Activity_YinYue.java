package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinPinZhiBo_HanYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinPinZhiBo_MengYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_AJiTai;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_HanYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_MengYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_ShiPin;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_YinYue extends MvpActivity {

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
    private String[] titles = new String[]{"阿吉泰", "蒙语", "汉语", "视频"};
    private Y_Fragment_YinYue_AJiTai y_fragment_yinYue_aJiTai;
    private Y_Fragment_YinYue_MengYu y_fragment_yinYue_mengYu;
    private Y_Fragment_YinYue_HanYu y_fragment_yinYue_hanYu;
    private Y_Fragment_YinYue_ShiPin y_fragment_yinYue_shiPin;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_yinyue;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();
    }

    private void init() {

        y_fragment_yinYue_aJiTai = new Y_Fragment_YinYue_AJiTai();
        y_fragment_yinYue_mengYu = new Y_Fragment_YinYue_MengYu();
        y_fragment_yinYue_hanYu = new Y_Fragment_YinYue_HanYu();
        y_fragment_yinYue_shiPin = new Y_Fragment_YinYue_ShiPin();
        fragments.add(y_fragment_yinYue_aJiTai);
        fragments.add(y_fragment_yinYue_mengYu);
        fragments.add(y_fragment_yinYue_hanYu);
        fragments.add(y_fragment_yinYue_shiPin);

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
