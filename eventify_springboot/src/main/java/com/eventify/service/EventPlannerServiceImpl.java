package com.eventify.service;

import com.eventify.entity.EventPlannerEntity;
import com.eventify.model.EventPlanner;
import com.eventify.repository.EventPlannerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventPlannerServiceImpl implements EventPlannerService {

    private EventPlannerRepository eventPlannerRepository;

    public EventPlannerServiceImpl(EventPlannerRepository eventPlannerRepository) {
        this.eventPlannerRepository = eventPlannerRepository;
    }

    @Override
    public EventPlanner createEventPlanner(EventPlanner eventPlanner) {
        EventPlannerEntity eventPlannerEntity = new EventPlannerEntity();

        BeanUtils.copyProperties(eventPlanner, eventPlannerEntity);
        eventPlannerRepository.save(eventPlannerEntity);
        return eventPlanner;
    }

    @Override
    public List<EventPlanner> getAllEventPlanner() {
        List<EventPlannerEntity> eventPlannerEntities = eventPlannerRepository.findAll();

        List<EventPlanner> eventPlanners = eventPlannerEntities
                .stream()
                .map(eventPlnr -> new EventPlanner(
                        eventPlnr.getId(),
                        eventPlnr.getFirstName(),
                        eventPlnr.getLastName(),
                        eventPlnr.getExpertise(),
                        eventPlnr.getPrice(),
                        eventPlnr.getAddress(),
                        eventPlnr.getDescription()))
                .collect(Collectors.toList());
        return eventPlanners;
    }

    @Override
    public boolean deleteEventPlanner(Long id) {
        EventPlannerEntity eventPlanner = eventPlannerRepository.findById(id).get();
        eventPlannerRepository.delete(eventPlanner);
        return true;
    }

    @Override
    public EventPlanner getEventPlannerById(Long id) {
        EventPlannerEntity eventPlannerEntity = eventPlannerRepository.findById(id).get();
        EventPlanner eventPlanner = new EventPlanner();
        BeanUtils.copyProperties(eventPlannerEntity, eventPlanner);
        return eventPlanner;
    }

    @Override
    public EventPlanner updateEventPlanner(Long id, EventPlanner eventPlanner) {
        EventPlannerEntity eventPlannerEntity = eventPlannerRepository.findById(id).get();
        eventPlannerEntity.setFirstName(eventPlanner.getFirstName());
        eventPlannerEntity.setLastName(eventPlanner.getLastName());
        eventPlannerEntity.setExpertise(eventPlanner.getExpertise());
        eventPlannerEntity.setPrice(eventPlanner.getPrice());
        eventPlannerEntity.setAddress(eventPlanner.getAddress());
        eventPlannerEntity.setDescription(eventPlanner.getDescription());

        eventPlannerRepository.save(eventPlannerEntity);
        return eventPlanner;
    }

	@Override
	public EventPlanner createEventPlanners(EventPlanner eventPlanner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEventPlanners(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EventPlanner getEventPlannersById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EventPlanner updateEventPlanners(Long id, EventPlanner eventPlanner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EventPlanner> getAllEventPlanners() {
		// TODO Auto-generated method stub
		return null;
	}
}
