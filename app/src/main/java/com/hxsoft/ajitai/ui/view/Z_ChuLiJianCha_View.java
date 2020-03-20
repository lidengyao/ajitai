package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.JianChaDetailInfo;
import com.hxsoft.ajitai.model.info.UpLoadInfo;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_ChuLiJianCha_View extends BaseMvpView {
    void checkAddUpateSuccess(String model);

    void uploadSuccess(UpLoadInfo model);

    void checksearchbycheckidSuccess(JianChaDetailInfo model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
