package com.eventify.service;

import java.util.List;

import com.eventify.model.EventPlanner;

public interface EventPlannerService {
	EventPlanner createEventPlanners(EventPlanner eventPlanner);

    List<EventPlanner> getAllEventPlanner();

    boolean deleteEventPlanners(Long id);

    EventPlanner getEventPlannersById(Long id);

    EventPlanner updateEventPlanners(Long id, EventPlanner eventPlanner);

	EventPlanner createEventPlanner(EventPlanner eventPlanner);

	List<EventPlanner> getAllEventPlanners();

	boolean deleteEventPlanner(Long id);

	EventPlanner getEventPlannerById(Long id);

	EventPlanner updateEventPlanner(Long id, EventPlanner eventPlanner);

}
