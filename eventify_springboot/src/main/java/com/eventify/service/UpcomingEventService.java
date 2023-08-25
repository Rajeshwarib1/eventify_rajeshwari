package com.eventify.service;

import com.eventify.entity.UpcomingEventEntity;
import com.eventify.repository.UpcomingEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpcomingEventService {

    private final UpcomingEventRepository upcomingEventRepository;

    @Autowired
    public UpcomingEventService(UpcomingEventRepository upcomingEventRepository) {
        this.upcomingEventRepository = upcomingEventRepository;
    }

    public List<UpcomingEventEntity> getAllUpcomingEvents() {
        return upcomingEventRepository.findAll();
    }

    public Optional<UpcomingEventEntity> getUpcomingEventById(Long id) {
        return upcomingEventRepository.findById(id);
    }

    public UpcomingEventEntity createUpcomingEvent(UpcomingEventEntity upcomingEvent) {
        return upcomingEventRepository.save(upcomingEvent);
    }

    public UpcomingEventEntity updateUpcomingEvent(Long id, UpcomingEventEntity upcomingEventDetails) {
        Optional<UpcomingEventEntity> optionalUpcomingEvent = upcomingEventRepository.findById(id);
        if (optionalUpcomingEvent.isPresent()) {
            UpcomingEventEntity upcomingEvent = optionalUpcomingEvent.get();
            // Update attributes here
            return upcomingEventRepository.save(upcomingEvent);
        }
        return null; // Handle not found case
    }

    public void deleteUpcomingEvent(Long id) {
        upcomingEventRepository.deleteById(id);
    }
}
