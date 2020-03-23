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
@TableName("course_pic")
@ApiModel(value="CoursePicModel对象", description="")
public class CoursePicModel extends Model<CoursePicModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "课程id")
    @TableId(value = "courseid", type = IdType.UUID)
    private String courseid;

    @ApiModelProperty(value = "图片id")
    private String pic;


    @Override
    protected Serializable pkVal() {
        return this.courseid;
    }

}
