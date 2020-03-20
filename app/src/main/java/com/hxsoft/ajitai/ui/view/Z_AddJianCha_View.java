package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.FuZeRenInfo;
import com.hxsoft.ajitai.model.info.GongDiInfo;
import com.hxsoft.ajitai.model.info.ProjectInfo;
import com.hxsoft.ajitai.model.info.TypeInfo;
import com.hxsoft.ajitai.model.info.UpLoadInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_AddJianCha_View extends BaseMvpView {
    void listbycondition_questionSuccess(ArrayList<TypeInfo> model);

    void humandutySuccess(ArrayList<FuZeRenInfo> model);

    void checkAddSuccess(String model);

    void uploadSuccess(UpLoadInfo model);

    void projectlistSuccess(ArrayList<ProjectInfo> model);

    void gongdibypidlistSuccess(ArrayList<GongDiInfo> model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
