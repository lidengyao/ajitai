package com.hxsoft.ajitai.model.api;

import com.hxsoft.ajitai.model.bean.A_Conscious_Info;
import com.hxsoft.ajitai.model.bean.A_Conscious_Total_Info;
import com.hxsoft.ajitai.model.bean.A_Cuseraddress_Bean;
import com.hxsoft.ajitai.model.bean.A_Cuserreceipt_Bean;
import com.hxsoft.ajitai.model.bean.A_UserUpdatecurrent_Bean;
import com.hxsoft.ajitai.model.bean.A_LoginBean;
import com.hxsoft.ajitai.model.bean.A_LoginInfo;
import com.hxsoft.ajitai.model.bean.A_OauthTokenBean;
import com.hxsoft.ajitai.model.bean.A_PushChecknumBean;
import com.hxsoft.ajitai.model.bean.A_User_Info;
import com.hxsoft.ajitai.model.info.A_ALive_Total_Info;
import com.hxsoft.ajitai.model.info.A_Order_Info;
import com.hxsoft.ajitai.model.info.A_Order_Total_Info;
import com.hxsoft.ajitai.model.info.CommentConscious_Bean;
import com.hxsoft.ajitai.model.info.CreateCconscious_Bean;
import com.hxsoft.ajitai.model.info.CreateOrder_Bean;
import com.hxsoft.ajitai.model.info.CreateOrder_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Info;
import com.hxsoft.ajitai.model.info.Cuseraddress_Total_Info;
import com.hxsoft.ajitai.model.info.Cuserreceipt_Info;
import com.hxsoft.ajitai.model.info.KeCheng_Info;
import com.hxsoft.ajitai.model.info.OauthToken_Info;
import com.hxsoft.ajitai.model.info.Sysarea_Info;

import java.util.ArrayList;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
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
    @POST("auth/oauth/token")
    Observable<ResponseBean<OauthToken_Info>> oauthToken(@Body A_OauthTokenBean a_oauthTokenBean);

    //退出登录
    @DELETE("auth/token/logout")
    Observable<ResponseBean<String>> authTokenLogout();


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


    //邮寄地址查询(APP)
    @GET("admin/cuseraddress/page")
    Observable<ResponseBean<Cuseraddress_Total_Info>> adminCuseraddressPage(@Query("page") Integer current,
                                                                            @Query("size") Integer size);

    //邮寄地址-新增
    @POST("admin/cuseraddress")
    Observable<ResponseBean<Boolean>> adminCuseraddressAdd(@Body A_Cuseraddress_Bean a_cuseraddress_bean);


    //邮寄地址-修改
    @PUT("admin/cuseraddress")
    Observable<ResponseBean<Boolean>> adminCuseraddressUpdate(@Body A_Cuseraddress_Bean a_cuseraddress_bean);

    //邮寄地址-删除
    @DELETE("admin/cuseraddress/{aid}")
    Observable<ResponseBean<Boolean>> adminCuseraddressDelete(@Path("aid") Integer aid);


    //发票查询(APP)
    @GET("admin/cuserreceipt/page")
    Observable<ResponseBean<Cuserreceipt_Info>> adminCuserreceiptPage(@Query("current") Integer current,
                                                                      @Query("size") Integer size);

    //发票-新增
    @POST("admin/cuserreceipt")
    Observable<ResponseBean<Boolean>> adminCuserreceiptAdd(@Body A_Cuserreceipt_Bean a_cuserreceipt_bean);


    //发票-修改
    @PUT("admin/cuserreceipt")
    Observable<ResponseBean<Boolean>> adminCuserreceiptUpdate(@Body A_Cuserreceipt_Bean a_cuserreceipt_bean);

    //发票-删除
    @DELETE("admin/cuserreceipt/{rid}")
    Observable<ResponseBean<Boolean>> adminCuserreceiptDelete(@Path("rid") Integer rid);


    //请求地址区域信息
    @GET("dict/sysarea/gettreelist/1")
    Observable<ResponseBean<ArrayList<Sysarea_Info>>> dictSysareaGettreelist();


    //根据上级ID获取所有的区域子节点
    @GET("dict/sysarea/gettreelistbyupid/{upid}")
    Observable<ResponseBean<ArrayList<Sysarea_Info>>> dictSysareaegettreelistbyupid(@Path("upid") Integer upid);


    //订单(APP)
    @GET("order/order/page")
    Observable<ResponseBean<A_Order_Total_Info>> orderPage(@Query("current") Integer current,
                                                           @Query("size") Integer size,
                                                           @Query("status") Integer status);

    //订单详情(APP)
    @GET("order/order/query/{orderNo}")
    Observable<ResponseBean<A_Order_Info>> orderQuery(@Path("orderNo") String orderNo);

    //取消订单
    @PUT("order/order/cannel/{orderNo}")
    Observable<ResponseBean<String>> orderCannel(@Path("orderNo") String orderNo);


    //微信下单
    @POST("pay/wxPay/appPay")
    Observable<ResponseBean<String>> wxPayAppPay(@Query("orderNo") String orderNo,
                                                 @Query("body") String body);

    //支付宝下单
    @PUT("pay/aliPay/appPay")
    Observable<ResponseBean<String>> alipay(@Query("orderNo") String orderNo, @Query("subject") String subject);


    //阿吉泰钱包支付
    @PUT("pay/ajitaipay/pay")
    Observable<ResponseBean<String>> payAjitaipayPay(@Query("orderNo") String orderNo,
                                                     @Query("originalAmount") Double originalAmount,
                                                     @Query("subject") String subject,
                                                     @Query("password") String password);

    //获取当前课程套餐(APP)
    @GET("goods/cgoods/pagebytype")
    Observable<ResponseBean<KeCheng_Info>> goodsCgoodsPagebytype(@Query("current") Integer current,
                                                                 @Query("size") Integer size,
                                                                 @Query("type") Integer type);

    //获取当前课程套餐(APP)
    @GET("goods/cgoods/courselist")
    Observable<ResponseBean<ArrayList<KeCheng_Info>>> goodsCgoodsCourselist();

    //钱包余额(APP)
    @GET("pay/ajitaipay/queryBalance")
    Observable<ResponseBean<Double>> ajitaipayQueryBalance();

    //获取默认寄件地址(APP)
    @GET("admin/cuseraddress/defaultbyperson")
    Observable<ResponseBean<Cuseraddress_Info>> adminCuseraddressDefaultbyperson();


    //创建订单-购买课程
    @POST("order/order/create")
    Observable<ResponseBean<CreateOrder_Info>> orderCreate(@Body CreateOrder_Bean createOrder_bean);


    //感悟列表
    @GET("conscious/cconscious")
    Observable<ResponseBean<A_Conscious_Total_Info>> queryConscious(@Query("page") Integer page,
                                                                    @Query("size") Integer size);

    //发布感悟
    @POST("conscious/cconscious")
    Observable<ResponseBean<Boolean>> postConscious(@Body CreateCconscious_Bean createCconscious_bean);

    //感悟点攒
    @POST("conscious/cconscious/thumb/{cid}")
    Observable<ResponseBean<Boolean>> thumbConscious(@Path("cid") String cid);

    //取消点攒
    @DELETE("conscious/cconscious/thumb/{cid}")
    Observable<ResponseBean<Boolean>> deleteThumbConscious(@Path("cid") String cid);


    //评论
    @POST("conscious/cconscious/comment")
    Observable<ResponseBean<ArrayList<A_Conscious_Info.CommentsBean>>> commentConscious(@Body CommentConscious_Bean commentConscious_bean);

    //直播列表
    @GET("course/cvideostream/alivepage")
    Observable<ResponseBean<A_ALive_Total_Info>> cvideostreamAlivepage();
}
