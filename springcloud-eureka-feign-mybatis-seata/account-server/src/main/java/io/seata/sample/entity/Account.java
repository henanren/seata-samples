package io.seata.sample.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author chinaren   2019 10 29
 */
@Data
public class Account {

    private Long id;

    /**用户id*/
    private Long userId;

    /**总额度*/
    private BigDecimal total;

    /**已用额度*/
    private BigDecimal used;

    /**剩余额度*/
    private BigDecimal residue;
}
