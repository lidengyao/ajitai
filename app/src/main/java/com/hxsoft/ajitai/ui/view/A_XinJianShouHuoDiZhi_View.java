package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.Sysarea_Info;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_XinJianShouHuoDiZhi_View extends BaseMvpView {
    void adminCuseraddressAddSuccess(Boolean model);

    void adminCuseraddressDeleteSuccess(Boolean model);

    void adminCuseraddressUpdateSuccess(Boolean model);

    void dictSysareaegettreelistbyupidOneSuccess(ArrayList<Sysarea_Info> model);

    void dictSysareaegettreelistbyupidTwoSuccess(ArrayList<Sysarea_Info> model);

    void dictSysareaegettreelistbyupidThreeSuccess(ArrayList<Sysarea_Info> model);

    void dictSysareaegettreelistbyupidFourSuccess(ArrayList<Sysarea_Info> model);


    void dictSysareaettreelistSuccess(ArrayList<Sysarea_Info> model);

    void onFailure(int code, String msg);
}
