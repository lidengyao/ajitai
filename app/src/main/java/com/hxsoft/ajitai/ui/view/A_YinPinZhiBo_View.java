package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Total_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_YinPinZhiBo_View extends BaseMvpView{

    void cmediaclassesPageSuccess(A_Cmediaclasses_Total_Info model);


    void onFailure(int code, String msg);
}
