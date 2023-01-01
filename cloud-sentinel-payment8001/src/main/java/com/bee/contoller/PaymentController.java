package com.bee.contoller;

import com.bee.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    @GetMapping("/save")
    public String saveOrder() {
        // 查询商品
        paymentService.queryGoods();
        // 查询订单
        System.out.println("新增订单");
        return "新增订单成功";
    }

    @GetMapping("/query")
    public String queryOrder() {
        // 查询商品
        paymentService.queryGoods();
        // 查询订单
        System.out.println("查询订单");
        return "查询订单成功";
    }


}
