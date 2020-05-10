package com.hxsoft.ajitai.present;

import android.content.Context;

import com.hxsoft.ajitai.base.BasePresent;
import com.hxsoft.ajitai.model.api.APIService_AJiTai;
import com.hxsoft.ajitai.model.api.ApiCallBack;
import com.hxsoft.ajitai.model.api.ApiSubscriber;
import com.hxsoft.ajitai.model.api.ResponseBean;
import com.hxsoft.ajitai.model.api.RetrofitClient;
import com.hxsoft.ajitai.model.bean.A_Cuseraddress_Bean;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Cuserreceipt_Info;
import com.hxsoft.ajitai.model.info.Sysarea_Info;
import com.hxsoft.ajitai.ui.view.A_ShouHuoDiZhi_View;
import com.hxsoft.ajitai.ui.view.A_XinJianShouHuoDiZhi_View;
import com.hxsoft.ajitai.utils.FileUtils;
import com.hxsoft.ajitai.utils.LogCode;

import java.util.ArrayList;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by jinxh on 16/2/1.
 */
public class A_XinJianShouHuoDiZhi_Present extends BasePresent<A_XinJianShouHuoDiZhi_View> {


    //邮寄地址新增
    public void adminCuseraddressAdd(A_Cuseraddress_Bean a_cuseraddress_bean, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddress-邮寄地址新增(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressAdd(a_cuseraddress_bean);

        // 此处请求接口
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
                    getView().adminCuseraddressAddSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(code, LogCode.GetCode(tip) + msg);
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

    //邮寄地址修改
    public void adminCuseraddressUpdate(A_Cuseraddress_Bean a_cuseraddress_bean, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddress-邮寄地址修改(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressUpdate(a_cuseraddress_bean);

        // 此处请求接口
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
                    getView().adminCuseraddressUpdateSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(code, LogCode.GetCode(tip) + msg);
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

    //邮寄地址删除
    public void adminCuseraddressDelete(Integer aid, Context context) {
        String tip = "A_ShouHuoDiZhi_Present-adminCuseraddress-邮寄地址新增(APP)\r\n";
        FileUtils.writeLogToFile(tip);
        Observable<ResponseBean<Boolean>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).adminCuseraddressDelete(aid);

        // 此处请求接口
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
                    getView().adminCuseraddressDeleteSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(code, LogCode.GetCode(tip) + msg);
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


    //请求地址区域信息
    public void dictSysareaGettreelist(Context context) {
        String tip = "A_XinJianShouHuoDiZhi_Present-dictSysareaGettreelist-请求地址区域信息\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<ArrayList<Sysarea_Info>>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).dictSysareaGettreelist();
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<Sysarea_Info>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<Sysarea_Info> model) {
                if (getView() != null) {
                    getView().dictSysareaettreelistSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(0, msg);
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


    //根据上级ID获取所有的区域子节点_One
    public void dictSysareaegettreelistbyupidOne(Integer upid, Context context) {
        String tip = "A_XinJianShouHuoDiZhi_Present-dictSysareaegettreelistbyupidOne-根据上级ID获取所有的区域子节点\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<ArrayList<Sysarea_Info>>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).dictSysareaegettreelistbyupid(upid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<Sysarea_Info>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<Sysarea_Info> model) {
                if (getView() != null) {
                    getView().dictSysareaegettreelistbyupidOneSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(1, msg);
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

    //根据上级ID获取所有的区域子节点_Two
    public void dictSysareaegettreelistbyupidTwo(Integer upid, Context context) {
        String tip = "A_XinJianShouHuoDiZhi_Present-dictSysareaegettreelistbyupidTwo-根据上级ID获取所有的区域子节点\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<ArrayList<Sysarea_Info>>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).dictSysareaegettreelistbyupid(upid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<Sysarea_Info>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<Sysarea_Info> model) {
                if (getView() != null) {
                    getView().dictSysareaegettreelistbyupidTwoSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(2, msg);
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

    //根据上级ID获取所有的区域子节点_Three
    public void dictSysareaegettreelistbyupidThree(Integer upid, Context context) {
        String tip = "A_XinJianShouHuoDiZhi_Present-dictSysareaegettreelistbyupidThree-根据上级ID获取所有的区域子节点\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<ArrayList<Sysarea_Info>>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).dictSysareaegettreelistbyupid(upid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<Sysarea_Info>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<Sysarea_Info> model) {
                if (getView() != null) {
                    getView().dictSysareaegettreelistbyupidThreeSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(3, msg);
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

    //根据上级ID获取所有的区域子节点_Four
    public void dictSysareaegettreelistbyupidFour(Integer upid, Context context) {
        String tip = "A_XinJianShouHuoDiZhi_Present-dictSysareaegettreelistbyupidFour-根据上级ID获取所有的区域子节点\r\n";
        FileUtils.writeLogToFile(tip);

        Observable<ResponseBean<ArrayList<Sysarea_Info>>> observable = RetrofitClient.builderRetrofit(context).create(APIService_AJiTai.class).dictSysareaegettreelistbyupid(upid);
        addIOSubscription(observable, new ApiSubscriber(new ApiCallBack<ArrayList<Sysarea_Info>>() {
            @Override
            public void onStart() {
                super.onStart();
                if (getView() != null) {
                    getView().showLoading();
                }
            }

            @Override
            public void onSuccess(ArrayList<Sysarea_Info> model) {
                if (getView() != null) {
                    getView().dictSysareaegettreelistbyupidFourSuccess(model);
                }
            }

            @Override
            public void onFailure(int code, String msg) {
                if (getView() != null) {
                    getView().onFailure(4, msg);
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
