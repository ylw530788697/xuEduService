package com.xuecheng.manage_course.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
@TableName("course_base")
@ApiModel(value="CourseBaseModel对象", description="")
public class CourseBaseModel extends Model<CourseBaseModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "课程名称")
    private String name;

    @ApiModelProperty(value = "适用人群")
    private String users;

    @ApiModelProperty(value = "课程大分类")
    private String mt;

    @ApiModelProperty(value = "课程等级")
    private String grade;

    @ApiModelProperty(value = "学习模式")
    private String studymodel;

    @ApiModelProperty(value = "授课模式")
    private String teachmode;

    @ApiModelProperty(value = "课程介绍")
    private String description;

    @ApiModelProperty(value = "课程小分类")
    private String st;

    @ApiModelProperty(value = "课程状态")
    private String status;

    @ApiModelProperty(value = "教育机构")
    private String companyId;

    @ApiModelProperty(value = "创建用户")
    private String userId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
