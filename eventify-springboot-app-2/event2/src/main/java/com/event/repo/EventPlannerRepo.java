package com.event.repo;

import org.springframework.data.repository.CrudRepository;

import com.event.entity.EventPlanner;

public interface EventPlannerRepo extends CrudRepository<EventPlanner, Long>{

}
