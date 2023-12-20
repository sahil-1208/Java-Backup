package com.learning.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.client.Movie;
import com.learning.enums.OrderStatus;
import com.learning.module.Order;

@Service
public class OrderService {

	@Autowired
	private MovieService movieService;
	// client payment
	private long id;
	
	public Order createOrder(String actorName) {
		Order order = new Order();
		
		Movie movie = movieService.getByActorName(actorName);
		if (Objects.nonNull(movie)) {
			order.setId(id);
			order.setMovie(movie);
			order.setOrderStatus(OrderStatus.SUCCESS);
			id++;
			// payment object create <- set order
			// then  payment <- add payment method
		} else {
			order.setId(-1);
			order.setOrderStatus(OrderStatus.FAIL);
		}
		return order;
	}

}
