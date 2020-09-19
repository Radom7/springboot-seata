package com.haiyu.samples.storage.service;

import com.haiyu.samples.storage.entity.Storage;

import java.sql.SQLException;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 12:30
 * @Version 1.0
 */
public interface StorageService {
    void deduct(String commodityCode, int count);

    Storage get(Integer id);

    void batchUpdate() throws SQLException;

    void batchDelete() throws SQLException;

}
