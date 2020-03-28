package com.xuecheng.api.auth;

import com.xuecheng.framework.domain.ucenter.request.LoginRequest;
import com.xuecheng.framework.domain.ucenter.response.LoginResult;
import com.xuecheng.framework.model.response.ResponseData;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author evanYang
 * @version 1.0
 * @date 03/28/2020 11:42
 */
@Api(value = "用户认证",description = "用户认证接口")
public interface AuthControllerApi {
    @ApiOperation("登录")
    @PostMapping("/userlogin")
    public ResponseData<?> login(LoginRequest loginRequest);

    @ApiOperation("退出")
    @PostMapping("/userLogout")
    public ResponseResult logout();
}
