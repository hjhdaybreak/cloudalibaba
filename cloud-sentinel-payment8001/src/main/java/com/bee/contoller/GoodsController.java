package com.bee.contoller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 热点key限流
     * @param id
     * @return
     */
    @SentinelResource("goods")
    @GetMapping("findById")
    public String getGoods(String id){
        return id;
    }
}
