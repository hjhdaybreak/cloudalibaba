package com.bee.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @SentinelResource("goods")
    public String queryGoods() {
        return "查询商品";
    }

}
