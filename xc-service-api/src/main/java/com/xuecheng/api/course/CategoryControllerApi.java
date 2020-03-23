package com.xuecheng.api.course;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author evanYang
 * @version 1.0
 * @date 2020/03/23 10:42
 */
public interface CategoryControllerApi {
    @GetMapping("/index")
    public String demo();
}
