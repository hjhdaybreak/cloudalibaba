package com.bee.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * 学习Sentinel fallback 和  blockHandler
 */
@Service
public class GoodService {


    //支付服务远程调用
    @DubboReference(version = "1.0")
    private IFindGood iFindGood;


    public String findById(String id) {
        return iFindGood.findById(id);
    }

}
