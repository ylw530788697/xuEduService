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
@TableName("xc_company")
@ApiModel(value="XcCompanyModel对象", description="")
public class XcCompanyModel extends Model<XcCompanyModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "联系人名称")
    private String linkname;

    @ApiModelProperty(value = "名称")
    private String name;

    private String mobile;

    private String email;

    @ApiModelProperty(value = "简介")
    private String intro;

    @ApiModelProperty(value = "logo")
    private String logo;

    @ApiModelProperty(value = "身份证照片")
    private String identitypic;

    @ApiModelProperty(value = "工具性质")
    private String worktype;

    @ApiModelProperty(value = "营业执照")
    private String businesspic;

    @ApiModelProperty(value = "企业状态")
    private String status;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
