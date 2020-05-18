package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.model.info.A_Cmediaclasses_Total_Info;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_View;
import com.hxsoft.ajitai.ui.view.A_YinPinZhiBo_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_YinPinZhiBo_Present extends BasePresent<A_YinPinZhiBo_View> {

    //音频直播列表
    public void cmediaclassesPageSuccess(Integer page, Integer size, Integer skind, Context context) {

        String tip = "A_YinPinZhiBo_Present-cmediaclassesPage-音频直播列表\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_Cmediaclasses_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cmediaclassesPage(page, size, skind);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Cmediaclasses_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Cmediaclasses_Total_Info model) {
                if (getView() != null) {
                    getView().cmediaclassesPageSuccess(model);
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
