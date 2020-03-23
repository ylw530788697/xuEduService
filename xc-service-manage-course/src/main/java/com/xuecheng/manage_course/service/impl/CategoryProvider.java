package com.xuecheng.manage_course.service.impl;

import com.xuecheng.manage_course.model.CategoryModel;
import com.xuecheng.manage_course.dao.CategoryDao;
import com.xuecheng.manage_course.service.ICategoryProvider;
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
public class CategoryProvider extends ServiceImpl<CategoryDao, CategoryModel> implements ICategoryProvider {

}
