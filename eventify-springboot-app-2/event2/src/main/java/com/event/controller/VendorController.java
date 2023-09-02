package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.entity.Vendor;
import com.event.service.VendorService;

@RestController
@CrossOrigin
public class VendorController {
	
	@Autowired
	VendorService vens;
	
	@PostMapping("/registerVendor")
	public String registerVendor(@RequestBody Vendor ven) {		
		vens.saveVendor(ven);
		return "done";
	}
	
	
}
