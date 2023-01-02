package com.bee;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//添加对mapper包扫描 Mybatis-plus
@MapperScan("com.bee.mapper")
@SpringBootApplication
@Slf4j
//开启发现注册
@EnableDiscoveryClient
public class SeataBank2Main6002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataBank2Main6002.class, args);
        log.info("************** SeataBank2Main6002 *************");
    }
}
