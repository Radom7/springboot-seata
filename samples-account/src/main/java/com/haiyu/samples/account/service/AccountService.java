package com.haiyu.samples.account.service;

import java.math.BigDecimal;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 12:11
 * @Version 1.0
 */
public interface AccountService {
    void debit(String userId, BigDecimal num);
}
