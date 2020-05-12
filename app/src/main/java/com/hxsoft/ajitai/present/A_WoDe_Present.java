package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.ui.view.A_WoDe_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_WoDe_Present extends BasePresent<A_WoDe_View> {

    //获取当前用户基本信息
    public void userInfo( Context context) {
        String tip = "A_WoDe_Present-userInfo-获取当前用户基本信息\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_User_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).userInfo();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_User_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_User_Info model) {
                if (getView() != null) {
                    getView().userInfoSuccess(model);
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
        },context));
    }
}
