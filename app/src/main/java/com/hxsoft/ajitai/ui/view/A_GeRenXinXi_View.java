package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.model.info.Sysarea_Info;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_GeRenXinXi_View extends BaseMvpView {

    void userUpdatecurrentSuccess(Boolean model);

    void pushUploadSuccess(String model);

    void dictSysareaGettreelistUserAreaSuccess(ArrayList<Sysarea_Info> model);

    void onFailure(int code, String msg);
}
