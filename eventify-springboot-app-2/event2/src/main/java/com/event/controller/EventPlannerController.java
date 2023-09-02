package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 import com.event.entity.EventPlanner;
 import com.event.service.EventPlannerService;

@RestController
@CrossOrigin
public class EventPlannerController {
	
	@Autowired
	EventPlannerService eps;
	
	@PostMapping("/registerEventPlanner")
	public String registerEventPlanner(@RequestBody EventPlanner ep) {
		
		eps.saveEventPlanner(ep);
		return "done";
	}
}
