package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.Cuseraddress_Total_Info;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ShouHuoDiZhi_Present extends BasePresent<A_ShouHuoDiZhi_View> {


    public void adminCuseraddressPage(Integer page, Integer size, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddressPage-邮寄地址查询(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<Cuseraddress_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressPage(page, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Cuseraddress_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Cuseraddress_Total_Info model) {
                if (getView() != null) {
                    getView().adminCuseraddressPageSuccess(model);
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
