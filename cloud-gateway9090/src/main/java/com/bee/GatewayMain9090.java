package com.bee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class GatewayMain9090 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9090.class,args);
        log.info("********** Gateway9090 启动成功 *********");
    }
}
