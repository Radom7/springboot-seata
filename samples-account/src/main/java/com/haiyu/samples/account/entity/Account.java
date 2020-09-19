package com.haiyu.samples.account.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 12:08
 * @Version 1.0
 */
@Data
public class Account {
    private Integer id;

    private String userId;

    private BigDecimal money;
}
