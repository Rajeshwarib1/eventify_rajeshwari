package com.eventify.service;

 import org.springframework.stereotype.Service;

 import com.eventify.POJO.RegistrationRequest;
import com.eventify.entity.CustomerEntity;
import com.eventify.repository.CustomerRepository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 
@Service
public class RegistrationService {

    private final CustomerRepository customerRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public RegistrationService(CustomerRepository customerRepository, BCryptPasswordEncoder passwordEncoder) {
        this.customerRepository = customerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(RegistrationRequest registrationRequest) {
        String hashedPassword = passwordEncoder.encode(registrationRequest.getPassword());

        CustomerEntity customer = new CustomerEntity();
        customer.setUsername(registrationRequest.getUsername());
        customer.setPassword(hashedPassword);
        customer.setEmail(registrationRequest.getEmail());
        customer.setFirstName(registrationRequest.getFirstName());
        customer.setLastName(registrationRequest.getLastName());
        customer.setPhone(registrationRequest.getPhone());
        customer.setAddress(registrationRequest.getAddress());
        customer.setGender(registrationRequest.getGender());

        customerRepository.save(customer);
    }

	public CustomerEntity registerNewUser(RegistrationRequest registrationRequest) {
		// TODO Auto-generated method stub
		return null;
	}
}
