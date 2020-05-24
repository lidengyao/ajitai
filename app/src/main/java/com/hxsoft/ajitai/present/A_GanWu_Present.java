package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.model.info.CommentConscious_Bean;
import com.hxsoft.ajitai.model.info.CommentreplyConscious_Bean;
import com.hxsoft.ajitai.ui.view.A_GanWu_View;
import com.hxsoft.ajitai.ui.view.A_WoDe_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import java.util.ArrayList;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_GanWu_Present extends BasePresent<A_GanWu_View> {
    //获取当前用户基本信息
    public void userInfo(Context context) {
        String tip = "A_WoDe_Present-userInfo-获取当前用户基本信息\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_User_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).userInfo();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_User_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_User_Info model) {
                if (getView() != null) {
                    getView().userInfoSuccess(model);
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

    //感悟列表
    public void queryConscious(Integer page, Integer size, Context context) {
        String tip = "A_GanWu_Present-queryConscious-感悟列表\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<A_Conscious_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).queryConscious(page, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Conscious_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Conscious_Total_Info model) {
                if (getView() != null) {
                    getView().queryConsciousSuccess(model);
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
//                    getView().dismissLoading();
                }
            }
        }, context));
    }

    //感悟点攒
    public void thumbConscious(String cid, Context context) {
        String tip = "A_GanWu_Present-thumbConscious-感悟点攒\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).thumbConscious(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().thumbConsciousSuccess(model);
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


    //取消点攒
    public void deleteThumbConscious(String cid, Context context) {
        String tip = "A_GanWu_Present-deleteThumbConscious-取消点攒\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).deleteThumbConscious(cid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Boolean>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Boolean model) {
                if (getView() != null) {
                    getView().deleteThumbConsciousSuccess(model);
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

    //评论
    public void commentConscious(CommentConscious_Bean commentConscious_bean, Context context) {
        String tip = "A_GanWu_Present-commentConscious-评论\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<ArrayList<A_Conscious_Info.CommentsBean>>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).commentConscious(commentConscious_bean);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<A_Conscious_Info.CommentsBean>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<A_Conscious_Info.CommentsBean> model) {
                if (getView() != null) {
                    getView().commentConsciousSuccess(model);
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

    //回复评论
    public void commentreplyConscious(CommentreplyConscious_Bean commentreplyConscious_bean, Context context) {
        String tip = "A_GanWu_Present-commentreplyConsciousSuccess-回复评论\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<ArrayList<A_Conscious_Info.CommentsBean>>> observable =
                RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).commentreplyConscious(commentreplyConscious_bean);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<A_Conscious_Info.CommentsBean>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<A_Conscious_Info.CommentsBean> model) {
                if (getView() != null) {
                    getView().commentreplyConsciousSuccess(model);
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
//                    getView().dismissLoading();
                }
            }
        }, context));
    }
}
