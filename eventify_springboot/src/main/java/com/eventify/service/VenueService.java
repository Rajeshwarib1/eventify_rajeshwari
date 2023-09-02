package com.eventify.service;

import java.util.List;

import com.eventify.model.EventPlanner;
import com.eventify.model.Venue;

public interface VenueService {
 
    EventPlanner updateOwner(Long id, EventPlanner eventPlanner);

	Venue createVenue(Venue venue);

	List<Venue> getAllVenues();

	boolean deleteVenue(Long id);

	Venue getVenueById(Long id);

	Venue updateVenue(Long id, Venue venue);

	List<Venue> getAllVenue();


}
