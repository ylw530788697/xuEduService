package com.xuecheng.manage_course.service.impl;

import com.xuecheng.framework.domain.course.CourseBaseModel;
import com.xuecheng.manage_course.dao.CourseBaseDao;
import com.xuecheng.manage_course.service.ICourseBaseProvider;
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
public class CourseBaseProvider extends ServiceImpl<CourseBaseDao, CourseBaseModel> implements ICourseBaseProvider {

}
