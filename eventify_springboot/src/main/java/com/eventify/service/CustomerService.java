package com.eventify.service;

import com.eventify.entity.CustomerEntity;
import com.eventify.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<CustomerEntity> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public CustomerEntity createCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    public CustomerEntity updateCustomer(Long id, CustomerEntity customerDetails) {
        Optional<CustomerEntity> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            CustomerEntity customer = optionalCustomer.get();
            customer.setUsername(customerDetails.getUsername());
            customer.setPassword(customerDetails.getPassword());
            customer.setFirstName(customerDetails.getFirstName());
            customer.setLastName(customerDetails.getLastName());
            customer.setEmail(customerDetails.getEmail());
            customer.setPhone(customerDetails.getPhone());
            customer.setAddress(customerDetails.getAddress());
            customer.setGender(customerDetails.getGender());
            // Update other fields here
            return customerRepository.save(customer);
        }
        return null; // Handle not found case
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

	public void updateLastLoginTime(String username) {
		// TODO Auto-generated method stub
		
	}
}
