package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.model.bean.A_OauthTokenBean;
import com.hxsoft.ajitai.model.bean.A_PushChecknumBean;
import com.hxsoft.ajitai.model.info.OauthToken_Info;
import com.hxsoft.ajitai.ui.view.A_YanZhengMa_LoginView;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_YanZhengMa_LoginPresent extends BasePresent<A_YanZhengMa_LoginView> {

    //发送验证码
    public void pushChecknum(A_PushChecknumBean a_pushChecknumBean, Context context) {
        String tip = "A_YanZhengMa_LoginPresent-pushChecknum-发送验证码\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).pushChecknum(a_pushChecknumBean);
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
                    getView().pushChecknumSuccess(model);
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

    //验证码登陆
    public void oauthToken(A_OauthTokenBean a_oauthTokenBean, Context context) {
        String tip = "A_YanZhengMa_LoginPresent-oauthToken-验证码登陆\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_LoginInfo>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).oauthToken(a_oauthTokenBean);
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
                    getView().oauthTokenSuccess(model);
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
