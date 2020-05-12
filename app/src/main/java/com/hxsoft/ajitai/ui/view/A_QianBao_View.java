package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.model.info.QianBao_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_QianBao_View extends BaseMvpView {
    void ajitaipayQueryBalanceSuccess(Double model);

    void onFailure(int code, String msg);
}
