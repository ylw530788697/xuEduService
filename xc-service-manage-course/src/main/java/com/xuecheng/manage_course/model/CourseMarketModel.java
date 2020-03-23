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
@TableName("course_market")
@ApiModel(value="CourseMarketModel对象", description="")
public class CourseMarketModel extends Model<CourseMarketModel> {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "课程id")
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "收费规则，对应数据字典")
    private String charge;

    @ApiModelProperty(value = "有效性，对应数据字典")
    private String valid;

    @ApiModelProperty(value = "过期时间")
    private LocalDateTime expires;

    @ApiModelProperty(value = "咨询qq")
    private String qq;

    @ApiModelProperty(value = "价格")
    private Float price;

    @ApiModelProperty(value = "原价")
    private Float priceOld;

    @ApiModelProperty(value = "课程有效期-开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "课程有效期-结束时间")
    private LocalDateTime endTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
