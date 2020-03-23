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
@TableName("teachplan_media")
@ApiModel(value="TeachplanMediaModel对象", description="")
public class TeachplanMediaModel extends Model<TeachplanMediaModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "课程计划id")
    @TableId(value = "teachplan_id", type = IdType.UUID)
    private String teachplanId;

    @ApiModelProperty(value = "媒资文件id")
    private String mediaId;

    @ApiModelProperty(value = "媒资文件的原始名称")
    private String mediaFileoriginalname;

    @ApiModelProperty(value = "媒资文件访问地址")
    private String mediaUrl;

    @ApiModelProperty(value = "课程Id")
    private String courseid;


    @Override
    protected Serializable pkVal() {
        return this.teachplanId;
    }

}
