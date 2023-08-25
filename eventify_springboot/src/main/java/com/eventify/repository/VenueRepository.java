package com.eventify.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eventify.entity.VenueEntity;

public interface VenueRepository  extends JpaRepository<VenueEntity, Long>{
	
//    // Find venues by type
//    List<VenueEntity> findByType(String type);
//
//    // Find venues with capacity greater than a specified value
//    List<VenueEntity> findByCapacityGreaterThan(int capacity);
//
//    // Find venues by name containing a specific keyword
//    List<VenueEntity> findByNameContainingIgnoreCase(String keyword);
//
//    // Find venues by type and address
//    List<VenueEntity> findByTypeAndAddress(String type, String address);
//
//    // Find venues with a specific type and capacity
//    List<VenueEntity> findByTypeAndCapacityGreaterThan(String type, int capacity);
//
//    // Find venues by type or capacity
//    List<VenueEntity> findByTypeOrCapacityGreaterThan(String type, int capacity);
//
//    // Using a custom JPQL query to find venues by address
//    @Query("SELECT v FROM VenueEntity v WHERE v.address = :address")
//    List<VenueEntity> findVenuesByAddress(String address);
//
//    // Using a native SQL query to find venues by name
//    @Query(value = "SELECT * FROM venues WHERE LOWER(name) LIKE %:keyword%", nativeQuery = true)
//    List<VenueEntity> findVenuesByNameNative(String keyword);
}
 
 





    

