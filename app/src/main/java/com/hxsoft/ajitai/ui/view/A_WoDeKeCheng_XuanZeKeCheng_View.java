package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.CreateOrder_Info;
import com.hxsoft.ajitai.model.info.KeCheng_Info;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_WoDeKeCheng_XuanZeKeCheng_View extends BaseMvpView {
    void goodsCgoodsCourselistSuccess(ArrayList<KeCheng_Info> model);

    void orderCreateSuccess(CreateOrder_Info model);

    void onFailure(int code, String msg);
}
