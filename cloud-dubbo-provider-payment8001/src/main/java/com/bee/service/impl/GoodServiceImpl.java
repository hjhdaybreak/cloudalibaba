package com.bee.service.impl;

import com.bee.service.IFindGood;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;
/**
 * 学习 Sentinel fallback 和  blockHandler
 */
@DubboService(timeout = 5000, version = "1.0", methods = {@Method(name = "findById", retries = 2)},cluster = "failfast")
public class GoodServiceImpl implements IFindGood {
    @Override
    public String findById(String id) {
        return "查到Good啦";
    }
}
