package com.cyb.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "ProviderServer") 	//要调用的服务名称
@RequestMapping("dataClient")				//和调用服务controller的一致
public interface DataClient {

    //和调用服务controller的一致
    @RequestMapping("get")
    public String getData();
}
