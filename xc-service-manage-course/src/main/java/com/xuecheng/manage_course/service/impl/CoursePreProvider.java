package com.xuecheng.manage_course.service.impl;

import com.xuecheng.framework.domain.course.CoursePreModel;
import com.xuecheng.manage_course.dao.CoursePreDao;
import com.xuecheng.manage_course.service.ICoursePreProvider;
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
public class CoursePreProvider extends ServiceImpl<CoursePreDao, CoursePreModel> implements ICoursePreProvider {

}
