package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.GongDiInfo;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface Z_JianKong_View extends BaseMvpView {
    void siteListSuccess(ArrayList<GongDiInfo> model);
}
