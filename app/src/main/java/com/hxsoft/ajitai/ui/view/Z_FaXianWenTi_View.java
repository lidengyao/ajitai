package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.JianChaInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_FaXianWenTi_View extends BaseMvpView {
    void searchbystatusSuccess(JianChaInfo model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
