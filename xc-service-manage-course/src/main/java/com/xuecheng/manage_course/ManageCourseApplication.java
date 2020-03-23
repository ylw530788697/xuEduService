package com.xuecheng.manage_course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/03/22 18:16
 */
@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain.course")//扫描实体类
@MapperScan("com.xuecheng.manage_course.dao")
@ComponentScan(basePackages={"com.xuecheng.api"})//扫描接口
@ComponentScan(basePackages={"com.xuecheng.manage_course"})
@ComponentScan(basePackages={"com.xuecheng.framework"})//扫描common下的所有类
public class ManageCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageCourseApplication.class,args);
    }
}
