package com.learning.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.learning.enums.PaymentStatus;
import com.learning.model.Payment;

@Component
public class PaymentRepository {

	private List<Payment> listOfPayment;
	private long id;
	public PaymentRepository() {
		listOfPayment = new LinkedList<Payment>();
		id=0;
	}
	
	public void addPayment(Payment payment) {
		payment.setId(id);
		listOfPayment.add(payment);
		id++;
	}

	public Payment findPaymentById(int id) {
		Payment payment = null;
		Stream<Payment> streamPayment = listOfPayment.stream();
		streamPayment = streamPayment.filter(eachpayment -> eachpayment.getId() == id);
		Optional<Payment> optionalPayment = streamPayment.findFirst();
		boolean isPaymentAvailable = optionalPayment.isPresent();
		if (isPaymentAvailable) {
			 payment = optionalPayment.get();
			return payment;
		} else {
			payment = new Payment();
			payment.setId(-1);
			payment.setStatus(PaymentStatus.FAIL);
		}
		return payment;
	}

}
