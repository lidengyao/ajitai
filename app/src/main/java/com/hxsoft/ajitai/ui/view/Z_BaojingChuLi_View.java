package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.BaoJingInfoDetail;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_BaojingChuLi_View extends BaseMvpView {
    void updatealertstatusSuccess(String model);

    void alertsearchrealbyridSuccess(BaoJingInfoDetail model);

    void refreshtokenSuccess(String model);

    void onFailure(int code, String msg);
}
