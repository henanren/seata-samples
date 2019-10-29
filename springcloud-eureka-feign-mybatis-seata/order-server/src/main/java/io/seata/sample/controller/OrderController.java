package io.seata.sample.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.seata.sample.entity.Order;
import io.seata.sample.service.OrderService;

/**
 * @author chinaren 2019 10 29
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

	@Autowired
	private OrderService orderServiceImpl;

	/**
	 * 创建订单
	 * 
	 * @param order
	 * @return
	 */
	@GetMapping("create")
	public String create(@RequestParam("money") String money, @RequestParam("count") Integer count) {
		Order order = Order.builder().userId(1l).productId(1l).money(new BigDecimal(money)).count(count).build();
		orderServiceImpl.create(order);
		return "Create order success";
	}
}
