package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.enums.Status;
import com.learning.model.Customer;
import com.learning.service.CustomerService;

@RestController
@RequestMapping
public class Controller {
	@Autowired
	private CustomerService service;
	
	@PostMapping
	public Long createCustomer(@RequestBody Customer customer) {
		return service.create(customer);
	}
	@GetMapping
	public List<Customer> get_customer_list() {
		return service.getall();
	}
	@DeleteMapping
	public Status deleteCustomer(Long id) {
		return service.deleteById(id);
	}
	@PutMapping
	public Status updateCustomer(Long id, Customer customer ) {
		return service.updateCustomer(id, customer);
	}
}
