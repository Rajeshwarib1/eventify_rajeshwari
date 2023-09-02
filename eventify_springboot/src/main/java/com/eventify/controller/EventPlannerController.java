package com.eventify.controller;

import com.eventify.model.EventPlanner;
import com.eventify.service.EventPlannerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EventPlannerController {
    @Autowired
     EventPlannerService eventPlannerService;

    public EventPlannerController(EventPlannerService eventPlannerService) {
        this.eventPlannerService = eventPlannerService;
    }

    @PostMapping("/eventPlanner")
    public EventPlanner createEventPlanner(@RequestBody EventPlanner eventPlanner) {
        return eventPlannerService.createEventPlanner(eventPlanner);
    }

    @GetMapping("/eventPlanner")
    public List<EventPlanner> getAllEventPlanners() {
        return  eventPlannerService.getAllEventPlanners();
    }

    @DeleteMapping("/eventPlanner/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEventPlanner(@PathVariable Long id) {
        boolean deleted = false;
        deleted = eventPlannerService.deleteEventPlanner(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/eventPlanner/{id}")
    public ResponseEntity<EventPlanner> getEventPlannerById(@PathVariable Long id) {
        EventPlanner eventPlanner = null;
        eventPlanner = eventPlannerService.getEventPlannerById(id);
        return ResponseEntity.ok(eventPlanner);
    }

    @PutMapping("/eventPlanner/{id}")
    public ResponseEntity<EventPlanner> updateEventPlanner(@PathVariable Long id,
                                                           @RequestBody EventPlanner eventPlanner) {
        eventPlanner = eventPlannerService.updateEventPlanner(id, eventPlanner);
        return ResponseEntity.ok(eventPlanner);
    }
}
