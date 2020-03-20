package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.ZhengGaiInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_ZhengGai_View extends BaseMvpView {
    void querypagebyconditionSuccess(ZhengGaiInfo model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);

}
