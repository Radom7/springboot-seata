package com.haiyu.samples.order.service;

import com.baomidou.mybatisplus.service.IService;
import com.haiyu.samples.order.entity.Order;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/4 18:41
 * @Version 1.0
 */
public interface OrderService extends IService<Order> {
    /**
     * 创建订单
     */
    void  createOrder(String userId, String commodityCode, Integer count);
}
