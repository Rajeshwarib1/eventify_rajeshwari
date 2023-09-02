package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.entity.Customer;
import com.event.entity.LoginValid;
import com.event.repo.CustoRepo;

@Service
public class CustService {

	@Autowired
	CustoRepo cRepo;
	
	public String saveCust(Customer cs) {
		
		cRepo.save(cs);
		return "saves";
	}
	public Boolean validate(LoginValid lgd) {
		Customer cs = cRepo.validLogin(lgd.getUsername());
		System.out.println(cs);
		if(lgd.getUsername().equals(cs.getUsername()) && lgd.getPassword().equals(cs.getPassword()))
			return true;
			else return false;
		
		
	}
}
