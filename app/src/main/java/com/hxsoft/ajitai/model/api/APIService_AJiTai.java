package com.hxsoft.ajitai.model.api;

import com.hxsoft.ajitai.model.bean.A_UserUpdatecurrent_Bean;
import com.hxsoft.ajitai.model.bean.A_LoginBean;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.model.bean.A_OauthTokenBean;
import com.hxsoft.ajitai.model.bean.A_PushChecknumBean;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.model.info.OauthToken_Info;
import com.hxsoft.ajitai.model.info.UpLoadInfo;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jinxh on 16/2/17.
 */
public interface APIService_AJiTai {

    //密码登录
    @POST("auth/oauth/token")
    Observable<ResponseBean<A_LoginInfo>> login(@Body A_LoginBean a_loginBean);

    //获取验证码
    @POST("push/checknum")
    Observable<ResponseBean<Boolean>> pushChecknum(@Body A_PushChecknumBean a_pushChecknumBean);

    //验证码登录
    @POST("oauth/token")
    Observable<ResponseBean<OauthToken_Info>> oauthToken(@Body A_OauthTokenBean a_oauthTokenBean);

    //获取当前用户基本信息
    @GET("admin/user/info")
    Observable<ResponseBean<A_User_Info>> userInfo();

    //修改当前用户基本信息
    @PUT("admin/user/updatecurrent")
    Observable<ResponseBean<Boolean>> adminUserUpdatecurrent(@Body A_UserUpdatecurrent_Bean a_userUpdatecurrent_bean);

    //附件上传
    @POST("push/upload")
    @Multipart
    Observable<ResponseBean<String>> pushUpload(@Part("file\"; filename=\"1.png") RequestBody file);

}
