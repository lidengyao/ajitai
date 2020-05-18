package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_View;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_XiangQing_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ShiPinZhiBo_XiangQing_Present extends BasePresent<A_ShiPinZhiBo_XiangQing_View> {

    //直播详情
    public void courseCvideostreamView(Integer vid, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_Present-courseCvideostreamView-直播详情\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_Cvideostream_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).courseCvideostreamView(vid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Cvideostream_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Cvideostream_Info model) {
                if (getView() != null) {
                    getView().cvideostreamViewSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //参加直播
    public void cvideostreamAttend(Integer vid, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_Present-courseCvideostreamAttend-参加直播\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideostreamAttend(vid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cvideostreamAttendSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //取消直播详情
    public void cvideostreamCancle(Integer vid, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_Present-courseCvideostreamCancle-取消直播详情\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideostreamCancle(vid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cvideostreamCancleSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //进入直播间
    public void cvideostreamEnter(Integer vid, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_Present-cvideostreamEnter-进入直播间\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideostreamEnter(vid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cvideostreamEnterSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //离开直播间
    public void cvideostreamLeave(Integer vid, Context context) {

        String tip = "A_ShiPinZhiBo_XiangQing_Present-courseCvideostreamCancle-离开直播间\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideostreamLeave(vid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cvideostreamLeaveSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    FailOpeater.SetFail(code, tip, msg, context);
                }
            }

            @Override
            public void onCompleted() {
                if (getView() != null) {
                    getView().dismissLoading();
                }
            }
        }, context));
    }


}
