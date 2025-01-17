package com.proton.order.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proton.order.Entity.Orders;
import com.proton.order.Repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orders> orderList() {
		return (List<Orders>) orderRepository.findAll();
	}
	
	public Optional<Orders> findOrder(Long id) {
		return orderRepository.findById(id);
	}
	
}
