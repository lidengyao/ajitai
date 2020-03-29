package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinPinZhiBo_HanYu;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_YinPinZhiBo_MengYu;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_yinpinzhibo_jianjie;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_YinPinZhiBo extends MvpActivity {

    @Bind(R.id.SysNameIV)
    TextView SysNameIV;
    @Bind(R.id.MenuTablayout)
    TabLayout MenuTablayout;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    @Bind(R.id.JianJieRL)
    RelativeLayout JianJieRL;
    private FmPagerAdapter pagerAdapter;
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"蒙语课程", "汉语课程"};
    private Y_Fragment_YinPinZhiBo_MengYu y_fragment_yinPinZhiBo_mengYu;
    private Y_Fragment_YinPinZhiBo_HanYu yFragmentYinPinZhiBoHanYu;

    @Override
    protected int getLayoutId() {
        return R.layout.a_activity_yinpinzhibo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        init();

        JianJieRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckControl_Dialog_yinpinzhibo_jianjie.ShowDialog(getContext(), getActivity(), "", new CheckControl_Dialog_yinpinzhibo_jianjie.OnCheckControl_dialogClickListener() {
                    @Override
                    public void OnClick(int type) {

                    }
                });
            }
        });
    }

    private void init() {

        y_fragment_yinPinZhiBo_mengYu = new Y_Fragment_YinPinZhiBo_MengYu();
        yFragmentYinPinZhiBoHanYu = new Y_Fragment_YinPinZhiBo_HanYu();
        fragments.add(y_fragment_yinPinZhiBo_mengYu);
        fragments.add(yFragmentYinPinZhiBoHanYu);

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
