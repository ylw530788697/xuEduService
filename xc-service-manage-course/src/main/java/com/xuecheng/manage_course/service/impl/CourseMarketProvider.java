package com.xuecheng.manage_course.service.impl;

import com.xuecheng.framework.domain.course.CourseMarketModel;
import com.xuecheng.manage_course.dao.CourseMarketDao;
import com.xuecheng.manage_course.service.ICourseMarketProvider;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-03-23
 */
@Service
public class CourseMarketProvider extends ServiceImpl<CourseMarketDao, CourseMarketModel> implements ICourseMarketProvider {

}
