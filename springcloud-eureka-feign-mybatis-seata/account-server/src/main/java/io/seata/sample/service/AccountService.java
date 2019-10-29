package io.seata.sample.service;

import java.math.BigDecimal;

/**
 * @author chinaren   2019 10 29
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money);
}
