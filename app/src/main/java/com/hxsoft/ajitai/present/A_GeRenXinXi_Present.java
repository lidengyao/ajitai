package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_UserUpdatecurrent_Bean;
import com.hxsoft.ajitai.model.info.UpLoadInfo;
import com.hxsoft.ajitai.ui.view.A_GeRenXinXi_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_GeRenXinXi_Present extends BasePresent<A_GeRenXinXi_View> {

    //修改当前用户基本信息
    public void adminUserUpdatecurrent(A_UserUpdatecurrent_Bean a_userUpdatecurrent_bean, Context context) {

        String tip = "A_GeRenXinXi_Present-adminUserUpdatecurrent-密码登录\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminUserUpdatecurrent(a_userUpdatecurrent_bean);
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
                    getView().userUpdatecurrentSuccess(model);
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

    //附件上传
    public void pushUpload(File file, Context context) {
        String tip = "A_GeRenXinXi_Present-pushUpload-附件头像\r\n";
        FileUtils.writeLogToFile(tip);
        RequestBody requestBody = MultipartBody.create(MediaType.parse("multipart/form-data"), file);

        Observable<ResponseBean<String>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).pushUpload(requestBody);
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
                    getView().pushUploadSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(code, LogCode.GetCode("Y_WeiChuLi_AddPresent-addDataUpload") + msg);
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
