package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_LoginBean;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.ui.view.A_LoginView;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_LoginPresent extends BasePresent<A_LoginView> {

    //密码登录
    public void login(A_LoginBean a_loginBean, Context context) {
        String tip = "A_LoginPresent-login-密码登录\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_LoginInfo>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).login(a_loginBean);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_LoginInfo>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_LoginInfo model) {
                if (getView() != null) {
                    getView().loginSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().showMessage(LogCode.GetCode(tip) + msg);
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
