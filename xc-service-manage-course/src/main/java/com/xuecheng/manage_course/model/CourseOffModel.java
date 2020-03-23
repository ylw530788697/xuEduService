package com.xuecheng.manage_course.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author EvanYang
 * @since 2020-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("course_off")
@ApiModel(value="CourseOffModel对象", description="")
public class CourseOffModel extends Model<CourseOffModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "课程名称")
    private String name;

    @ApiModelProperty(value = "适用人群")
    private String users;

    @ApiModelProperty(value = "大分类")
    private String mt;

    @ApiModelProperty(value = "小分类")
    private String st;

    @ApiModelProperty(value = "课程等级")
    private String grade;

    @ApiModelProperty(value = "学习模式")
    private String studymodel;

    @ApiModelProperty(value = "课程介绍")
    private String description;

    @ApiModelProperty(value = "时间戳")
    private LocalDateTime timestamp;

    @ApiModelProperty(value = "收费规则，对应数据字典")
    private String charge;

    @ApiModelProperty(value = "有效性，对应数据字典")
    private String valid;

    @ApiModelProperty(value = "咨询qq")
    private String qq;

    @ApiModelProperty(value = "价格")
    private Float price;

    @ApiModelProperty(value = "原价格")
    private Float priceOld;

    @ApiModelProperty(value = "过期时间")
    private LocalDateTime expires;

    @ApiModelProperty(value = "课程图片")
    private String pic;

    @ApiModelProperty(value = "课程计划")
    private String teachplan;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
