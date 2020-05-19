package com.hxsoft.ajitai.ui.fragment;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.base.MvpFragment;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by lidengyao on 2016-10-12 0012.
 */
public class Y_Fragment_ShiPinZhiBo_XiangQing_ZhuBan extends MvpFragment {


    @Bind(R.id.descriptionWebView)
    WebView descriptionWebView;

    @Override
    protected int getLayoutId() {
        return R.layout.a_fragment_shipinzhibo_xiangqing_zhuban;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view

        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);


        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public void SetData(A_Cvideostream_Info a_cvideostream_info) {

//        descriptionWebView.getSettings().setDefaultTextEncodingName("UTF-8");
        descriptionWebView.loadData(a_cvideostream_info.getDescription(), "text/html", "UTF-8");

    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    protected BasePresent createPresenter() {
        return null;
    }

}
