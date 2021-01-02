package com.foxandgrapes.seckill.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.foxandgrapes.seckill.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 */
@RestController
public class TestController {

    @Reference(interfaceClass = HelloService.class, version = "1.0.0", check = false)
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }
}
