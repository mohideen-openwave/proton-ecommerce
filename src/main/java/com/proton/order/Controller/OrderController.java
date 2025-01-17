package com.proton.order.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proton.order.Entity.Orders;
import com.proton.order.Service.OrderService;

@RestController
@RequestMapping("/api/v1/")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders() {
		return orderService.orderList(); 
	}
	
	@GetMapping("/order/{id}")
	public Optional<Orders> getOrder(@PathVariable Long id) {
		return orderService.findOrder(id);
	}
}
