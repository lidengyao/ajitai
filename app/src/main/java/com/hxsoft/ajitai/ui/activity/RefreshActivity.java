package com.hxsoft.ajitai.ui.activity;

import android.os.Bundle;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpActivity;
import com.hxsoft.ajitai.widget.PullLoadMoreRecyclerView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-09-27 0027.
 */
public class RefreshActivity extends MvpActivity {

    @Bind(R.id.RootLL)
    PullLoadMoreRecyclerView RootLL;

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.refresh;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);

        RootLL.setOnPullLoadMoreListener(new PullLoadMoreRecyclerView.PullLoadMoreListener() {
            @Override
            public void onRefresh() {
                showMessage("下拉刷新");
            }

            @Override
            public void onLoadMore() {
                showMessage("加载更多");
            }
        });

    }
}
