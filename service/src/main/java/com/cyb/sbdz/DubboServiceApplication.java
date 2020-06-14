package com.cyb.sbdz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableDubbo(scanBasePackages="com.cyb.sbdz.service.impl")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DubboServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboServiceApplication.class, args);
    }

}
