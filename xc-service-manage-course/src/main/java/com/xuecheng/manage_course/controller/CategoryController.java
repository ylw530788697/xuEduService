package com.xuecheng.manage_course.controller;


import com.xuecheng.api.course.CategoryControllerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author EvanYang
 * @since 2020-03-23
 */
@RestController
@RequestMapping("/categoryModel")
public class CategoryController implements CategoryControllerApi {
    @Override
    @GetMapping("/index")
    public String demo(){
        return "ceshjio";
    }

}

