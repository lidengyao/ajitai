package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.GongDiInfo;
import com.hxsoft.ajitai.model.info.ProjectInfo;
import com.hxsoft.ajitai.model.info.VersionInfo;
import com.hxsoft.ajitai.model.info.Z_UserInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_MainSecView extends BaseMvpView {

    void projectlistSuccess(ArrayList<ProjectInfo> model);

    void getuserinfoSuccess(Z_UserInfo model);

    void listSuccess(ArrayList<GongDiInfo> model);

    void checkVersionSuccess(VersionInfo model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
