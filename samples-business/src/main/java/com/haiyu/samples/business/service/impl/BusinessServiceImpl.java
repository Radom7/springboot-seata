package com.haiyu.samples.business.service.impl;

import com.haiyu.samples.business.client.OrderClient;
import com.haiyu.samples.business.client.StorageClient;
import com.haiyu.samples.business.service.BusinessService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 13:31
 * @Version 1.0
 */
@Service
@Slf4j
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private StorageClient storageClient;
    @Autowired
    private OrderClient orderClient;


    @Override
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount) {
        log.info("purchase begin ... xid: " + RootContext.getXID());
        storageClient.deduct(commodityCode, orderCount);
        orderClient.create(userId, commodityCode, orderCount);
    }
}
