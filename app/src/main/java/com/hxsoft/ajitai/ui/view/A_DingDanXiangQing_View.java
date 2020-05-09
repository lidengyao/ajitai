package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.A_Order_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_DingDanXiangQing_View extends BaseMvpView {
    void orderQuerySuccess(A_Order_Info model);

    void orderCannelSuccess(String model);

    void onFailure(int code, String msg);
}
