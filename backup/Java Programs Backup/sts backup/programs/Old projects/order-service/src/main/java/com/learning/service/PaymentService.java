package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.learning.client.Payment;
import com.learning.client.PaymentClient;
import com.learning.enums.PaymentStatus;

public class PaymentService {

	@Autowired
	private PaymentClient paymentClient;

	public PaymentStatus addPayment(Payment payment) {
		return paymentClient.post(payment);
	}

	public Payment getById(int id) {
		return paymentClient.getById(id);

	}
}
