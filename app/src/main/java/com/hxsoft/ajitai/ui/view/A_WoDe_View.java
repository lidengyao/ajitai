package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.model.bean.A_User_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_WoDe_View extends BaseMvpView{

    void userInfoSuccess(A_User_Info model);

    void onFailure(int code, String msg);
}
