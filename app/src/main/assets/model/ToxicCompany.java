package com.polaris.entity.toxic;


import com.polaris.entity.vo.SearchParent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("单位备案")
@Data
public class ToxicCompany extends SearchParent {

    private Integer id;

    @ApiModelProperty("单位id")
    private Integer unitId;

    @ApiModelProperty("法人名字")
    private String legalRepresentativeName;

    @ApiModelProperty("法人身份证号")
    private String legalRepresentativeIdcard;

    @ApiModelProperty("法人电话")
    private String legalRepresentativeTel;

    @ApiModelProperty("操作人")
    private String charger;

    @ApiModelProperty("安全员姓名")
    private String securityerName;

    @ApiModelProperty("安全员电话")
    private String securityerTel;

    @ApiModelProperty(value = "存储风险等级", dataType = "int")
    private Integer storageRiskLevel;

    @ApiModelProperty("企业从业人数")
    private Integer companyMemberNumber;

    @ApiModelProperty("是否涉及进出口")
    private Integer importAndExport;

    @ApiModelProperty("是否有监控")
    private Integer monitors;

    @ApiModelProperty("值班室电话")
    private String dutyRoomTel;

    @ApiModelProperty("监控中心电话")
    private String monitoringCenterTel;

    @ApiModelProperty("剧毒存放地址")
    private String toxicStoreAddress;

    @ApiModelProperty("工商证编号")
    private String businessLicenseNo;

    @ApiModelProperty("工商证过期时间")
    private Long businessLicenseNoExpire;

    @ApiModelProperty("组织机构证号")
    private String organizationalCodeCertificate;

    @ApiModelProperty("组织机构正过期时间")
    private Long organizationalCodeCertificateExpire;

    @ApiModelProperty("安保证书")
    private String safetySupervision;

    @ApiModelProperty("安保证过期时间")
    private Long safetySupervisionExpire;

    @ApiModelProperty("环保证")
    private String environmentalCertificate;

    @ApiModelProperty("环保证过期时间")
    private Long environmentalCertificateExpire;

    @ApiModelProperty("专业设备证书")
    private String professionalInstitutions;

    @ApiModelProperty("专业设备过期时间")
    private Long professionalInstitutionsExpire;



    @ApiModelProperty("单位锁定状态")
    private Integer lockStatus;

    @ApiModelProperty("申请状态")
    private Integer applyStatus;

    @ApiModelProperty("申请通过时间")
    private Long passTime;

    @ApiModelProperty("数据创建时间")
    private Long createTime;

    @ApiModelProperty("数据更新时间")
    private Long updateTime;

    @ApiModelProperty("锁定类型")
    private Integer lockType;

    @ApiModelProperty("单位类型")
    private Integer unitType;


    /**
     * 中爆数据对接之后添加的字段
     */

    @ApiModelProperty("数据来源，1：系统录入，2：接口获得")
    private Integer dataSource;

    @ApiModelProperty("单位备案id")
    private String dwbaId;

    @ApiModelProperty("单位id")
    private String compId;

    @ApiModelProperty("单位名称")
    private String compName;

    @ApiModelProperty("单位编码")
    private String compCode;

    @ApiModelProperty("法人证件类型，1、身份证 2、其它证件")
    private String dwbaArenzjlx;

    @ApiModelProperty("法人手机号")
    private String dwbaShoujihaoma;

    @ApiModelProperty("备案登记申办人姓名")
    private String dwbaShengbanren;

    @ApiModelProperty("申办人证件类型，1、身份证 2、其它证件")
    private String dwbaShengbanrenzjlx;

    @ApiModelProperty("申办人证件号码")
    private String dwbaShengbanrenzjhm;

    @ApiModelProperty("申办人电话号码")
    private String dwbaShengbanrendhhm;

    @ApiModelProperty("申办人手机号码")
    private String dwbaShengbanrensjhm;

    @ApiModelProperty("是否涉及出入库境，1、是 2、否")
    private String dwbaChurujing;

    @ApiModelProperty("是否安装监控，1、是 2、否")
    private String dwbaJiankong;

    @ApiModelProperty("业务类型 1是剧毒备案,2是易制爆备案")
    private Integer leixing;

    @ApiModelProperty("备案登记时间")
    private String dwbaDengjishijian;

    @ApiModelProperty("备案修改时间")
    private String dwbaUpdatetime;

    @ApiModelProperty("备案通过时间")
    private String dwbaTongguoshijian;

    @ApiModelProperty("审核流程状态")
    private String notpass;

    @ApiModelProperty("备案状态 0未备案，1已备案")
    private Integer state;

    @ApiModelProperty("备案进度，1为填写基本信息 2为填写物品信息 3为上传附件信息 4为添加备案人员信息 5为递交审核 6进入公安审批")
    private Integer dwbaJindu;

    @ApiModelProperty("变更版本号，0-N，代表第几次变更了")
    private Integer version;

    @ApiModelProperty("变更状态，1为未变更或变更完成  -1为申请变更了但未递交审核 0为已递交审核")
    private Integer bgState;

    @ApiModelProperty("危险化学品仓库数量")
    private Integer cangku;

    @ApiModelProperty("库容量")
    private Float kurongliang;

    @ApiModelProperty("治安保卫人员人数，0表示没有，大于0表示有、且记录具体数量")
    private Integer zaNum;

    @ApiModelProperty("是否有报警装置，0表示没有，1表示有")
    private Integer bj;

    @ApiModelProperty("剧毒化学品经营范围描述")
    private String toxicDescription;

    @ApiModelProperty("剧毒化学品储存设备及安保措施")
    private String toxicEquipment;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("生产、经营、 储存、使用、销毁 剧毒易制爆的品名、数量")
    private String dwbaBeizhu1;

    @ApiModelProperty("储存设施 及 安全保卫措施")
    private String dwbaBeizhu2;

    @ApiModelProperty("备注")
    private String dwbaBeizhu3;

    @ApiModelProperty("是否可直接购买，0 需要 1不需要")
    private String dwbaBeizhu4;

    @ApiModelProperty("安全责任人电话")
    private String dwbaBeizhu5;

    @ApiModelProperty("是否申请备案延期变更")
    private String dwbaBeizhu6;

    @ApiModelProperty("单位地址")
    private String dwbaBeizhu7;

    @ApiModelProperty("存放风险等级")
    private String dwbaBeizhu8;

    @ApiModelProperty("公安为自行购买单位发放的购买凭证纸发放数")
    private String dwbaBeizhu9;

    @ApiModelProperty("企业简称,用于购买许可证")
    private String dwbaBeizhu10;

    @ApiModelProperty("筛选条件，锁定")
    private Integer suoding;

    @ApiModelProperty("筛选条件，注销")
    private Integer zhuxiao;

    private Integer oldId;

}


