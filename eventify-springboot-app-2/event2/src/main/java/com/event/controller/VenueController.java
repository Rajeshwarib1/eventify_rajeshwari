package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 import com.event.entity.Venue;
 import com.event.service.VenueService;

@RestController
@CrossOrigin
public class VenueController {
	
	@Autowired
	VenueService venus;
	
	@PostMapping("/registerVenue")
	public String registerVenue(@RequestBody Venue venu) {
		
		venus.saveVenue(venu);
		return "done";
	}
}
