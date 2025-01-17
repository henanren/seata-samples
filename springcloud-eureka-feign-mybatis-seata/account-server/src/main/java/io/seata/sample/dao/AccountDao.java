package io.seata.sample.dao;

import java.math.BigDecimal;
import org.apache.ibatis.annotations.Param;

/**
 * @author chinaren   2019 10 29
 */
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
