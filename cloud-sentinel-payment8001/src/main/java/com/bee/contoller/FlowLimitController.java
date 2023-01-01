package com.bee.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 流控规则控制层
 */

@RestController
public class FlowLimitController {

    @GetMapping("testA")
    public String testA() {
        return "------------testA";
    }


    @GetMapping("testB")
    public String testB() {
        return "------------testB";
    }

    /**
     * 测试慢调用
     * @param id
     * @return
     * @throws InterruptedException
     */
    @GetMapping("testC")
    public String testC(Integer id) throws InterruptedException {
        if(id ==  1) {
            TimeUnit.SECONDS.sleep(1);
        }
        return "------------testC";
    }
}