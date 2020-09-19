package com.haiyu.samples.account.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.haiyu.samples.account.entity.Account;
import com.haiyu.samples.account.mapper.AccountMapper;
import com.haiyu.samples.account.service.AccountService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 12:12
 * @Version 1.0
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    private static final String ERROR_USER_ID = "1002";


    @Override
    public void debit(String userId, BigDecimal num) {
        Account account = baseMapper.selectByUserId(userId);
        baseMapper.updateMoneyById(account.getId(),account.getMoney().subtract(num));

        if (ERROR_USER_ID.equals(userId)) {
            throw new RuntimeException("account branch exception");
        }
    }
}
