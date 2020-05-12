package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.Cuseraddress_Total_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_ShouHuoDiZhi_View extends BaseMvpView{
    void adminCuseraddressPageSuccess(Cuseraddress_Total_Info model);

    void onFailure(int code, String msg);
}
