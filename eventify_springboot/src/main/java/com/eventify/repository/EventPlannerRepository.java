package com.eventify.repository;

import com.eventify.entity.EventPlannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventPlannerRepository extends JpaRepository<EventPlannerEntity, Long> {

}
