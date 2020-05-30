package com.cyb.sbdz.service;

import com.alibaba.dubbo.config.annotation.Service;
import java.util.Date;

@org.springframework.stereotype.Service("helloDubboService")
@Service(version = "1.0.0", interfaceClass = HelloDubboServic.class)
public class HelloDubboServiceImpl implements HelloDubboServic {

    @Override
    public String hello(String name) {
        String msg = "于"+new Date() + ",发送者：" + name;
        System.out.println(msg);
        return msg;
    }
}
