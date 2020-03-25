package com.xuecheng.manage_course;

import com.xuecheng.framework.domain.cms.request.QueryPageReq;
import com.xuecheng.framework.model.response.ResponseData;
import com.xuecheng.manage_course.client.CmsPageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
public class FeigonTest {
    @Autowired
    CmsPageClient cmsPageClient;
    
    @Test
    public void demo(){
        //LoadBalancerInterceptor
        //RibbonLoadBalancerClient
        String serviceId = "xc-service-manage-cms";
        for (int i=0;i<10;i++){
            //ResponseData<?> list = cmsPageClient.findList(1, 2,new QueryPageReq());
            ResponseData<?> zhansan = cmsPageClient.findDemo("zhansan");
            System.out.println(zhansan);

        }
    }
}
