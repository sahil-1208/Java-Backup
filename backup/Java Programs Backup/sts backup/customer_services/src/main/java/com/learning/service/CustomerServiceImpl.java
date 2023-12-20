package com.learning.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learning.enums.Status;
import com.learning.model.Customer;
import com.learning.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public Long create(Customer customer) {
		Customer savedCustomer = repository.save(customer);
		Long id = savedCustomer.getId();
		return id;
	}

	@Override
	public List<Customer> getall() {
		List<Customer> customerList = repository.findAll();
		return customerList;
	}

	@Override
	public Status deleteById(Long id) {
		repository.deleteById(id);
		return Status.SUCCESS;
	}

	@Override
	public Status updateCustomer(Long id, Customer customer) {
		Customer savedCustomer = getById(id);
		if (Objects.nonNull(savedCustomer)) {
			savedCustomer.setFirstName(customer.getFirstName());
			savedCustomer.setLastName(customer.getLastName());
			savedCustomer.setStreet(customer.getStreet());
			savedCustomer.setAddress(customer.getAddress());
			savedCustomer.setCity(customer.getCity());
			savedCustomer.setState(customer.getState());
			savedCustomer.setEmail(customer.getEmail());
			savedCustomer.setMobileNumber(customer.getMobileNumber());
		}
		return Status.SUCCESS;
	}

	@Override
	public Customer getById(Long id) {
		Optional<Customer> optional = repository.findById(id);
		boolean isPresent = optional.isPresent();
		if (isPresent) {
			Customer customer = optional.get();
			return customer;
		} else {
			return null;
		}

	}

}
