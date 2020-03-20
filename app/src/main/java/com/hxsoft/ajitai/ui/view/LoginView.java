package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface LoginView extends BaseMvpView{
    void loginSuccess(PhoneLoginInfo model);
}
