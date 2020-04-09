package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_XiangQing_ShiPin;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinYue_XiangQing_TuPian;
import com.hxsoft.ajitai.widget.ScrollViewPager;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_YinYue_XiangQing extends MvpActivity implements ViewPager.OnPageChangeListener {


    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.QieHuanZhangHaoRL)
    RelativeLayout QieHuanZhangHaoRL;
    @Bind(R.id.ContentSP)
    ScrollViewPager ContentSP;
    @Bind(R.id.TuPian_IV)
    ImageView TuPianIV;
    @Bind(R.id.ShiPin_IV)
    ImageView ShiPinIV;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private Y_Fragment_YinYue_XiangQing_TuPian y_fragment_yinYue_xiangQing_tuPian;
    private Y_Fragment_YinYue_XiangQing_ShiPin y_fragment_yinYue_xiangQing_shiPin;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_yinyue_xiangqing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();
    }

    private void init() {

        y_fragment_yinYue_xiangQing_tuPian = new Y_Fragment_YinYue_XiangQing_TuPian();
        y_fragment_yinYue_xiangQing_shiPin = new Y_Fragment_YinYue_XiangQing_ShiPin();
        fragments.add(y_fragment_yinYue_xiangQing_tuPian);
        fragments.add(y_fragment_yinYue_xiangQing_shiPin);

        pagerAdapter = new FmPagerAdapter(fragments, getSupportFragmentManager());
        ContentSP.setAdapter(pagerAdapter);
        ContentSP.addOnPageChangeListener(this);

    }

    @Override
    protected BasePresent createPresenter() {
        return null;
    }


    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int position) {
        switchPage(position);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    private final static int PAGE_TUPIAN = 0;
    private final static int PAGE_SHIPIN = 1;

    private void switchPage(int position) {
        switch (position) {
            case PAGE_TUPIAN:
                TuPianIV.setImageResource(R.mipmap.a_yinyue_xiangiqng_hei);
                ShiPinIV.setImageResource(R.mipmap.a_yinyue_xiangiqng_hui);

                break;
            case PAGE_SHIPIN:
                TuPianIV.setImageResource(R.mipmap.a_yinyue_xiangiqng_hui);
                ShiPinIV.setImageResource(R.mipmap.a_yinyue_xiangiqng_hei);

                break;

        }

    }

}
