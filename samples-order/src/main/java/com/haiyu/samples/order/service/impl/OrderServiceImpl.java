package com.haiyu.samples.order.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.haiyu.samples.order.client.AccountClient;
import com.haiyu.samples.order.entity.Order;
import com.haiyu.samples.order.mapper.OrderMapper;
import com.haiyu.samples.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/4 18:42
 * @Version 1.0
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private AccountClient accountClient;

    /**
     * 创建订单
     * @param userId
     * @param commodityCode
     * @param count
     */
    @Override
    public void createOrder(String userId, String commodityCode, Integer count) {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setCount(count);
        order.setMoney(orderMoney);
        baseMapper.insert(order);

        accountClient.debit(userId, orderMoney);
    }
}
