package com.eventify.repository;

import com.eventify.entity.EventPlannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventPlannerRepository extends JpaRepository<EventPlannerEntity, Long> {

//    // Find event planners by expertise
//    List<EventPlannerEntity> findByExpertise(String expertise);
//
//    // Find event planners by first name and last name
//    List<EventPlannerEntity> findByFirstNameAndLastName(String firstName, String lastName);
//
//    // Find event planners by expertise containing a specific keyword
//    List<EventPlannerEntity> findByExpertiseContainingIgnoreCase(String keyword);
//
//    // Find event planners by expertise and gender
//    List<EventPlannerEntity> findByExpertiseAndGender(String expertise, String gender);
//
//    // Find event planners by first name or last name
//    List<EventPlannerEntity> findByFirstNameOrLastName(String firstName, String lastName);
//
//    // Using a custom JPQL query to find event planners by expertise
//    @Query("SELECT e FROM EventPlannerEntity e WHERE e.expertise = :expertise")
//    List<EventPlannerEntity> findEventPlannersByExpertise(String expertise);
//
//    // Using a native SQL query to find event planners by full name
//    @Query(value = "SELECT * FROM event_planners WHERE LOWER(first_name) LIKE %:keyword% OR LOWER(last_name) LIKE %:keyword%", nativeQuery = true)
//    List<EventPlannerEntity> findEventPlannersByFullNameNative(String keyword);
}
