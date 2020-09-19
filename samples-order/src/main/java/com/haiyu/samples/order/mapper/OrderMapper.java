package com.haiyu.samples.order.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.haiyu.samples.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/4 18:46
 * @Version 1.0
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    /**
     * 创建订单
     * @Param:  order 订单信息
     * @Return:
     */
//    void insert(@Param("order") Order order);
}
