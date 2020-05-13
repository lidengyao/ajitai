package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.CreateOrder_Info;
import com.hxsoft.ajitai.model.info.KeCheng_Info;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_ChongZhi_View extends BaseMvpView {

    void orderCreateSuccess(CreateOrder_Info model);

    void onFailure(int code, String msg);
}
