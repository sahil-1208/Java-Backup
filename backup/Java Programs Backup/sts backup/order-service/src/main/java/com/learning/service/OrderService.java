package com.learning.service;

import java.util.List;

import com.learning.entity.OrderEntity;
import com.learning.enums.OrderStatus;

public interface OrderService {
	Long createOrder(OrderEntity orderEntity);
	OrderEntity getById(Long id);
	List<OrderEntity> getAll();
	List<OrderEntity> getByName(String name);
	OrderStatus update (Long id,OrderEntity orderEntity);
	OrderStatus delete (Long id);
	

}
