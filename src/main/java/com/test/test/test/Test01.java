package com.test.test.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wangliang
 * @Date 2020/7/2 20:55
 * @Version 1.0
 * @desc
 */
@RestController
public class Test01 {
    @RequestMapping("/test")
    public String test(){
        return "Hello,Jenkins!";
    }
}
