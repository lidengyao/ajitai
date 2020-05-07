package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_ZengPiaoZiZhi_Add_View extends BaseMvpView {
    void adminCuserreceiptAddSuccess(Boolean model);

    void adminCuserreceiptDeleteSuccess(Boolean model);

    void adminCuserreceiptUpdateSuccess(Boolean model);

    void onFailure(int code, String msg);
}
