package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_UserUpdatecurrent_Bean;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.ui.view.A_GeRenXinXi_View;
import com.hxsoft.ajitai.ui.view.A_ShiPinZhiBo_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_ShiPinZhiBo_Present extends BasePresent<A_ShiPinZhiBo_View> {

    //直播列表
    public void cvideostreamAlivepage(Context context) {

        String tip = "A_ShiPinZhiBo_Present-cvideostreamAlivepage-直播列表\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_ALive_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).cvideostreamAlivepage();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_ALive_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_ALive_Total_Info model) {
                if (getView() != null) {
                    getView().cvideostreamAlivepageSuccess(model);
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
