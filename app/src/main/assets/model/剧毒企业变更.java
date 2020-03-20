package com.polaris.entity.toxic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 * 剧毒企业变更
 */
@ApiModel("剧毒单位信息变更")
@Data
public class ToxicCompanyChange {

    @ApiModelProperty("变更记录id")
    private Integer id;

    @ApiModelProperty("单位id")
    private Integer unitId;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("操作人员id")
    private Integer changer;

    @ApiModelProperty("操作人员名称")
    private String chargerName;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("修改字段，用json字符串形式")
    private String changeField;

    @ApiModelProperty("单位审核人id")
    private Integer unitCheckUserid;

    @ApiModelProperty("单位审核人姓名")
    private String unitCheckUserName;

    @ApiModelProperty("单位审核时间")
    private Long unitCheckTime;

    @ApiModelProperty("单位审核人意见")
    private Integer unitCheckOpinion;

    @ApiModelProperty("单位id")
    private Integer unitCheckUnitid;

    @ApiModelProperty("单位名称")
    private String unitCheckUnitName;

    @ApiModelProperty("派出所审核人id")
    private Integer pcsCheckUserid;

    @ApiModelProperty("派出所审核人姓名")
    private String pcsCheckUserName;

    @ApiModelProperty("派出所审核时间")
    private Long pcsCheckTime;

    @ApiModelProperty("派出所审核意见")
    private Integer pcsCheckOpinion;

    @ApiModelProperty("派出所id")
    private Integer pcsCheckUnitid;

    @ApiModelProperty("派出所名称")
    private String pcsCheckUnitName;

    @ApiModelProperty("支队审核人id")
    private Integer zdCheckUserid;

    @ApiModelProperty("支队审核人姓名")
    private String zdCheckUserName;

    @ApiModelProperty("支队审核时间")
    private Long zdCheckTime;

    @ApiModelProperty("支队审核意见")
    private Integer zdCheckOpinion;

    @ApiModelProperty("支队id")
    private Integer zdCheckUnitid;

    @ApiModelProperty("支队名称")
    private String zdCheckUnitName;

    @ApiModelProperty("单位审查内容")
    private String unitCheckContent;

    @ApiModelProperty("派出所审查内容")
    private String pcsCheckContent;

    @ApiModelProperty("支队审查内容")
    private String zdCheckContent;

    @ApiModelProperty("联系电话")
    private String tel;

    @ApiModelProperty("单位类型名称")
    private String lbcTypeName;

    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;

    @ApiModelProperty("单位类型")
    private Integer unitType;

}