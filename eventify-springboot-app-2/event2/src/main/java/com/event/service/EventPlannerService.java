package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 import com.event.entity.EventPlanner;
 import com.event.repo.EventPlannerRepo;

@Service
public class EventPlannerService {

	@Autowired
	EventPlannerRepo eRepo;
	
	public String saveEventPlanner(EventPlanner ep) {
		
		eRepo.save(ep);
		return "saves";
	}

}
