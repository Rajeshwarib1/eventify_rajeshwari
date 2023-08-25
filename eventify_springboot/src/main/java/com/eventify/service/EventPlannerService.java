package com.eventify.service;

import com.eventify.entity.EventPlannerEntity;
import com.eventify.repository.EventPlannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventPlannerService {

    private final EventPlannerRepository eventPlannerRepository;

    @Autowired
    public EventPlannerService(EventPlannerRepository eventPlannerRepository) {
        this.eventPlannerRepository = eventPlannerRepository;
    }

    public List<EventPlannerEntity> getAllEventPlanners() {
        return eventPlannerRepository.findAll();
    }

    public Optional<EventPlannerEntity> getEventPlannerById(Long id) {
        return eventPlannerRepository.findById(id);
    }

    public EventPlannerEntity createEventPlanner(EventPlannerEntity eventPlanner) {
        return eventPlannerRepository.save(eventPlanner);
    }

    public EventPlannerEntity updateEventPlanner(Long id, EventPlannerEntity eventPlannerDetails) {
        Optional<EventPlannerEntity> optionalEventPlanner = eventPlannerRepository.findById(id);
        if (optionalEventPlanner.isPresent()) {
            EventPlannerEntity eventPlanner = optionalEventPlanner.get();
            eventPlanner.setFirstName(eventPlannerDetails.getFirstName());
            eventPlanner.setLastName(eventPlannerDetails.getLastName());
            eventPlanner.setEmail(eventPlannerDetails.getEmail());
            eventPlanner.setPhone(eventPlannerDetails.getPhone());
            eventPlanner.setAddress(eventPlannerDetails.getAddress());
            eventPlanner.setGender(eventPlannerDetails.getGender());
            eventPlanner.setExpertise(eventPlannerDetails.getExpertise());
            // Update other fields here
            return eventPlannerRepository.save(eventPlanner);
        }
        return null; // Handle not found case
    }

    public void deleteEventPlanner(Long id) {
        eventPlannerRepository.deleteById(id);
    }
}
