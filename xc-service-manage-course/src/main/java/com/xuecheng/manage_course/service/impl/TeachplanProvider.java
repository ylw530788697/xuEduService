package com.xuecheng.manage_course.service.impl;

import com.xuecheng.framework.domain.course.TeachplanModel;
import com.xuecheng.manage_course.dao.TeachplanDao;
import com.xuecheng.manage_course.service.ITeachplanProvider;
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
public class TeachplanProvider extends ServiceImpl<TeachplanDao, TeachplanModel> implements ITeachplanProvider {

}
