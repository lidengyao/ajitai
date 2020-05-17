package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;
import com.hxsoft.ajitai.model.bean.A_User_Info;

import java.util.ArrayList;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_GanWu_View extends BaseMvpView {

    void queryConsciousSuccess(A_Conscious_Total_Info model);

    //点攒
    void thumbConsciousSuccess(Boolean model);

    //取消点攒
    void deleteThumbConsciousSuccess(Boolean model);

    //评论
    void commentConsciousSuccess(ArrayList<A_Conscious_Info.CommentsBean> model);

    //回复评论
    void commentreplyConsciousSuccess(ArrayList<A_Conscious_Info.CommentsBean> model);

    void onFailure(int code, String msg);
}
