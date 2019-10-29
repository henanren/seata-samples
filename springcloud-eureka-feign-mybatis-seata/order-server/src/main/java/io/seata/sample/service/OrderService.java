package io.seata.sample.service;

import io.seata.sample.entity.Order;

/**
 * @author chinaren   2019 10 29
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);
}
