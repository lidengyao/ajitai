package com.polaris.entity.toxic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 */

@ApiModel("剧毒单位从业人员")
@Data
public class ToxicCompanyMember {

    @ApiModelProperty("从业人员id")
    private Integer id;

    @ApiModelProperty("单位id")
    private Integer companyId;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("别名曾用名")
    private String aliasName;

    @ApiModelProperty("性别")
    private Integer gender;

    @ApiModelProperty("生日")
    private String birthday;

    @ApiModelProperty("证书类型")
    private Integer certificateType;

    @ApiModelProperty("证书号")
    private String certificateNumber;

    @ApiModelProperty("开始工作时间")
    private String workBeginTime;

    @ApiModelProperty("民族")
    private Integer raceType;

    @ApiModelProperty("户籍地址")
    private String householdAddress;

    @ApiModelProperty("居住地址")
    private String liveAddress;

    @ApiModelProperty("文化程度")
    private Integer cultural;

    @ApiModelProperty("政治面貌")
    private Integer political;

    @ApiModelProperty("现在职务")
    private String nowDuty;

    @ApiModelProperty("职务类型")
    private Integer dutyType;

    @ApiModelProperty("联系电话")
    private String tel;

    @ApiModelProperty("资格证书名称")
    private String qualificationName;

    @ApiModelProperty("资格证书号")
    private String qualificationNumber;

    @ApiModelProperty("资格证书发证机关")
    private String qualificationIssuing;

    @ApiModelProperty("资格证书有效期")
    private String qualificationEndTime;

    @ApiModelProperty("重点人员比对结果")
    private Integer comparisonResult;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("修改时间")
    private Long updateTime;

    @ApiModelProperty("简历")
    private String resume;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("籍贯")
    private String nativePlace;

    @ApiModelProperty("身份证正面照片")
    private String idcardFront;

    @ApiModelProperty("身份证反面照片")
    private String idcardBack;

    @ApiModelProperty("开始申请时间")
    private Long startApplyTime;

    @ApiModelProperty("结束申请时间")
    private Long endApplyTime;

    @ApiModelProperty("注销状态")
    private Integer cancellation;

}