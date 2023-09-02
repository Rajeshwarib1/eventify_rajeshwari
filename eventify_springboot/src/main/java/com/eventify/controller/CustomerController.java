package com.eventify.controller;

import com.eventify.entity.CustomerEntity;
import com.eventify.model.Customer;
import com.eventify.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://192.168.56.1:3001")
@RequestMapping("/api/v1/")
public class CustomerController {
	@Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/resist")
    public String createCustomer(@RequestBody CustomerEntity cust) {
         customerService.createCustomer(cust);
        return "Done";
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return  customerService.getAllCustomers();
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteCustomer(@PathVariable Long id) {
        boolean deleted = false;
        deleted = customerService.deleteCustomer(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Customer customer = null;
        customer = customerService.getCustomerById(id);
        return ResponseEntity.ok(customer);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,
                                                   @RequestBody Customer customer) {
        customer = customerService.updateCustomer(id, customer);
        return ResponseEntity.ok(customer);
    }
}
