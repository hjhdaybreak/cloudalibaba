package com.bee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class NacosConfigController {
    
    @Value("${nacos.config}")
    private String config;


    @RequestMapping("/getValue")
    public String getValue() {
        return config;
    }
}


