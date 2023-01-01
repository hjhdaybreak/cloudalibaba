package com.bee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class OrderConsumerDubboMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerDubboMain8002.class, args);
        log.info("************** OrderConsumerDubboMain8002  启动成功 *********");
    }
}
