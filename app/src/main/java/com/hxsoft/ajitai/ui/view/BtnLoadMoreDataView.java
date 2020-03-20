package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.CommonMessageInfo;

import java.util.ArrayList;

/**
 * Created by lidengyao on 2016-10-10 0010.
 */
public interface BtnLoadMoreDataView  extends BaseMvpView {
    void Success(ArrayList<CommonMessageInfo> model);
}
