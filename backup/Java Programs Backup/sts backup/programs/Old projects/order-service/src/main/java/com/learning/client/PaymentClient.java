package com.learning.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.enums.PaymentStatus;

@FeignClient(value = "paymentClient" , url ="http://localhost:8082/payment")
public interface PaymentClient {

	@PostMapping
	public PaymentStatus post(@RequestBody Payment payment);
	
	@GetMapping("/{id}")    
	public Payment getById(@PathVariable int id);
}
