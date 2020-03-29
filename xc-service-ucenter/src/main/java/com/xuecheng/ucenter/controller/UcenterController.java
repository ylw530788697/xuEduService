package com.xuecheng.ucenter.controller;

import com.xuecheng.api.user.UcenterControllerApi;
import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import com.xuecheng.ucenter.service.XcUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/03/29 14:47
 */
@RestController
@RequestMapping("/ucenter")
@Api(tags = "UcenterController",description = "用户模块模块")
public class UcenterController implements UcenterControllerApi {
    @Autowired
    private XcUserService xcUserService;
    @Override
    @GetMapping("/getuserext")
    @ApiOperation(value = "用户模块-获取用户", notes = "", httpMethod = "GET")
    public XcUserExt getUserext(@RequestParam("username") String username) {
        return xcUserService.getUserext(username);
    }
}
