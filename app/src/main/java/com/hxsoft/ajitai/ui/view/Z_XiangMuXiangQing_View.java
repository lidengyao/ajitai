package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.ProjectDetailInfo;
import com.hxsoft.ajitai.model.info.apppicInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_XiangMuXiangQing_View extends BaseMvpView {
    void projectDetail(ProjectDetailInfo model);

    void apppicQuery(apppicInfo model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
