package com.bee.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("bank2-provider")
public interface Bank2ServiceFeign {

    //接收张三的转账
    @GetMapping("/bank2/transfer")
    String transfer(@RequestParam("accountNo") String accountNo,  @RequestParam("amount") Double amount);

}
