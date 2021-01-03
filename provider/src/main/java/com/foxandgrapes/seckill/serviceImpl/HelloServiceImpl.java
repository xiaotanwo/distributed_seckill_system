package com.foxandgrapes.seckill.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.foxandgrapes.seckill.service.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = HelloService.class, version = "1.0.0", timeout = 15000)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello World";
    }
}
