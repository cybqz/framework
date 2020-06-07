package com.cyb.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${title}")
    private String title;

    @RequestMapping("show")
    public String show(){
        System.out.println("---- " + title + " ----");
        return title;
    }
}
