package com.bee.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    //支付服务远程调用
    @DubboReference(version = "1.0", mock = "com.bee.service.fallback.PaymentFallback")
    private IPaymentService iPaymentService;


    public String index() {
        return iPaymentService.index();
    }
}
