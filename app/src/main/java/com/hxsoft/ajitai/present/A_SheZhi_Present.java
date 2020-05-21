package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.VersionInfo;
import com.hxsoft.ajitai.ui.view.A_SheZhi_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_SheZhi_Present extends BasePresent<A_SheZhi_View> {


    //退出登录
    public void authTokenLogout(Context context) {
        String tip = "A_SheZhi_Present-authTokenLogout-退出登录(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<String>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).authTokenLogout();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<String>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(String model) {
                if (getView() != null) {
                    getView().authTokenLogoutSuccess(model);
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

    //版本检测
    public void checkVersion(Context context) {
        String tip = "A_SheZhi_Present-checkVersion-版本检测(APP)\r\n";
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
