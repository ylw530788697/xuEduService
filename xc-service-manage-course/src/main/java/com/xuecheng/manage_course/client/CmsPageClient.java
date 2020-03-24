package com.xuecheng.manage_course.client;

import com.xuecheng.framework.domain.cms.request.QueryPageReq;
import com.xuecheng.framework.model.response.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author evanYang
 * @version 1.0
 * @date 03/24/2020 15:20
 */
@FeignClient(value = "xc-service-manage-cms") //指定远程调用的服务名
public interface CmsPageClient {
    @GetMapping("/list/{page}/{size}")
    public ResponseData<?> findList(@RequestParam("page") Integer page, @RequestParam("size")Integer size, @RequestBody QueryPageReq req);
    @GetMapping("/demo")
    public ResponseData<?> findDemo(@RequestParam("name") String name) ;

}
