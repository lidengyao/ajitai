package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_ShouYinTai_View extends BaseMvpView{
    void wxPayAppPaySuccess(String model);

    void alipaySuccess(String model);

    void payAjitaipayPaySuccess(String model);

    void ajitaipayQueryBalanceSuccess(Double model);

    void onFailure(int code, String msg);
}
