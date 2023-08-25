package com.eventify.service;

import com.eventify.entity.VenueEntity;
import com.eventify.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {

    private final VenueRepository venueRepository;

    @Autowired
    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public List<VenueEntity> getAllVenues() {
        return venueRepository.findAll();
    }

    public Optional<VenueEntity> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    public VenueEntity createVenue(VenueEntity venue) {
        return venueRepository.save(venue);
    }

    public VenueEntity updateVenue(Long id, VenueEntity venueDetails) {
        Optional<VenueEntity> optionalVenue = venueRepository.findById(id);
        if (optionalVenue.isPresent()) {
            VenueEntity venue = optionalVenue.get();
            venue.setName(venueDetails.getName());
            venue.setType(venueDetails.getType());
            venue.setAddress(venueDetails.getAddress());
            venue.setDescription(venueDetails.getDescription());
            venue.setCapacity(venueDetails.getCapacity());
            // Update other fields here
            return venueRepository.save(venue);
        }
        return null; // Handle not found case
    }

    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }
}
