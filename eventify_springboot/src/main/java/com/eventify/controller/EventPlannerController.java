package com.eventify.controller;

import com.eventify.entity.EventPlannerEntity;
import com.eventify.service.EventPlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eventplanners")
public class EventPlannerController {

    private final EventPlannerService eventPlannerService;

    @Autowired
    public EventPlannerController(EventPlannerService eventPlannerService) {
        this.eventPlannerService = eventPlannerService;
    }

    @GetMapping
    public ResponseEntity<List<EventPlannerEntity>> getAllEventPlanners() {
        List<EventPlannerEntity> eventPlanners = eventPlannerService.getAllEventPlanners();
        return ResponseEntity.ok(eventPlanners);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventPlannerEntity> getEventPlannerById(@PathVariable Long id) {
        Optional<EventPlannerEntity> eventPlanner = eventPlannerService.getEventPlannerById(id);
        return eventPlanner.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EventPlannerEntity> createEventPlanner(@RequestBody EventPlannerEntity eventPlanner) {
        EventPlannerEntity newEventPlanner = eventPlannerService.createEventPlanner(eventPlanner);
        return ResponseEntity.status(HttpStatus.CREATED).body(newEventPlanner);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventPlannerEntity> updateEventPlanner(@PathVariable Long id, @RequestBody EventPlannerEntity eventPlannerDetails) {
        EventPlannerEntity updatedEventPlanner = eventPlannerService.updateEventPlanner(id, eventPlannerDetails);
        if (updatedEventPlanner != null) {
            return ResponseEntity.ok(updatedEventPlanner);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventPlanner(@PathVariable Long id) {
        eventPlannerService.deleteEventPlanner(id);
        return ResponseEntity.noContent().build();
    }
}
