package com.haiyu.samples.common;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 10:55
 * @Version 1.0
 */
@ConfigurationProperties("spring.cloud.alibaba.seata")
public class SeataProperties {
    private String txServiceGroup;

    public SeataProperties() {
    }

    public String getTxServiceGroup() {
        return this.txServiceGroup;
    }

    public void setTxServiceGroup(String txServiceGroup) {
        this.txServiceGroup = txServiceGroup;
    }
}
