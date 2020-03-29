package com.xuecheng.ucenter.service;

import com.xuecheng.framework.domain.ucenter.ext.XcUserExt;
import com.xuecheng.framework.domain.ucenter.XcUserModel;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author EvanYang
 * @since 2020-03-29
 */
public interface XcUserService extends IService<XcUserModel> {

    XcUserExt getUserext(String username);
}
