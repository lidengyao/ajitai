package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.info.A_Carticlecomment_Total_Info;
import com.hxsoft.ajitai.model.info.A_addcomment_Bean;
import com.hxsoft.ajitai.model.info.A_carticlecomment_Bean;
import com.hxsoft.ajitai.model.info.Carticle_Info;
import com.hxsoft.ajitai.model.info.WenZhang_Total_Info;
import com.hxsoft.ajitai.ui.view.A_WenZhangYueDu_View;
import com.hxsoft.ajitai.ui.view.A_WenZhangYueDu_XiangQing_View;
import com.hxsoft.ajitai.utils.FailOpeater;
import com.hxsoft.ajitai.utils.FileUtils;

import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_WenZhangYueDu_XiangQing_Present extends BasePresent<A_WenZhangYueDu_XiangQing_View> {


    //心灵甘露详情
    public void carticleDetail(Integer aid, Context context) {
        String tip = "A_WenZhangYueDu_XiangQing_Present-carticleDetail-心灵甘露详情(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<Carticle_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).carticleDetail(aid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<Carticle_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
//                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(Carticle_Info model) {
                if (getView() != null) {
                    getView().carticleDetailSuccess(model);
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


    //评论列表
    public void carticlecommentPage(Integer aid, Integer page, Integer size, Context context) {
        String tip = "A_WenZhangYueDu_XiangQing_Present-carticlecommentPage-评论列表(APP)\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<A_Carticlecomment_Total_Info>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).carticlecommentPage(aid, page, size);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<A_Carticlecomment_Total_Info>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(A_Carticlecomment_Total_Info model) {
                if (getView() != null) {
                    getView().carticlecommentPageSuccess(model);
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


    //添加评论
    public void carticlecommentAddcomment(A_carticlecomment_Bean a_addcomment_bean, Context context) {

        String tip = "A_WenZhangYueDu_XiangQing_Present-carticlecommentAddcomment-添加评论\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).carticlecommentAddcomment(a_addcomment_bean);
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
                    getView().carticlecommentAddcommentSuccess(model);
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


    //文章点攒
    public void heartnectarThumb(Integer articleId, Context context) {

        String tip = "A_WenZhangYueDu_XiangQing_Present-heartnectarThumb-文章点攒\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).heartnectarThumb(articleId);
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
                    getView().heartnectarThumbSuccess(model);
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


    //文章取消点攒
    public void heartnectarCancleThumb(Integer articleId, Context context) {

        String tip = "A_WenZhangYueDu_XiangQing_Present-heartnectarCancleThumb-文章点攒\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).heartnectarcancleThumb(articleId);
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
                    getView().heartnectarCancleThumbSuccess(model);
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



    //文章阅读
    public void heartnectarClick(Integer articleId, Context context) {

        String tip = "A_WenZhangYueDu_XiangQing_Present-heartnectarClick-文章阅读\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).heartnectarClick(articleId);
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
                    getView().heartnectarClickSuccess(model);
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
