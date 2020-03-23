package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageReq;
import com.xuecheng.framework.model.response.ResponseData;
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
    //@Autowired
    @GetMapping("/list/{page}/{size}")
    public ResponseData<?> findList(@PathVariable("page") Integer page, @PathVariable("size")Integer size, QueryPageReq req) {

        return ResponseData.ok("ceshi");
    }
}
