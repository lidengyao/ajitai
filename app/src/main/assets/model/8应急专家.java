package com.polaris.entity.toxic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zejun
 */

@ApiModel("剧毒应急专家")
@Data
public class ToxicContingencyProfessor {

    @ApiModelProperty("应急专家id")
    private Integer id;

    @ApiModelProperty("模块id")
    private Integer moduleType;

    @ApiModelProperty("专家姓名")
    private String name;

    @ApiModelProperty("专家性别")
    private Integer gender;

    @ApiModelProperty("专家照片")
    private String photo;

    @ApiModelProperty("专家生日")
    private String birthday;

    @ApiModelProperty("专业")
    private String professional;

    @ApiModelProperty("学历")
    private Integer education;

    @ApiModelProperty("职称")
    private String title;

    @ApiModelProperty("学位")
    private Integer academicDegree;

    @ApiModelProperty("联系电话")
    private String tel;

    @ApiModelProperty("居住地址")
    private String liveAddress;

    @ApiModelProperty("专家类型")
    private Integer type;

    @ApiModelProperty("办公室电话")
    private String officePhone;

    @ApiModelProperty("传真")
    private String fax;

    @ApiModelProperty("工作单位")
    private String workUnit;

    @ApiModelProperty("家庭电话")
    private String familyPhone;

    @ApiModelProperty("救援经历")
    private String experience;

    @ApiModelProperty("论文")
    private String papers;

    @ApiModelProperty("研究成果")
    private String researchFinding;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("修改时间")
    private Long updateTime;

    @ApiModelProperty("搜索开始时间")
    private Long searchStartTime;

    @ApiModelProperty("搜索结束时间")
    private Long searchEndTime;
}