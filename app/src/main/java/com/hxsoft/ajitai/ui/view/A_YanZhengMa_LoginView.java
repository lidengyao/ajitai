package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.model.info.OauthToken_Info;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_YanZhengMa_LoginView extends BaseMvpView {
    void pushChecknumSuccess(Boolean model);

    void oauthTokenSuccess(A_LoginInfo model);

    void onFailure(int code, String msg);
}
