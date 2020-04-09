package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.present.LoginPresent;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_WoDeKeCheng_WeiWanCheng;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_WoDeKeCheng_YiWanCheng;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_yinpinzhibo_jianjie;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WoDeKeCheng extends MvpActivity {

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

        GouMaiTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
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
