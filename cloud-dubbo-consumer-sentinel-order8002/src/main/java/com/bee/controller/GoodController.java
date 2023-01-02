package com.bee.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.bee.service.GoodService;

import com.bee.service.fallback.GoodServiceFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("good")
public class GoodController {

    @Autowired
    GoodService goodService;

    @SentinelResource(value = "goodfindById",
            fallback = "testFallBack", fallbackClass = GoodServiceFallback.class,
            blockHandler = "testBlockBack", blockHandlerClass = GoodServiceFallback.class)
    @GetMapping("findById")
    public String index(@RequestParam("id") String id) {
        if ("1".equals(id)) {
            throw new RuntimeException("制造接口异常");
        }
        return goodService.findById(id);
    }

}
