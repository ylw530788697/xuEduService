package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageReq;
import com.xuecheng.framework.model.response.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 　　* @description: TODO
 * 　　* @param ${tags}
 * 　　* @return ${return_type}
 * 　　* @throws
 * 　　* @author EvanYang
 * 　　* @date 2020/3/10 -- 16:16
 *
 */
public interface CmsPageControllerApi {

    @GetMapping("/demo")
    public ResponseData<?> findDemo(@RequestParam("name") String name) ;
    @GetMapping("/list/{page}/{size}")
    public ResponseData<?> findList(@PathVariable("page") Integer page, @PathVariable("size")Integer size, QueryPageReq req);

}
