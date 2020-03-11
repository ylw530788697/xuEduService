package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageReq;
import com.xuecheng.framework.model.response.Response;

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
    public Response<?> findList(Integer page, Integer size, QueryPageReq req) ;
}
