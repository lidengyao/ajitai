package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.PhoneLoginInfo;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.ui.view.LoginView;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ShouHuoDiZhi_Present extends BasePresent<A_ShouHuoDiZhi_View> {


    public void adminCuseraddressPage(Integer current, Integer size, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddressPage-邮寄地址查询(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<Cuseraddress_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressPage(current, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Cuseraddress_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Cuseraddress_Info model) {
                if (getView() != null) {
                    getView().adminCuseraddressPageSuccess(model);
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
