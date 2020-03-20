package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.UserInfo;

/**
 * Created by lidengyao on 2016-09-30 0030.
 */
public interface GetWebDataBodyView extends BaseMvpView {
    void loginSuccess(UserInfo model);
}
