package com.cyb.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@FeignClient(value = "ProviderServer") 	//要调用的服务名称
@RequestMapping("provider")				//和调用服务controller的一致
public interface ProviderClient {

    @RequestMapping("get")
    public Map<String, String> get();

    @RequestMapping("getError")
    public String getError();
}
