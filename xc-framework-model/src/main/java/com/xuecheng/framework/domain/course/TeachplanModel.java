package com.xuecheng.framework.domain.course;

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
@TableName("teachplan")
@ApiModel(value="TeachplanModel对象", description="")
public class TeachplanModel extends Model<TeachplanModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String pname;

    private String parentid;

    @ApiModelProperty(value = "层级，分为1、2、3级")
    private String grade;

    @ApiModelProperty(value = "课程类型:1视频、2文档")
    private String ptype;

    @ApiModelProperty(value = "章节及课程时介绍")
    private String description;

    @ApiModelProperty(value = "时长，单位分钟")
    private Double timelength;

    @ApiModelProperty(value = "课程id")
    private String courseid;

    @ApiModelProperty(value = "排序字段")
    private String orderby;

    @ApiModelProperty(value = "状态：未发布、已发布")
    private String status;

    @ApiModelProperty(value = "是否试学")
    private String trylearn;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
