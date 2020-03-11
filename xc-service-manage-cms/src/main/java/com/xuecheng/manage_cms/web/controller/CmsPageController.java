package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageReq;
import com.xuecheng.framework.model.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author evanYang
 * @version 1.0
 * @date 03/11/2020 11:34
 */
@RestController
public class CmsPageController implements CmsPageControllerApi {
    @Autowired
    @Override
    @GetMapping("/list/{page}/{size}")
    public Response<?> findList(@PathVariable("page") Integer page, @PathVariable("size")Integer size, QueryPageReq req) {

        return Response.ok("ceshi ");
    }
}
