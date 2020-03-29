package com.xuecheng.api.user;

import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import io.swagger.annotations.Api;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/03/29 14:46
 */
@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {
    public XcUserExt getUserext(String username);
}
