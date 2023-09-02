package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.entity.Customer;
import com.event.entity.LoginValid;
import com.event.service.CustService;

import ch.qos.logback.core.net.SyslogOutputStream;

@RestController
@CrossOrigin
public class CustomerController {
	
	@Autowired
	CustService cuser;
	
	@PostMapping("/registerCustomer")
	public String registerCust(@RequestBody Customer cs) {
		System.out.println("in Resister CustApi"+ cs);
		cuser.saveCust(cs);
		System.out.println("Resister Api Completed ");

		return "done";
	}
	@PostMapping("/login")
	public Boolean loginCh(@RequestBody LoginValid lgd) {
		System.out.println(lgd);
		Boolean res = cuser.validate(lgd);
		return res;
	}
}
