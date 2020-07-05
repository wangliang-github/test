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
        return "jenkins自动构建每次删除容器和镜像然后重新构建镜像在运行，这样可行吗";
    }
}
