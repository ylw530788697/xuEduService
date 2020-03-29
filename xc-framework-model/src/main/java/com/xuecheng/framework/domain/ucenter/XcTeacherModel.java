package com.xuecheng.framework.domain.ucenter;

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
 * @since 2020-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("xc_teacher")
@ApiModel(value="XcTeacherModel对象", description="")
public class XcTeacherModel extends Model<XcTeacherModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "称呼")
    private String name;

    @ApiModelProperty(value = "个人简介")
    private String intro;

    @ApiModelProperty(value = "个人简历")
    private String resume;

    @ApiModelProperty(value = "老师照片")
    private String pic;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
