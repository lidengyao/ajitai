package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;
import com.hxsoft.ajitai.model.bean.A_User_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_GanWu_View extends BaseMvpView{

    void queryConsciousSuccess(A_Conscious_Total_Info model);

    void onFailure(int code, String msg);
}
