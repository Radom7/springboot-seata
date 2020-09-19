package com.haiyu.samples.business.service;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 13:30
 * @Version 1.0
 */
public interface BusinessService {
    /**
     * 减库存，下订单
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     */
    void purchase(String userId, String commodityCode, int orderCount);
}
