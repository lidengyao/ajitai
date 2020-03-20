package com.hxsoft.ajitai.ui.fragment;

import android.support.v4.app.Fragment;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;

import java.util.ArrayList;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class A_FaXian_Fragment extends MvpFragment {


//    private FmPagerAdapter pagerAdapter;
//    private ArrayList<Fragment> fragments = new ArrayList<>();
//    private String[] titles = new String[]{"聊天", "抢购", "品牌专场", "抽奖", "展会", "推广"};
//    private Y_Fragment_ZhiBo_LiaoTian y_fragment_zhiBo_liaoTian;
    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_faxian;
    }
}
