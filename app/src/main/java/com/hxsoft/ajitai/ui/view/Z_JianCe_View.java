package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.RealtimeInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_JianCe_View extends BaseMvpView {
    void realtimebysiteidSuccess(ArrayList<RealtimeInfo> model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
