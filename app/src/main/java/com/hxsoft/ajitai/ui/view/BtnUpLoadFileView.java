package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.UploadfileBean;

/**
 * Created by lidengyao on 2016-10-11 0011.
 */
public interface BtnUpLoadFileView  extends BaseMvpView {

    void uploadfileSuccess(UploadfileBean model);
}
