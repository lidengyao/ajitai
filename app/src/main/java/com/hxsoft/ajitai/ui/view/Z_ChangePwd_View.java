package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_ChangePwd_View extends BaseMvpView {

    void changepwdSucess(String model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
