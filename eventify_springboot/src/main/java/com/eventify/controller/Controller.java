package com.eventify.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventify.model.*;
import com.eventify.service.Userservice;

@CrossOrigin
@RestController
@RequestMapping("/home")
public class Controller {

	@Autowired
	Userservice service;
	
	@PostMapping("/registeruser")
	public boolean createCustomer(@RequestBody Model model) {
		return service.addUser(model);
		
	}
	
	@PostMapping("/user")
	public boolean verifyuser(@RequestBody Model model)
	{
		String em=model.getEmail();
		String ps=model.getPassword();
		return service.loginVer(em,ps);
	}
	
}
