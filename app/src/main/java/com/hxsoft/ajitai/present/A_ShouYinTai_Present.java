package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.ui.view.A_ShouYinTai_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ShouYinTai_Present extends BasePresent<A_ShouYinTai_View> {


    //微信预下单
    public void wxPayAppPay(String orderNo, String body, Context context) {
        String tip = "A_ShouYinTai_Present-wxPayAppPay-微信预下单(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<String>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).wxPayAppPay(orderNo, body);
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
                    getView().wxPayAppPaySuccess(model);
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
        }, context));
    }

    //支付宝预下单
    public void alipay(String orderNo, String subject, Context context) {
        String tip = "A_ShouYinTai_Present-alipay-支付宝预下单(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<String>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).alipay(orderNo, subject);
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
                    getView().alipaySuccess(model);
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
        }, context));
    }

    //阿吉泰钱包支付
    public void payAjitaipayPay(String orderNo, Double originalAmount,String password, Context context) {
        String tip = "A_ShouYinTai_Present-payAjitaipayPay-阿吉泰钱包支付(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<String>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).payAjitaipayPay(orderNo, originalAmount,password);
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
                    getView().payAjitaipayPaySuccess(model);
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
        }, context));
    }


    //钱包余额
    public void ajitaipayQueryBalance(Context context) {
        String tip = "A_ShouYinTai_Present-goodsCgoodsPagebytype-钱包余额(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<Double>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).
                ajitaipayQueryBalance();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Double>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Double model) {
                if (getView() != null) {
                    getView().ajitaipayQueryBalanceSuccess(model);
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
        }, context));
    }

}
