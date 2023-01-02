package com.bee.controller;

import com.bee.service.IAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank2")
public class Bank2Controller {


    @Autowired
    IAccountInfoService accountInfoService;


    //接收张三的转账
    @GetMapping("/transfer")
    public String transfer(String accountNo, Double amount) {
        //李四增加金额
        accountInfoService.updateAccountBalance(accountNo, amount);
        return "转账成功";
    }
}

