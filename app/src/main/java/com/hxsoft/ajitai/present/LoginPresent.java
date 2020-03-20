package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.ResponseBean;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.ui.view.LoginView;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class LoginPresent extends BasePresent<LoginView> {
    public void login(final String phone, String password, Context context) {
        Observable<ResponseBean<PhoneLoginInfo>> observable = RetrofitClient.builderRetrofit(context).create(APIService.class).phoneLogin(phone, password);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<PhoneLoginInfo>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(PhoneLoginInfo model) {
                if (getView() != null) {
                    getView().loginSuccess(model);
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
        },context));
    }

}
