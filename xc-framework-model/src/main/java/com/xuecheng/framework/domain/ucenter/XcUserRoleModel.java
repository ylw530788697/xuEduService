package com.xuecheng.framework.domain.ucenter;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
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
@TableName("xc_user_role")
@ApiModel(value="XcUserRoleModel对象", description="")
public class XcUserRoleModel extends Model<XcUserRoleModel> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    private String userId;

    private String roleId;

    private LocalDateTime createTime;

    private String creator;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
