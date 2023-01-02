package com.bee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bee.entity.AccountInfo;
import com.bee.feign.Bank2ServiceFeign;
import com.bee.mapper.AccountMapper;
import com.bee.service.IAccountInfoService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class AccountInfoServiceImpl implements IAccountInfoService {


    @Autowired
    AccountMapper accountMapper;


    @Autowired
    private Bank2ServiceFeign bank2ServiceFeign;

    @GlobalTransactional
    @Transactional
    @Override
    public void updateAccountBalance(String accountNo, Double amount) {
        log.info("bank1 XID{}", RootContext.getXID());
        // 1. 获取用户信息
        QueryWrapper<AccountInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_no", accountNo);
        AccountInfo accountInfo = accountMapper.selectOne(queryWrapper);
        if (accountInfo != null) {
            accountInfo.setAccountBalance(accountInfo.getAccountBalance() - amount);
            accountMapper.updateById(accountInfo);

            //远程调用 李四钱增加
            bank2ServiceFeign.transfer("2", amount);
        }
    }
}

