package com.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.enums.PaymentStatus;
import com.learning.model.Payment;
import com.learning.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
    
	public PaymentStatus addPayment(Payment payment) {
		paymentRepository.addPayment(payment);
		return PaymentStatus.SUCCESS;
	}
	
	public Payment findPaymentById(int id) {
		return paymentRepository.findPaymentById(id);
	}
}
