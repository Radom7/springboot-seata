package com.haiyu.samples.storage.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.haiyu.samples.storage.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 12:28
 * @Version 1.0
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {
    Storage selectById(@Param("id") Integer id);

    Storage findByCommodityCode(@Param("commodityCode") String commodityCode);

    int updateById(@Param("id") Integer id,@Param("count") Integer count);

    void insertBatch(List<Storage> records);

    int updateBatch(@Param("list") List<Long> ids, @Param("commodityCode") String commodityCode);
}
