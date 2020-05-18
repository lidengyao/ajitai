package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_ShiPinZhiBo_XiangQing_View extends BaseMvpView {

    void cvideostreamViewSuccess(A_Cvideostream_Info model);

    //参加直播
    void cvideostreamAttendSuccess(Boolean model);

    //取消参加直播
    void cvideostreamCancleSuccess(Boolean model);

    //进入直播间
    void cvideostreamEnterSuccess(Boolean model);

    //离开直播间
    void cvideostreamLeaveSuccess(Boolean model);

    void onFailure(int code, String msg);
}
