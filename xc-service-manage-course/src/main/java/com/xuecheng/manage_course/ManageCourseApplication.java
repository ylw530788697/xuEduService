package com.xuecheng.manage_course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

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
@EnableEurekaClient
@EnableFeignClients
public class ManageCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageCourseApplication.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
