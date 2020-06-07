package com.cyb.provider.controller;

import com.cyb.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("/get")
    public Map<String, String> get(){
        return providerService.get();
    }

    @RequestMapping("/getError")
    public String getError(){
        return providerService.getError();
    }
}
