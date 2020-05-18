package com.hxsoft.ajitai.ui.view;

import com.hxsoft.ajitai.base.BaseMvpView;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Info;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;

/**
 * Created by jinxh on 16/6/15.
 */
public interface A_YinPinZhiBo_XiangQing_View extends BaseMvpView {

    void cmediaclassesSuccess(A_Cmediaclasses_Info model);

    //参加音频课
    void cmediaclassesAttendSuccess(Boolean model);

    //取消参加音频课
    void cmediaclassesCancleSuccess(Boolean model);

    //进入直播间
    void cmediaclassesEnterSuccess(Boolean model);

    //离开直播间
    void cmediaclassesLeaveSuccess(Boolean model);

    void onFailure(int code, String msg);
}
