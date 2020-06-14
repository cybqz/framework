package com.cyb.sbdz.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import java.util.Date;

@Service(version = "1.0.0", group = "test")
public class HelloDubboServiceImpl implements HelloDubboServic {

    @Override
    public String hello(String name) {
        String msg = "于"+new Date() + ",发送者：" + name;
        System.out.println(msg);
        return msg;
    }
}
