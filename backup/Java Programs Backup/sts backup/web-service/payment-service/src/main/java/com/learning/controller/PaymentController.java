package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.enums.PaymentStatus;
import com.learning.model.Payment;
import com.learning.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping
	public PaymentStatus post(@RequestBody Payment payment) {
		return service.addPayment(payment);
	}
	
	@GetMapping("/{id}")    
	public Payment getById(@PathVariable int id) {
		return service.findPaymentById(id);
	}

}
