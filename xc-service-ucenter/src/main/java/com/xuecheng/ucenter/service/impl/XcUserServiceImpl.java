package com.xuecheng.ucenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import com.xuecheng.framework.domain.ucenter.XcCompanyUserModel;
import com.xuecheng.framework.domain.ucenter.XcUserModel;
import com.xuecheng.ucenter.dao.XcUserDao;
import com.xuecheng.ucenter.service.XcCompanyService;
import com.xuecheng.ucenter.service.XcCompanyUserService;
import com.xuecheng.ucenter.service.XcUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-03-29
 */
@Service
public class XcUserServiceImpl extends ServiceImpl<XcUserDao, XcUserModel> implements XcUserService {
    @Autowired
    private XcCompanyService xcCompanyService;
    @Autowired
    private XcCompanyUserService xcCompanyUserService;
    @Override
    public XcUserExt getUserext(String username) {
        QueryWrapper<XcUserModel> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(XcUserModel::getUsername,username);
        List<XcUserModel> list = list(queryWrapper);
        XcUserModel one = this.getOne(queryWrapper);

        if (one==null){
            return null;
        }
        XcUserExt xcUserExt = new XcUserExt();
        BeanUtils.copyProperties(one,xcUserExt);
        //用户id
        String userId = xcUserExt.getId();
        QueryWrapper<XcCompanyUserModel> companyUserModelQueryWrapper = new QueryWrapper<>();
        companyUserModelQueryWrapper.eq("user_id",userId);
        XcCompanyUserModel xcCompanyUserModel = xcCompanyUserService.getOne(companyUserModelQueryWrapper);
        if (xcCompanyUserModel!=null){
            xcUserExt.setCompanyId(xcCompanyUserModel.getCompanyId());
        }
        return xcUserExt;
    }
}
