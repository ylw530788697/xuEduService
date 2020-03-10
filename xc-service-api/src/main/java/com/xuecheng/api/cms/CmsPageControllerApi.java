package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageReq;

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
    public void findList(int page, int size, QueryPageReq req) ;
}
