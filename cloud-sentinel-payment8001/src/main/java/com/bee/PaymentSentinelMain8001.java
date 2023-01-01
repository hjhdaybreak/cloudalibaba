package com.bee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class PaymentSentinelMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentSentinelMain8001.class, args);
        log.info("************ PaymentSentinelMain8001 启动成功 **********");
    }
}
