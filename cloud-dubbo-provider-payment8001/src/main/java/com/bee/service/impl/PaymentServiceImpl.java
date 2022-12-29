package com.bee.service.impl;

import com.bee.service.IPaymentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

/**
 * @Method 指定需要注册的方法
 */
@DubboService(timeout = 5000, version = "1.0", methods = {@Method(name = "index", retries = 2)},cluster = "failfast")
public class PaymentServiceImpl implements IPaymentService {

    @Override
    public String index() {
        return "hello dubbo payment";
    }
}

