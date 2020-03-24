package com.xuecheng.govern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/03/23 15:24
 */
@EnableEurekaServer
@SpringBootApplication
public class GovernCenterApplicationAvailable {
    public static void main(String[] args) {
        SpringApplication.run(GovernCenterApplicationAvailable.class,args);
    }
}
