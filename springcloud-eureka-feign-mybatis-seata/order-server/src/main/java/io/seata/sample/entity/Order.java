package io.seata.sample.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单
 * 
 * @author chinaren 2019 10 29
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private Long id;

	private Long userId;

	private Long productId;

	private Integer count;

	private BigDecimal money;

}
