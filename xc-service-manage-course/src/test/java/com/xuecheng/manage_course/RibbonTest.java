package com.xuecheng.manage_course;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.loadbalancer.LoadBalancerInterceptor;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author evanYang
 * @version 1.0
 * @date 03/24/2020 14:44
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RibbonTest {
    @Autowired
    RestTemplate restTemplate;
    //@Test
    //public void demo(){
    //    //LoadBalancerInterceptor
    //    //RibbonLoadBalancerClient
    //    String serviceId = "xc-service-manage-cms";
    //    for (int i=0;i<10;i++){
    //        //ribbon客户端从eurekaServer中获取服务列表,根据服务名获取服务列表
    //        ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://"+serviceId+"/list/1/2", Map.class);
    //        Map body = forEntity.getBody();
    //        System.out.println(body);
    //    }
    //}
}
