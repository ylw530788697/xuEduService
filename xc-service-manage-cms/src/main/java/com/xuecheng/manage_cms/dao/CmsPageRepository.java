package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/3/11 15:03
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
