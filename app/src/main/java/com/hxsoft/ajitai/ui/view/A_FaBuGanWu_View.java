package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_FaBuGanWu_View extends BaseMvpView {

    void postConsciousSuccess(Boolean model);

    void onFailure(int code, String msg);
}
