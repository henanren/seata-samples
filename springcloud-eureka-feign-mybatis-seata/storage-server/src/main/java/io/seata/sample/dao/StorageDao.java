package io.seata.sample.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author chinaren   2019 10 29
 */
@Repository
public interface StorageDao {

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
