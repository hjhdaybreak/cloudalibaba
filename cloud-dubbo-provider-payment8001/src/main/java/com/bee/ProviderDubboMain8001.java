package com.bee;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class ProviderDubboMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDubboMain8001.class,args);
        log.info("************** ProviderDubboMain8001 *********");
    }
}
