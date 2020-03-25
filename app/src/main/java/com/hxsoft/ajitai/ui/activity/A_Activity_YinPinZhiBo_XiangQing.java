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
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinPinZhiBo_XiangQing_HuDong;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinPinZhiBo_XiangQing_ZhuBan;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_YinPinZhiBo_XiangQing extends MvpActivity {

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
    private String[] titles = new String[]{"主办", "互动"};
    private Y_Fragment_YinPinZhiBo_XiangQing_ZhuBan y_fragment_yinPinZhiBo_xiangQing_zhuBan;
    private Y_Fragment_YinPinZhiBo_XiangQing_HuDong y_fragment_yinPinZhiBo_xiangQing_huDong;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_yinpinzhibo_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();
    }

    private void init() {

        y_fragment_yinPinZhiBo_xiangQing_zhuBan = new Y_Fragment_YinPinZhiBo_XiangQing_ZhuBan();
        y_fragment_yinPinZhiBo_xiangQing_huDong = new Y_Fragment_YinPinZhiBo_XiangQing_HuDong();
        fragments.add(y_fragment_yinPinZhiBo_xiangQing_zhuBan);
        fragments.add(y_fragment_yinPinZhiBo_xiangQing_huDong);

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
