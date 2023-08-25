package com.eventify.controller;

import com.eventify.entity.UpcomingEventEntity;
import com.eventify.service.UpcomingEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/upcoming-events")
public class UpcomingEventController {

    private final UpcomingEventService upcomingEventService;

    @Autowired
    public UpcomingEventController(UpcomingEventService upcomingEventService) {
        this.upcomingEventService = upcomingEventService;
    }

    @GetMapping
    public ResponseEntity<List<UpcomingEventEntity>> getAllUpcomingEvents() {
        List<UpcomingEventEntity> upcomingEvents = upcomingEventService.getAllUpcomingEvents();
        return ResponseEntity.ok(upcomingEvents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UpcomingEventEntity> getUpcomingEventById(@PathVariable Long id) {
        Optional<UpcomingEventEntity> upcomingEvent = upcomingEventService.getUpcomingEventById(id);
        return upcomingEvent.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UpcomingEventEntity> createUpcomingEvent(@RequestBody UpcomingEventEntity upcomingEvent) {
        UpcomingEventEntity newUpcomingEvent = upcomingEventService.createUpcomingEvent(upcomingEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUpcomingEvent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpcomingEventEntity> updateUpcomingEvent(@PathVariable Long id, @RequestBody UpcomingEventEntity upcomingEventDetails) {
        UpcomingEventEntity updatedUpcomingEvent = upcomingEventService.updateUpcomingEvent(id, upcomingEventDetails);
        if (updatedUpcomingEvent != null) {
            return ResponseEntity.ok(updatedUpcomingEvent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUpcomingEvent(@PathVariable Long id) {
        upcomingEventService.deleteUpcomingEvent(id);
        return ResponseEntity.noContent().build();
    }
}
