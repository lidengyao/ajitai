package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.ListTaskInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_XiaoXi_View extends BaseMvpView {

    void refreshtokenSuccess(String model);

    void listTaskSuccess(ListTaskInfo model);

    void onFailure(int code, String msg);

}
