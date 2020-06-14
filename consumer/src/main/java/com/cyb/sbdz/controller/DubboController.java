package com.cyb.sbdz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cyb.sbdz.service.impl.HelloDubboServic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    @Reference(version = "1.0.0", group = "test")
    private HelloDubboServic helloDubboServic;

    @RequestMapping("/demo")
    public String demo() {
        return helloDubboServic.hello("张三");
    }
}
