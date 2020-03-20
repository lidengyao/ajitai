package com.hxsoft.ajitai.model.api;

import com.hxsoft.ajitai.model.bean.AppOpinion_Bean;
import com.hxsoft.ajitai.model.bean.BaoJingBean;
import com.hxsoft.ajitai.model.bean.Basecode_Bean;
import com.hxsoft.ajitai.model.bean.ChangePwdObject;
import com.hxsoft.ajitai.model.bean.CommonMessageBean;
import com.hxsoft.ajitai.model.bean.DanWeiBeiAn_Bean;
import com.hxsoft.ajitai.model.bean.DanWeiZhuXiao_Bean;
import com.hxsoft.ajitai.model.bean.Driver_Filter_Bean;
import com.hxsoft.ajitai.model.bean.EarlyWarningVo_Filter_Bean;
import com.hxsoft.ajitai.model.bean.FaLvFaGui_Add_Bean;
import com.hxsoft.ajitai.model.bean.HeadImgObject;
import com.hxsoft.ajitai.model.bean.JianChaBean;
import com.hxsoft.ajitai.model.bean.JianChaSearchBean;
import com.hxsoft.ajitai.model.bean.JianChaUpdateBean;
import com.hxsoft.ajitai.model.bean.ListUnitByHighLevel_Bean;
import com.hxsoft.ajitai.model.bean.LoginBean;
import com.hxsoft.ajitai.model.bean.LoginInfo;
import com.hxsoft.ajitai.model.bean.MessageBean;
import com.hxsoft.ajitai.model.bean.QuestionTypeBean;
import com.hxsoft.ajitai.model.bean.Rectify;
import com.hxsoft.ajitai.model.bean.ResponseBean;
import com.hxsoft.ajitai.model.bean.TongZhiGongGao_Add_Bean;
import com.hxsoft.ajitai.model.bean.ToxicAdviceFilter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicCompanyChange_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicCompanyMemberBean;
import com.hxsoft.ajitai.model.bean.ToxicCompanyMemberFilter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicCompany_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicContingencyProfessor_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicLaw_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicLockSearchVo_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicNotice_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicPurchaseApply_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicReservePlan_Filter_Bean;
import com.hxsoft.ajitai.model.bean.ToxicWhouseRecord_Filter_Bean;
import com.hxsoft.ajitai.model.bean.UnitCancel_Filter_Bean;
import com.hxsoft.ajitai.model.bean.UnitVideo_Filter_Bean;
import com.hxsoft.ajitai.model.bean.User_Filter_Bean;
import com.hxsoft.ajitai.model.bean.VideoControlBean;
import com.hxsoft.ajitai.model.bean.W_LoginBean;
import com.hxsoft.ajitai.model.bean.W_LoginInfo;
import com.hxsoft.ajitai.model.bean.W_ToxicCompanyEdit;
import com.hxsoft.ajitai.model.bean.W_ToxicPurchaseApplyEdit;
import com.hxsoft.ajitai.model.bean.W_ToxicPurchaseApplydoBatch;
import com.hxsoft.ajitai.model.bean.W_toxicLockEdit;
import com.hxsoft.ajitai.model.bean.XiuGaiMiMa_Bean;
import com.hxsoft.ajitai.model.bean.YongHuGuanLi_Add_Bean;
import com.hxsoft.ajitai.model.bean.YongHuGuanLi_EditHeadImage_Bean;
import com.hxsoft.ajitai.model.bean.ZhengGaiBean;
import com.hxsoft.ajitai.model.info.*;
import com.hxsoft.ajitai.test.YongHuGuanLi_Info;

import java.util.ArrayList;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jinxh on 16/2/17.
 */
public interface APIService {


    //region 老系统
    //1.1登录
    @POST("user/phoneLogin.do")
    Observable<ResponseBean<PhoneLoginInfo>> phoneLogin(@Query("phone") String phone, @Query("password") String password);


    @POST("user/login")
    Observable<ResponseBean<LoginInfo>> login(@Body LoginBean loginBean);

    @GET("auth/logout")
    Observable<ResponseBean<String>> logout();


    //更新版本检测
    @GET("apppic/apkinfo")
    Observable<ResponseBean<VersionInfo>> checkVersion();

    @GET("user/getuserinfo")
    Observable<ResponseBean<Z_UserInfo>> getuserinfo();


    //环境检测
    @GET("site/list")
    Observable<ResponseBean<ArrayList<GongDiInfo>>> list();


    @Multipart
    @POST("picturedetails/upload")
    Observable<ResponseBean<UpLoadInfo>> upload(@Part("imageFile\"; filename=\"test.png") RequestBody file);

    //更新用户对象信息
    @POST("user/update")
    Observable<ResponseBean<String>> update(@Query("pictureurl") String pictureurl,
                                            @Query("position") String position,
                                            @Query("selfieid") String selfieid,
                                            @Query("uid") String uid,
                                            @Query("usercode") String usercode,
                                            @Query("username") String username,
                                            @Query("userpass") String userpass);

    //更新用户头像
    @POST("user/update")
    Observable<ResponseBean<String>> updateHeadImg(@Body HeadImgObject headImgObject);

    //修改密码
    @POST("user/update")
    Observable<ResponseBean<String>> changepwdSucess(@Body ChangePwdObject changPwdObject);

    @GET("environment/realtimebypid/{pid}")
    Observable<ResponseBean<ArrayList<RealtimeInfo>>> realtimebypid(@Path("pid") Integer pid);

    //检测列表
    @POST("check/searchbystatus/{status}")
    Observable<ResponseBean<JianChaInfo>> searchbystatus(@Body JianChaSearchBean jianChaSearchBean, @Path("status") Integer status);

    //检测详情
    @GET("check/searchbycheckid/{cid}")
    Observable<ResponseBean<JianChaDetailInfo>> checksearchbycheckid(@Path("cid") Integer cid);

    //项目详情
    @GET("project/detail/{pid}")
    Observable<ResponseBean<ProjectDetailInfo>> projectDetail(@Path("pid") Integer pid);

    //消息列表
    @POST("message/list")
    Observable<ResponseBean<XiaoXiInfo>> messagelist(@Body MessageBean messageBean);

    //实时报警列表
    @POST("alert/listbyuidandpage")
    Observable<ResponseBean<BaoJingInfo>> listbyuidandpage(@Body BaoJingBean baoJingBean);

    //历史报警列表
    @POST("alert/hispagebysid/{sid}")
    Observable<ResponseBean<BaoJingInfo>> hispagebysid(@Path("sid") Integer sid, @Body BaoJingBean baoJingBean);

    //报警详情
    @GET("alert/searchreal/{rid}")
    Observable<ResponseBean<BaoJingInfoDetail>> alertsearchrealbirid(@Path("rid") Integer rid);

    //整改列表
    @POST("zhenggai/querypagebycondition")
    Observable<ResponseBean<ZhengGaiInfo>> querypagebycondition(@Body ZhengGaiBean zhengGaiBean);

    //整改详情
    @GET("zhenggai/query/{zid}")
    Observable<ResponseBean<ZhengGaiInfoDetail>> zhenggaiquerybyzid(@Path("zid") Integer zid);

    //视频设备控制开始接口
    @POST("video/start")
    Observable<ResponseBean<String>> videoStart(@Body VideoControlBean videoControlBean);

    //视频设备控制开始接口
    @POST("video/stop")
    Observable<ResponseBean<String>> videoStop(@Body VideoControlBean videoControlBean);


    //消息列表-根据工地sid查询
    @POST("message/list/{sid}")
    Observable<ResponseBean<XiaoXiInfo>> messagelistbysid(@Body MessageBean messageBean, @Path("sid") String sid);

    //问题类型
    @POST("codevalue/listbycondition")
    Observable<ResponseBean<ArrayList<TypeInfo>>> listbycondition_question(@Body QuestionTypeBean questionTypeBean);

    //项目列表
    @GET("project/list/{type}/{level}")
    Observable<ResponseBean<ArrayList<ProjectInfo>>> projectlist(@Path("type") Integer type, @Path("level") Integer level);

    //首页
    @GET("apppic/query/{type}/{pid}")
    Observable<ResponseBean<apppicInfo>> apppicQuery(@Path("type") Integer type, @Path("pid") Integer pid);

    //天气
    @GET("cityenvironment/latest")
    Observable<ResponseBean<CityenvironmentInfo>> Cityenvironment();

    //工地列表by项目id
    @GET("project/getsitebypid/{pid}")
    Observable<ResponseBean<ArrayList<GongDiInfo>>> gongdibyprojectlist(@Path("pid") Integer pid);

    //负责人
    @GET("site/humanduty/{pid}")
    Observable<ResponseBean<ArrayList<FuZeRenInfo>>> humanduty(@Path("pid") Integer pid);

    //新增检查
    @POST("check/add")
    Observable<ResponseBean<String>> checkAdd(@Body JianChaBean jianChaBean);

    //回复新增
    @POST("check/update")
    Observable<ResponseBean<String>> checkAddUpate(@Body JianChaUpdateBean jianChaUpdateBean);

    //修改报警状态
    @GET("alert/updatealertstatus/{rid}/{status}")
    Observable<ResponseBean<String>> updatealertstatus(@Path("rid") Integer rid, @Path("status") Integer status);

    //修改整改状态
    @GET("zhenggai/update/{zid}/{status}")
    Observable<ResponseBean<String>> zhenggaiUpdate(@Path("zid") Integer rid, @Path("status") Integer status);

    @GET("site/graphic/{sid}")
    Observable<ResponseBean<SheBeiInfo>> siteGraphic(@Path("sid") String sid);


    //刷新Access Token
    @POST("auth/refresh-yck_token")
    Observable<ResponseBean<String>> refreshtoken();


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//    @POST("picturedetails/uploadSuccess")
//    Observable<ResponseBean<String>> upload2(@Query("imageBase64") String base64);

    @POST("picturedetails/uploadSuccess")
    Observable<ResponseBean<UpLoadInfo>> upload2(@Query("imageBase64") String imgdata);

    //2.1获取消息接口说明（提示信息、告警信息）
    @POST("message/commonMessage.do")
    Observable<CommonMessageBean<ArrayList<CommonMessageInfo>>> commonMessage(@Query("userId") String userId, @Query("messageMode") String messageMode, @Query("index") String index, @Query("pageSize") String pageSize);

    //5.5获取功能导航界面的Banner图标
    @POST("config/bannerImg.do")
    Observable<ResponseBean<ArrayList<String>>> bannerImg();

    //5.1读取所有大棚状态表接口说明
    @POST("status/pengList.do")
    Observable<ResponseBean<ArrayList<PengListInfo>>> pengList(@Query("userId") String phone, @Query("fnMode") String fnMode);

//
//    @Multipart
//    @POST("img/uploadSuccess.do")
//    Observable<UploadfileBean> uploadImage(
//            @PartMap Map<String, RequestBody> path,
//            @Query("type") int type,
//            @Query("id") String id);

//endregion

    //region 记账系统
    @GET("Login")
    Observable<ResponseBean<String>> login_jz(@Query("phone") String phone, @Query("code") String code);

    //危管系统-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @POST("user/login")
    Observable<ResponseBean<W_LoginInfo>> w_login(@Body W_LoginBean w_loginBean);

    //用户管理查询
    @POST("user/list")
    Observable<ResponseBean<ArrayList<YongHuGuanLi_Info>>> userList(@Query("page") int page, @Query("pageSize") int pageSize, @Body User_Filter_Bean user_filter_bean);


    //用户管理-添加
    @POST("user/user")
    Observable<ResponseBean<String>> user_add(@Body YongHuGuanLi_Add_Bean yongHuGuanLi_add_bean);

    //用户管理-修改头像
    @POST("user/user")
    Observable<ResponseBean<String>> user_edit(@Body YongHuGuanLi_EditHeadImage_Bean yongHuGuanLi_editHeadImage_bean);


    //获取版本信息
    @GET("common/getLatestAppVersion")
    Observable<ResponseBean<AppVersion_Info>> getLatestAppVersion(@Query("type") int type);

    //添加字典节点
    @POST("basecode/add")
    Observable<ResponseBean<String>> basecodeAdd(@Body Basecode_Bean basecode_bean);

    //删除字典节点
    @POST("basecode/del/{id}")
    Observable<ResponseBean<String>> basecodeDelete(@Path("id") int id);

    //法律法规-添加
    @POST("common/addAppOpinion")
    Observable<ResponseBean<String>> addAppOpinion(@Body AppOpinion_Bean appOpinion_bean);

    //首页统计数据
    @GET("common/toxicCount")
    Observable<ResponseBean<toxicCount_Info>> commontoxicCount();


    //上传文件
    @Multipart
    @POST("file/uploadFiles")
    Observable<ResponseBean<UpLoadFileInfo>> uploadFiles(@Part("file1\"; filename=\"test.png") RequestBody file);

    //获取模块列表
    @GET("rule/index")
    Observable<ResponseBean<ArrayList<RuleIndexInfo>>> ruleIndex();


    //获取字典数据
    @GET("/basecode/list")
    Observable<ResponseBean<ArrayList<BaseCodeInfo>>> basecodeList();

    //根据模块获得模块下菜单列表
    @GET("rule/getMenuByUser/{moduleId}")
    Observable<ResponseBean<ArrayList<ChildMenuInfo>>> getMenuByUser(@Path("moduleId") int moduleId);

    //剧毒人员管理查询
    @POST("toxicCompanyMember/list")
    Observable<ResponseBean<ArrayList<RenYuanBeiAn_Info>>> toxicCompanyMember(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicCompanyMemberFilter_Bean toxicCompanyMemberFilter_bean);

    //剧毒人员管理添加
    @POST("toxicCompanyMember/add")
    Observable<ResponseBean<String>> toxicCompanyMemberadd(@Body ToxicCompanyMemberBean toxicCompanyMemberBean);

    //剧毒人员管理查询个人
    @GET("toxicCompanyMember/{id}")
    Observable<ResponseBean<RenYuanBeiAn_Detail_Info>> toxicCompanyMemberDetail(@Path("id") int id);

    //单位备案和单位备案变更查询
    @POST("companyRecord/listCompanyRecord")
    Observable<ResponseBean<ArrayList<CompanyRecord_Info>>> listCompanyRecord(@Query("page") int page, @Query("pageSize") int pageSize, @Body CompanyRecord_Info companyRecord_info);


    //单位备案-基本信息
    @GET("toxicCompany/{id}")
    Observable<ResponseBean<DanWeiBeiAn_JiBen_Info>> toxicCompanyDetail(@Path("id") int id);

    //单位备案初始化-添加
    @POST("unit/add")
    Observable<ResponseBean<String>> unitadd(@Body DanWeiBeiAn_Bean danWeiBeiAn_bean);

    //单位备案-物品信息
    @POST("toxicCompanyWarehouse/unitGoodsList/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAn_WuPin_Info>>> unitGoodsList(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);

    //单位备案-物品信息(新)
    @POST("goods/list/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAn_WuPin_New_Info>>> goodslist(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);

    //单位备案-附件列表
    @POST("unit/unitAttachmentList/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAn_FuJian_Info>>> unitAttachmentList(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);

    //单位备案-人员列表
    @POST("toxicCompanyMember/list/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAn_RenYuan_Info>>> toxicCompanyMemberList(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);

    //单位备案审批
    @POST("toxicCompany/edit")
    Observable<ResponseBean<String>> toxicCompanyEdit(@Body W_ToxicCompanyEdit w_toxicCompanyEdit);

    //单位备案审批-新接口
    @POST("companyRecord/edit")
    Observable<ResponseBean<String>> companyRecordEdit(@Body CompanyRecord_Info companyRecord_info);

    //单位备案变更-是否有变更
    @GET("toxicCompany/{id}")
    Observable<ResponseBean<UnitInfoChangeStatusInfo>> unitInfoChangeStatus(@Path("id") int id);

    //单位备案变更-变更次数
    @GET("companyRecord/countFinishedRecord/{id}")
    Observable<ResponseBean<UnitAllChangeCountInfo>> countFinishedRecord(@Path("id") int id);

    //单位备案变更-变更前后
    @GET("toxicCompany/getBeforeAfterChange/{id}")
    Observable<ResponseBean<BeforeAfterChange_Info>> getBeforeAfterChange(@Path("id") int id);

    //单位备案变更-列表
    @POST("toxicCompanyChange/list")
    Observable<ResponseBean<ArrayList<DanWeiBeiAnBianGeng_Info>>> toxicCompanyChangeList(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicCompanyChange_Filter_Bean toxicCompanyChange_filter_bean);

    //region 单位变更

    //单位备案变更-基本信息 id是单位id
    @GET("/toxicCompanyChange/info/{id}")
    Observable<ResponseBean<DanWeiBeiAnBianGeng_JiBen_Info>> toxicCompanyChangeinfo(@Path("id") int id);

    //单位备案变更-物品信息 id是单位id
    @POST("/goods/goodsBeianList/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAnBianGeng_WuPin_Info>>> goodsBeianChangeList(@Path("id") int id);

    //单位备案变更-附件信息 id是单位id
    @POST("/unit/unitAttachmentChangeList/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAnBianGeng_FuJian_Info>>> unitAttachmentChangeList(@Path("id") int id);

    //单位备案变更-人员信息 id是单位id
    @POST("/member/listMemberChange/{id}")
    Observable<ResponseBean<ArrayList<DanWeiBeiAnBianGeng_RenYuan_Info>>> listMemberChange(@Path("id") int id, @Body DanWeiBeiAnBianGeng_RenYuan_Info danWeiBeiAnBianGeng_renYuan_info);

    //单位备案变更-审核信息 id是单位id
    @GET("/companyRecord/getDoingRecord/{id}")
    Observable<ResponseBean<DanWeiBeiAn_ShenHeXinXi_Info>> getDoingRecord(@Path("id") int id);
    //endregion


    //单位注销-列表
    @POST("unit/cancelList")
    Observable<ResponseBean<ArrayList<DanWeiZhuXiao_Info>>> unitcancelList(@Query("page") int page, @Query("pageSize") int pageSize, @Body UnitCancel_Filter_Bean unitCancel_filter_bean);

    //单位注销-注销
    @POST("unit/cancel")
    Observable<ResponseBean<String>> unitCancel(@Body DanWeiZhuXiao_Bean danWeiZhuXiao_bean);

    //接收公告
    @POST("toxicNotice/list")
    Observable<ResponseBean<ArrayList<TongZhiGongGaoInfo>>> toxicNoticeList(@Query("module") int module, @Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicNotice_Filter_Bean toxicNotice_filter_bean);


    //接收公告
    @POST("unit/listUnitByHighLevel")
    Observable<ResponseBean<ArrayList<Unit_Info>>> listUnitByHighLevel(@Body ListUnitByHighLevel_Bean listUnitByHighLevel_bean);


    //接收公告详情
    @GET("toxicNotice/{dealId}")
    Observable<ResponseBean<TongZhiGongGao_Detail_Info>> toxicNoticeDetail(@Path("dealId") int id);

    //接收公告-添加
    @POST("toxicNotice/add")
    Observable<ResponseBean<String>> tongzhigonggao_add(@Body TongZhiGongGao_Add_Bean tongZhiGongGao_add_bean);

    //接收公告-签收
    @POST("toxicNotice/updateState/{dealId}")
    Observable<ResponseBean<String>> updateState(@Path("dealId") int id);

    //我发布的通知
    @POST("toxicNotice/listMyPublishNotice")
    Observable<ResponseBean<ArrayList<TongZhiGongGaoInfo>>> listMyPublishNotice(@Query("module") int module, @Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicNotice_Filter_Bean toxicNotice_filter_bean);



    //法律法规列表
    @POST("toxicLaw/list")
    Observable<ResponseBean<ArrayList<FaLvFaGuiInfo>>> toxicLawList(@Query("module") int module, @Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicLaw_Filter_Bean toxicLaw_filter_bean);

    //法律法规详情
    @GET("toxicLaw/{id}")
    Observable<ResponseBean<FaLcFaGui_Detail_Info>> toxicLawDetail(@Path("id") int id);

    //法律法规-添加
    @POST("toxicLaw/add")
    Observable<ResponseBean<String>> falvfagui_add(@Body FaLvFaGui_Add_Bean faLvFaGui_add_bean);


    //企业锁定列表
    @POST("toxicLock/list")
    Observable<ResponseBean<ArrayList<QiYeSuoDingInfo>>> toxicLockList(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicLockSearchVo_Filter_Bean toxicLockSearchVo_filter_bean);


    //企业解锁申请历史记录
    @POST("toxicLock/listUnlockApply")
    Observable<ResponseBean<ArrayList<QiYeSuoDingRecordInfo>>> listUnlockApply(@Query("page") int page, @Query("pageSize") int pageSize, @Body QiYeSuoDingRecordInfo qiYeSuoDingRecordInfo);


    //企业锁定详情
    @GET("toxicLock/{id}")
    Observable<ResponseBean<QiYeSuoDing_Detail_Info>> toxicLockDetail(@Path("id") int id);


    //企业解锁申请历史记录（详情）
    @GET("toxicLock/getUnlockApply/{id}")
    Observable<ResponseBean<QiYeSuoDingRecordInfo>> getUnlockApply(@Path("id") int id);

    //POST /toxicLock/editUnlockApply
    //编辑解锁申请记录(新解锁申请审批接口）
    @POST("toxicLock/editUnlockApply")
    Observable<ResponseBean<String>> editUnlockApply(@Body QiYeSuoDingRecordInfo qiYeSuoDingRecordInfo);

    //解锁申请审批
    @POST("toxicLock/unlockUnit")
    Observable<ResponseBean<String>> toxicLockunlockUnit(@Body W_toxicLockEdit w_toxicLockEdit);

    //企业锁定类别-查询
    @POST("toxicCompany/list")
    Observable<ResponseBean<ArrayList<DanWeiBeiAnListItemInfo>>> toxicCompanyList(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicCompany_Filter_Bean toxicCompany_filter_bean);


    //企业锁定-新增
    @POST("toxicLock/add")
    Observable<ResponseBean<String>> toxicLockAdd(@Body W_toxicLockEdit w_toxicLockEdit);

    //购买证列表
    @POST("toxicPurchaseApply/list")
    Observable<ResponseBean<ArrayList<GouMaiZhengInfo>>> toxicPurchaseApplyList(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicPurchaseApply_Filter_Bean toxicPurchaseApply_filter_bean);

    //购买证详情
    @GET("toxicPurchaseApply/{id}")
    Observable<ResponseBean<GouMaiZheng_Detail_Info>> toxicPurchaseApplyDetail(@Path("id") int id);

    //购买证物品列表
    @GET("toxicPurchaseGoods/getListByPid/{id}")
    Observable<ResponseBean<ArrayList<GouMaiZheng_WuPin_Info>>> toxicPurchaseGoodsList(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);

    //购买证审批
    @POST("toxicPurchaseApply/edit")
    Observable<ResponseBean<String>> toxicPurchaseApplyEdit(@Body W_ToxicPurchaseApplyEdit w_toxicPurchaseApplyEdit);

    //购买证批量审批
    @POST("toxicPurchaseApply/doBatch")
    Observable<ResponseBean<String>> toxicPurchaseApplydoBatch(@Body W_ToxicPurchaseApplydoBatch w_toxicPurchaseApplydoBatch);


    //修改密码
    @POST("user/resetPassword")
    Observable<ResponseBean<String>> resetPassword(@Body XiuGaiMiMa_Bean xiuGaiMiMa_bean);

    //出入库列表
    @POST("toxicWhouseRecord/list")
    Observable<ResponseBean<ArrayList<ChuRuKuInfo>>> toxicWhouseRecordList(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicWhouseRecord_Filter_Bean toxicWhouseRecord_filter_bean);

    //出入库详情
    @GET("toxicWhouseRecord/{id}")
    Observable<ResponseBean<RuKuDetailInfo>> toxicWhouseRecordDetail(@Path("id") int id);

    //民用爆炸物单位备案-列表
    @POST("ceCompany/list")
    Observable<ResponseBean<ArrayList<B_DanWeiBeiAn_Info>>> ceCompanyList(@Query("page") int page, @Query("pageSize") int pageSize);


    //民用爆炸物车辆监控-列表
    @POST("ceTransportApply/vehiclelist")
    Observable<ResponseBean<ArrayList<CheLiangJianKongInfo>>> ceTransportApplyvehiclelist(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicPurchaseApply_Filter_Bean toxicPurchaseApply_filter_bean);

    //易制爆车辆监控-列表
    @POST("yzbPurchaseApply/vehiclelist")
    Observable<ResponseBean<ArrayList<CheLiangJianKongInfo>>> yzbPurchaseApplyvehiclelist(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicPurchaseApply_Filter_Bean toxicPurchaseApply_filter_bean);

    //剧毒车辆监控-列表
    @POST("toxicPurchaseApply/vehiclelist")
    Observable<ResponseBean<ArrayList<CheLiangJianKongInfo>>> toxicPurchaseApplyvehiclelist(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicPurchaseApply_Filter_Bean toxicPurchaseApply_filter_bean);


    //购买证-筛选-企业名称1:公安，2：企业
    @GET("unit/thinkUnit")
    Observable<ResponseBean<ArrayList<ThinkUnit_Info>>> unitThinkUnit(@Query("keyword") String keyword, @Query("level") int level);

    //剧毒库房监控-列表
    @POST("unit/unitVideoList")
    Observable<ResponseBean<ArrayList<KuFangJianKongInfo>>> unitVideoList(@Query("module") int module, @Query("page") int page, @Query("pageSize") int pageSize, @Body UnitVideo_Filter_Bean unitVideo_filter_bean);

    //所有企业或者公安数据列表
    @GET("unit/allUnit")
    Observable<ResponseBean<ArrayList<Unit_Info>>> allUnit(@Query("dwlx") String dwlx);


    //所有公安数据列表
    @POST("unit/listGongan")
    Observable<ResponseBean<ArrayList<Police_Info>>> listGongan();

    //所有经办人数据
    @POST("toxicCompany/getCharger/{unitId}")
    Observable<ResponseBean<ArrayList<Charger_Info>>> getCharger(@Path("unitId") int unitId);


    //首页顶部banner数据
    @POST("common/bannerList")
    Observable<ResponseBean<ArrayList<Banner_Info>>> commonbannerList();

    //获得司机审核记录列表
    @POST("driver/listDriverRecord ")
    Observable<ResponseBean<ArrayList<DriverRecord_Info>>> listDriverRecord(@Query("page") int page, @Query("pageSize") int pageSize, @Body Driver_Filter_Bean driver_filter_bean);

    //获得当前进行中司机审核记录-需要审核的（10-15）
    @POST("driver/listDriver/{id}")
    Observable<ResponseBean<ArrayList<SiJiBeiAn_Info>>> listDriver(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);


    //根据审核流程id获得那次审核涉及的司机信息-已审核的（10-15）
    @POST("driver/listDriversByRecordId/{id}")
    Observable<ResponseBean<ArrayList<SiJiBeiAn_Info>>> listDriversByRecordId(@Path("id") int id, @Query("page") int page, @Query("pageSize") int pageSize);

    //司机备案详情
    @GET("driver/getDriver/{id}")
    Observable<ResponseBean<SiJiBeiAn_Info>> getDriver(@Path("id") int id);

    //司机备案审核
    @POST("driver/editDriverRecord")
    Observable<ResponseBean<String>> editDriverRecord(@Body DriverRecord_Info driverRecord_info);


    //经办人-列表
    @POST("toxicCompany/getCharger")
    Observable<ResponseBean<ArrayList<CompanyCharger>>> getChargerList(@Query("page") int page, @Query("pageSize") int pageSize, @Body CompanyCharger companyCharger);

    //经办人-添加
    @POST("toxicCompany/addCharger")
    Observable<ResponseBean<String>> addCharger(@Body CompanyCharger companyCharger);


    //经办人-修改
    @POST("toxicCompany/editCharger")
    Observable<ResponseBean<String>> editCharger(@Body CompanyCharger companyCharger);

    //经办人-删除
    @POST("toxicCompany/delCharger/{id}")
    Observable<ResponseBean<String>> delCharger(@Path("id") int id);

    //客户核查-列表
    @POST("yzb/customer/listCustomer")
    Observable<ResponseBean<ArrayList<Customer_Info>>> listCustomer(@Query("page") int page, @Query("pageSize") int pageSize, @Body Customer_Info customer_info);

    //客户核查-核查
    @POST("yzb/customer/editCustomer")
    Observable<ResponseBean<String>> editCustomer(@Body Customer_Info customer_info);

    //客户核查-添加
    @POST("yzb/customer/addCustomer")
    Observable<ResponseBean<String>> addCustomer(@Body Customer_Info customer_info);


    //购买入库-列表
    @POST("toxicWhouseRecord/list")
    Observable<ResponseBean<ArrayList<ToxicWhouseRecord>>> toxicWhouseRecordList(@Query("page") int page, @Query("pageSize") int pageSize, @Body ToxicWhouseRecord toxicWhouseRecord);


    //购买入库-添加
    @POST("toxicWhouseRecord/add")
    Observable<ResponseBean<String>> toxicWhouseRecord_add(@Body ToxicWhouseRecord toxicWhouseRecord);

    //代办任务
    @GET("common/listTask")
    Observable<ResponseBean<ListTaskInfo>> listTask();

    //仓库管理-列表
    @POST("toxicCompanyWarehouse/list")
    Observable<ResponseBean<ArrayList<CangKuGuanLi_Info>>> toxicCompanyWarehouseList(@Query("page") int page, @Query("pageSize") int pageSize, @Body CangKuGuanLi_Info cangKuGuanLi_info);

    //仓库管理-物品列表
    @POST("toxicCompanyWarehouse/listWhouseInit")
    Observable<ResponseBean<ArrayList<CangKuGuanLi_WuPin_Info>>> toxicCompanyWarehouselistWhouseInitList(@Query("page") int page, @Query("pageSize") int pageSize, @Body CangKuGuanLi_WuPin_Info cangKuGuanLi_wuPin_info);


    //整改通知-列表
    @POST("rectify/list")
    Observable<ResponseBean<ArrayList<Rectify>>> rectifyList(@Query("page") int page, @Query("pageSize") int pageSize, @Body Rectify rectify);

    //整改通知-新增
    @POST("rectify/add")
    Observable<ResponseBean<String>> RectifyAdd(@Body Rectify rectify);


    //整改通知回复-列表
    @POST("rectify/listDetail")
    Observable<ResponseBean<ArrayList<Rectify_Detail_Info>>> rectifyListDetail(@Query("page") int page, @Query("pageSize") int pageSize, @Body Rectify_Detail_Info rectify_detail_info);

    //整改通知回复-修改
    @POST("rectify/editDetail")
    Observable<ResponseBean<String>> editDetail(@Body Rectify_Detail_Info rectify_detail_info);
}
