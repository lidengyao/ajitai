package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.LoginInfo;
import com.hxsoft.ajitai.model.info.GongDiInfo;
import com.hxsoft.ajitai.model.info.Z_UserInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_LoginView extends BaseMvpView {
    void loginSuccess(LoginInfo model);

    void getuserinfoSuccess(Z_UserInfo model);

    void listSuccess(ArrayList<GongDiInfo> model);

    void onFailure(int code, String msg);


}
