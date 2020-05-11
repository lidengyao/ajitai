package com.hxsoft.ajitai.ui.activity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.adapter.FmPagerAdapter;
import com.hxsoft.ajitai.adapter.RecyclerViewAdapter;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.present.A_WoDeKeCheng_Present;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_WoDeKeCheng_WeiWanCheng;
import com.hxsoft.ajitai.ui.fragment.Y_Fragment_WoDeKeCheng_YiWanCheng;
import com.hxsoft.ajitai.ui.view.A_WoDeKeCheng_View;
import com.hxsoft.ajitai.utils.CheckControl_Dialog_yinpinzhibo_jianjie;
import com.hxsoft.ajitai.widget.PullLoadMoreRecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Activity_WoDeKeCheng extends MvpActivity<A_WoDeKeCheng_Present> implements A_WoDeKeCheng_View {

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

    private Integer page = 1;
    private Integer size = 10;
    private View bottomView;

    private View checkKeChengView;

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
                ShowDialog();
            }
        });

        bottomView = View.inflate(getContext(), R.layout.actionsheet_dialog_goumaikecheng, null);

        mPullLoadMoreRecyclerView = (PullLoadMoreRecyclerView) bottomView.findViewById(R.id.pullLoadMoreRecyclerView);
        //mPullLoadMoreRecyclerView.setRefreshing(true);
        mPullLoadMoreRecyclerView.setGridLayout(2);
        mRecyclerViewAdapter = new RecyclerViewAdapter(getActivity(), new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void OnClick(View view, KeCheng_Info.RecordsBean recordsBean) {
                if (checkKeChengView == null) {

                } else {
                    TextView price_TV = (TextView) checkKeChengView.findViewById(R.id.price_TV);
                    TextView goodsname_TV = (TextView) checkKeChengView.findViewById(R.id.goodsname_TV);

                    price_TV.setTextColor(getResources().getColor(R.color.C808080));
                    goodsname_TV.setTextColor(getResources().getColor(R.color.C808080));

                    checkKeChengView.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffffff_4_line_shape));

                }
                view.setBackground(getResources().getDrawable(R.drawable.sysbtn_ffe248_4_shape));
                TextView price_TV = (TextView) view.findViewById(R.id.price_TV);
                TextView goodsname_TV = (TextView) view.findViewById(R.id.goodsname_TV);

                price_TV.setTextColor(getResources().getColor(R.color.C242424));
                goodsname_TV.setTextColor(getResources().getColor(R.color.C242424));

                checkKeChengView=view;
            }
        });
        mPullLoadMoreRecyclerView.setAdapter(mRecyclerViewAdapter);
        mPullLoadMoreRecyclerView.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {
                mRecyclerViewAdapter.clearData();
                page = 0;
                getData();
            }

            @Override
            public void onLoadMore() {
                page = page + 1;
                getData();
            }
        });

        getData();
    }

    private void getData() {
        mPresenter.goodsCgoodsPagebytype((page - 1) * size, size, 1, getContext());
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
    protected A_WoDeKeCheng_Present createPresenter() {
        return new A_WoDeKeCheng_Present();
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


    @Override
    public void goodsCgoodsPagebytypeSuccess(KeCheng_Info model) {
        if (model == null)
            return;
        mRecyclerViewAdapter.addAllData(model.getRecords());
        mPullLoadMoreRecyclerView.setPullLoadMoreCompleted();

    }

    @Override
    public void onFailure(int code, String msg) {
        showMessage(msg);
    }


    private PullLoadMoreRecyclerView mPullLoadMoreRecyclerView;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    private void ShowDialog() {

        PopupWindow pop = new PopupWindow(bottomView, -1, -2);
        pop.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        pop.setOutsideTouchable(true);
        pop.setFocusable(true);
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.5f;
        getWindow().setAttributes(lp);
        pop.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 1f;
                getWindow().setAttributes(lp);
            }
        });
        pop.setAnimationStyle(R.style.main_menu_photo_anim);
        pop.showAtLocation(getWindow().getDecorView(), Gravity.CENTER, 0, 0);


    }


}
