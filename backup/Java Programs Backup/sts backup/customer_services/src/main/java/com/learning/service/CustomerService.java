package com.learning.service;

import java.util.List;

import com.learning.enums.Status;
import com.learning.model.Customer;

public interface CustomerService {
	Long create(Customer customer);
	Customer getById(Long id);
	List<Customer>getall();
	Status deleteById(Long id);
	Status updateCustomer(Long id,Customer customer);
}
