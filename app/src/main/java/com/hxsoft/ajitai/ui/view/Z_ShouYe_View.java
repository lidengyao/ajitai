package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.CityenvironmentInfo;
import com.hxsoft.ajitai.model.info.ProjectInfo;
import com.hxsoft.ajitai.model.info.apppicInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_ShouYe_View extends BaseMvpView {
    void projectlistSuccess(ArrayList<ProjectInfo> model);


    void apppicQuery(apppicInfo model);

    void Cityenvironment(CityenvironmentInfo model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
