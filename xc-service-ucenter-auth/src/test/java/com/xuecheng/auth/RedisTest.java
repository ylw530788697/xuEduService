package com.xuecheng.auth;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author evanYang
 * @version 1.0
 * @date 03/28/2020 11:14
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    //private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testRedis(){
        String key="user_token:9734b68f‐cf5e‐456f‐9bd6‐df578c711390";
        HashMap<String, String> map = new HashMap<>();
        map.put("id","101");
        map.put("userName","evan");
        String string = JSON.toJSONString(map);
        stringRedisTemplate.boundValueOps(key).set(string,2, TimeUnit.DAYS);
        Long expire = stringRedisTemplate.getExpire(key);
        String s = stringRedisTemplate.opsForValue().get(key);
        System.out.println(s);
        //Object o = redisTemplate.opsForValue().get(key);
        //System.out.println(o);
    }
}
