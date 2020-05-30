package com.cyb.sbdz.config;

import com.alibaba.dubbo.config.*;
import com.cyb.sbdz.service.HelloDubboServic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyDubboConfig {

    //<dubbo:application name="boot-user-service-provider"></dubbo:application>
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dz-provider");
        return applicationConfig;
    }

    //<dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.124.25:2181");
        return registryConfig;
    }

    /* <dubbo:protocol name="dubbo" port="20882"></dubbo:protocol> */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }

    /**
     *<dubbo:service interface="com.zang.gmall.service.UserService"
     ref="userServiceImpl01" timeout="1000" version="1.0.0">
     <dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>
     </dubbo:service>
     */
    public ServiceConfig<HelloDubboServic> helloDubboServic(HelloDubboServic helloDubboServic){
        ServiceConfig<HelloDubboServic> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(HelloDubboServic.class);
        serviceConfig.setRef(helloDubboServic);
        serviceConfig.setVersion("1.0.0");

        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("hello");
        methodConfig.setTimeout(1000);

        //将method的设置关联到service配置中
        List<MethodConfig> methods = new ArrayList<>();
        methods.add(methodConfig);
        serviceConfig.setMethods(methods);

        System.out.println("注册" + HelloDubboServic.class + "成功...");
        return serviceConfig;
    }
}
