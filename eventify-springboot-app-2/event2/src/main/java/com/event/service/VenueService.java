package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.event.entity.Venue;
 import com.event.repo.VenueRepo;

@Service
public class VenueService {

	@Autowired
	VenueRepo vRepo;
	
	public String saveVenue(Venue venu) {
		
		vRepo.save(venu);
		return "saves";
	}

}
