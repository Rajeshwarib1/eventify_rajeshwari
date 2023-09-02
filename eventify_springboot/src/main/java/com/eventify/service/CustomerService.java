package com.eventify.service;

import com.eventify.entity.CustomerEntity;
import com.eventify.model.Customer;

import java.util.List;

public interface CustomerService {
	public String createCustomer(CustomerEntity customer);

    List<Customer> getAllCustomer();

    boolean deleteCustomer(Long id);

    Customer getCustomerById(Long id);

    Customer updateCustomer(Long id, Customer customer);

	List<Customer> getAllCustomers();

}