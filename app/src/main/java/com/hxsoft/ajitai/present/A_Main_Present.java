package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.model.info.VersionInfo;
import com.hxsoft.ajitai.ui.view.A_Main_View;
import com.hxsoft.ajitai.ui.view.LoginView;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_Main_Present extends BasePresent<A_Main_View> {


    public void checkVersion(Context context) {
        Observable<ResponseBean<VersionInfo>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).checkVersion();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<VersionInfo>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(VersionInfo model) {
                if (getView() != null) {
                    getView().checkVersionSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().showMessage(msg);
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
