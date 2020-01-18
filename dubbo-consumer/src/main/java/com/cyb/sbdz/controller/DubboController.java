package com.cyb.sbdz.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cyb.sbdz.service.impl.HelloDubboServic;

@RestController
public class DubboController {

    //@Reference 使用dubbo的
    @Reference(version = "helloDubboService")
    private HelloDubboServic helloDubboServic;

    @RequestMapping("/")
    public String demo() {
        return helloDubboServic.hello("张三");
    }
}
