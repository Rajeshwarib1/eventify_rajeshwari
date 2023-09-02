package com.eventify.controller;

import com.eventify.model.Venue;
import com.eventify.service.VenueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class VenueController {
	@Autowired
    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @PostMapping("/venue")
    public Venue createVenue(@RequestBody Venue venue) {
        return venueService.createVenue(venue);
    }

    @GetMapping("/venue")
    public List<Venue> getAllVenues() {
        return venueService.getAllVenues();
    }

    @DeleteMapping("/venue/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteVenue(@PathVariable Long id) {
        boolean deleted = false;
        deleted = venueService.deleteVenue(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/venue/{id}")
    public ResponseEntity<Venue> getVenueById(@PathVariable Long id) {
        Venue venue = null;
        venue = venueService.getVenueById(id);
        return ResponseEntity.ok(venue);
    }

    @PutMapping("/venue/{id}")
    public ResponseEntity<Venue> updateVenue(@PathVariable Long id,
                                             @RequestBody Venue venue) {
        venue = venueService.updateVenue(id, venue);
        return ResponseEntity.ok(venue);
    }
}
