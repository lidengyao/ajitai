package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.A_Caudiocomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cvideocomment_Total_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_YinPinZhiBo_XiangQing_HuDong_View extends BaseMvpView {


    //直播添加评论
    void caudiocommentAddcommentSuccess(Boolean model);

    //直播评论分页查询
    void caudiocommentPageSuccess(A_Caudiocomment_Total_Info model);

    void onFailure(int code, String msg);
}
