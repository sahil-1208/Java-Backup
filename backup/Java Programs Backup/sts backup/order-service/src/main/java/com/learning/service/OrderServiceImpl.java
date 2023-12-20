package com.learning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.entity.OrderEntity;
import com.learning.enums.OrderStatus;
import com.learning.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Long createOrder(OrderEntity orderEntity) {
		OrderEntity savedOrderEntity = orderRepository.save(orderEntity);
		Long id = savedOrderEntity.getId();
		return id;
	}

	@Override
	public OrderEntity getById(Long id) {
		Optional<OrderEntity> optional = orderRepository.findById(id);
		boolean isPresent = optional.isPresent();
		if (isPresent) {
			OrderEntity orderEntity = optional.get();
			return orderEntity;
		} else {
			return null;
		}
	}

	public List<OrderEntity> getAll() {
		List<OrderEntity> orderList = orderRepository.findAll();
		return orderList;
	}

	@Override
	public List<OrderEntity> getByName(String name) {
		List<OrderEntity> orderList = orderRepository.findByName(name);
		return orderList;
	}

	@Override
	public OrderStatus update(Long id, OrderEntity orderEntity) {
		OrderEntity storedOrderEntity = getById(id);
		if (storedOrderEntity != null) {
			storedOrderEntity.setName(orderEntity.getName());
			storedOrderEntity.setOrderDate(orderEntity.getOrderDate());
			storedOrderEntity.setOrderStatus(orderEntity.getOrderStatus());
			orderRepository.save(storedOrderEntity);
			return OrderStatus.CONFIRM;
		}

		return OrderStatus.CANCELLED;
	}

	@Override
	public OrderStatus delete(Long id) {
		orderRepository.deleteById(id);
		return OrderStatus.CONFIRM;
	}

}
