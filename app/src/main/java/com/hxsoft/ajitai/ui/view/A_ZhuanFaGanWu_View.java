package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_ZhuanFaGanWu_View extends BaseMvpView {

    void postConsciousSuccess(Boolean model);

    void onFailure(int code, String msg);
}
