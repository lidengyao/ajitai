package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Info;
import com.hxsoft.ajitai.model.info.A_Cvideostream_Info;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_XiangQing_View;
import com.hxsoft.ajitai.ui.view.A_YinPinZhiBo_XiangQing_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_YinPinZhiBo_XiangQing_Present extends BasePresent<A_YinPinZhiBo_XiangQing_View> {

    //音频直播详情
    public void cmediaclasses(Integer cid, Context context) {

        String tip = "A_YinPinZhiBo_XiangQing_Present-cmediaclasses-音频直播详情\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_Cmediaclasses_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cmediaclasses(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Cmediaclasses_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Cmediaclasses_Info model) {
                if (getView() != null) {
                    getView().cmediaclassesSuccess(model);
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

    //参加音频直播
    public void cmediaclassesAttend(Integer cid, Context context) {

        String tip = "A_YinPinZhiBo_XiangQing_Present-cmediaclassesAttend-参加直播\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cmediaclassesAttend(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cmediaclassesAttendSuccess(model);
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
//                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //取消直播详情
    public void cmediaclassesCancle(Integer cid, Context context) {

        String tip = "A_YinPinZhiBo_XiangQing_Present-cmediaclassesCancle-取消直播详情\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cmediaclassesCancle(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cmediaclassesCancleSuccess(model);
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
//                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //进入直播间
    public void cmediaclassesEnter(Integer cid, Context context) {

        String tip = "A_YinPinZhiBo_XiangQing_Present-cmediaclassesEnter-进入直播间\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cmediaclassesEnter(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cmediaclassesEnterSuccess(model);
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
//                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //离开直播间
    public void cmediaclassesLeave(Integer cid, Context context) {

        String tip = "A_YinPinZhiBo_XiangQing_Present-cmediaclassesLeave-离开直播间\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cmediaclassesLeave(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().cmediaclassesLeaveSuccess(model);
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
//                    getView().dismissLoading();
                }
            }
        }, context));
    }


}
