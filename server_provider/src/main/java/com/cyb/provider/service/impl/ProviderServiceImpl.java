package com.cyb.provider.service.impl;

import com.cyb.provider.service.ProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Override
    public Map<String, String> get() {

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "cyb");
        return map;
    }

    @HystrixCommand(fallbackMethod = "getErrorFallback")
    @Override
    public String getError() {
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

    public String getErrorFallback(){
        return "error";
    }
}
