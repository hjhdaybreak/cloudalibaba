package com.bee;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//添加对mapper包扫描 Mybatis-plus
@MapperScan("com.bee.mapper")
//开启OpenFiegn
@EnableFeignClients
@SpringBootApplication
@Slf4j
//开启发现注册
@EnableDiscoveryClient
public class SeataBank1Main6001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataBank1Main6001.class, args);
        log.info("************** SeataBank1Main6001 *************");
    }
}
