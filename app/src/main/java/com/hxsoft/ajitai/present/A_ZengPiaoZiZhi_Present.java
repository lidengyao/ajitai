package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.Cuserreceipt_Info;
import com.hxsoft.ajitai.ui.view.A_ZengPiaoZiZhi_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ZengPiaoZiZhi_Present extends BasePresent<A_ZengPiaoZiZhi_View> {


    public void adminCuserreceiptPage(Integer current, Integer size, Context context) {
        String tip = "A_ZengPiaoZiZhi_Present-adminCuserreceiptPage-发票地址查询(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<Cuserreceipt_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuserreceiptPage(current, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Cuserreceipt_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Cuserreceipt_Info model) {
                if (getView() != null) {
                    getView().adminCuserreceiptPageSuccess(model);
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
