package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.model.info.VersionInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_Main_View extends BaseMvpView{
    void checkVersionSuccess(VersionInfo model);

    void onFailure(int code, String msg);
}
