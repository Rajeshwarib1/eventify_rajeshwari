package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.event.entity.Vendor;
 import com.event.repo.VendorRepo;

@Service
public class VendorService {

	@Autowired
	VendorRepo vRepo;
	
	public String saveVendor(Vendor ven) {
		
		vRepo.save(ven);
		return "saves";
	}

}
