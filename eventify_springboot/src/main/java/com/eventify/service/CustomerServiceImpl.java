package com.eventify.service;

import com.eventify.entity.CustomerEntity;
import com.eventify.model.Customer;
import com.eventify.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String createCustomer(CustomerEntity customer) {
        CustomerEntity customerEntity = new CustomerEntity();

        BeanUtils.copyProperties(customer, customerEntity);
        customerRepository.save(customer);
        return "sucess";
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<CustomerEntity> customerEntities = customerRepository.findAll();

        List<Customer> customers = customerEntities
                .stream()
                .map(cust -> new Customer(
                        cust.getId(),
                        cust.getFirstName(),
                        cust.getLastName(),
                        cust.getEmail(),
                        cust.getAddress(),
                        cust.getGender(),
                        cust.getUsername(),
                        cust.getPhone(),
                        cust.getPassword()))
                .collect(Collectors.toList());
        return customers;
    }

    @Override
    public boolean deleteCustomer(Long id) {
        CustomerEntity customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
        return true;
    }

    @Override
    public Customer getCustomerById(Long id) {
        CustomerEntity customerEntity = customerRepository.findById(id).get();
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerEntity, customer);
        return customer;
    }

    @Override
    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        CustomerEntity customerEntity = customerRepository.findById(id).get();
        customerEntity.setUsername(updatedCustomer.getUsername());
        customerEntity.setEmail(updatedCustomer.getEmail());
        customerEntity.setFirstName(updatedCustomer.getFirstName());
        customerEntity.setLastName(updatedCustomer.getLastName());
        customerEntity.setPhone(updatedCustomer.getPhone());
        customerEntity.setAddress(updatedCustomer.getAddress());
        customerEntity.setGender(updatedCustomer.getGender());

        customerRepository.save(customerEntity);
        return updatedCustomer;
    }

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
}
