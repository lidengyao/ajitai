package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_QueRenDingDan_View extends BaseMvpView{

    void adminCuseraddressDefaultbypersonSuccess(Cuseraddress_Info model);

    void onFailure(int code, String msg);
}
