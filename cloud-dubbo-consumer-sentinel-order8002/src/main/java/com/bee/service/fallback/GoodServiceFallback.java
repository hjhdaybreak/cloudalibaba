package com.bee.service.fallback;


import com.alibaba.csp.sentinel.slots.block.BlockException;

public class GoodServiceFallback {

    /**
     * 接口异常降级方法
     */
    public static String testFallBack(String id, Throwable e) {
        return "接口异常降级";
    }

    /**
     * Sentinel 控制台配置异常
     */
    public static String testBlockBack(String id, BlockException e) {
        return "sentinel 控制台配置异常";
    }


}
