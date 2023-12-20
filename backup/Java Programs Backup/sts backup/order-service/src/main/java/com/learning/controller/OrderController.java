package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entity.OrderEntity;
import com.learning.enums.OrderStatus;
import com.learning.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping
	public Long createOrder(@RequestBody OrderEntity orderEntity) {
		return orderService.createOrder(orderEntity);
	}

	@GetMapping("/id")
	public OrderEntity getById(@RequestParam Long id) {
		return orderService.getById(id);
	}

	@GetMapping("/all")
	public List<OrderEntity> getAll() {
		return orderService.getAll();
	}

	@GetMapping("/name")
	public List<OrderEntity> getByName(String name) {
		return orderService.getByName(name);
	}

	@PutMapping
	public OrderStatus update(Long id, OrderEntity orderEntity) {
		return orderService.update(id, orderEntity);
	}

	@DeleteMapping
	public OrderStatus delete(Long id) {
		return orderService.delete(id);
	}

}
