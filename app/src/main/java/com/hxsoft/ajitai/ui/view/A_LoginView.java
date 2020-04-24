package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_LoginView extends BaseMvpView{
    void loginSuccess(A_LoginInfo model);
}
