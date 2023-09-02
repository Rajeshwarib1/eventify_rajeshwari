package com.eventify.service;

import com.eventify.entity.VenueEntity;
import com.eventify.model.EventPlanner;
import com.eventify.model.Venue;
import com.eventify.repository.VenueRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VenueServiceImpl implements VenueService {

    private VenueRepository venueRepository;

    public VenueServiceImpl(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    @Override
    public Venue createVenue(Venue venue) {
        VenueEntity venueEntity = new VenueEntity();

        BeanUtils.copyProperties(venue, venueEntity);
        venueRepository.save(venueEntity);
        return venue;
    }

    @Override
    public List<Venue> getAllVenue() {
        List<VenueEntity> venueEntities = venueRepository.findAll();

        List<Venue> venues = venueEntities
                .stream()
                .map(ven -> new Venue(
                        ven.getId(),
                        ven.getName(),
                        ven.getType(),
                        ven.getAddress(),
                        ven.getDescription(),
                        ven.getDescription(),
                        ven.getCapacity(),
                        ven.getPrice()))
                .collect(Collectors.toList());
        return venues;
    }

    @Override
    public boolean deleteVenue(Long id) {
        VenueEntity venue = venueRepository.findById(id).get();
        venueRepository.delete(venue);
        return true;
    }

    @Override
    public Venue getVenueById(Long id) {
        VenueEntity venueEntity = venueRepository.findById(id).get();
        Venue venue = new Venue();
        BeanUtils.copyProperties(venueEntity, venue);
        return venue;
    }

    @Override
    public Venue updateVenue(Long id, Venue venue) {
        VenueEntity venueEntity = venueRepository.findById(id).get();
        venueEntity.setName(venue.getName());
        venueEntity.setType(venue.getType());
        venueEntity.setAddress(venue.getAddress());
        venueEntity.setDescription(venue.getDescription());
        venueEntity.setCapacity(venue.getCapacity());
        venueEntity.setPrice(venue.getPrice());

        venueRepository.save(venueEntity);
        return venue;
    }

	@Override
	public EventPlanner updateOwner(Long id, EventPlanner eventPlanner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venue> getAllVenues() {
		// TODO Auto-generated method stub
		return null;
	}
}
