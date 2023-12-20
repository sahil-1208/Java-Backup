package com.learning.model;


import com.learning.enums.PaymentStatus;

public class Payment {
	private long id;
	private Order order;
	private PaymentStatus status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", order=" + order + ", status=" + status + "]";
	}
	
	
}
