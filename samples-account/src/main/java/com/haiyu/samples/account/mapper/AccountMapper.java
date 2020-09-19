package com.haiyu.samples.account.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.haiyu.samples.account.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Desc:
 * @Author: liuxing
 * @Date: 2020/4/5 12:09
 * @Version 1.0
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    Account selectByUserId(@Param("userId") String userId);

    Integer updateMoneyById(@Param("id")Integer id, @Param("money")BigDecimal money);
}
