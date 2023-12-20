package com.learning.model;

import com.learning.enums.OrderStatus;

public class Order {
	private long id;
	private Movie movie;
	private OrderStatus orderStatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", movie=" + movie + ", orderStatus=" + orderStatus + "]";
	}

}
