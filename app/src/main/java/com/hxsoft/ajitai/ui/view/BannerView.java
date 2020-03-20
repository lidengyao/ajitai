package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;

import java.util.ArrayList;

/**
 * Created by lidengyao on 2016-10-11 0011.
 */
public interface BannerView extends BaseMvpView {
    void getBannerSuccess(ArrayList<String> model);
}
