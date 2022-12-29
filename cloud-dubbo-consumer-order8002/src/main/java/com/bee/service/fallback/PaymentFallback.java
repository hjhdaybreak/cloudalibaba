package com.bee.service.fallback;

import com.bee.service.IPaymentService;

public class PaymentFallback implements IPaymentService {


    //降级方法
    @Override
    public String index() {
        return "服务繁忙请稍后再试！";
    }
}
