package com.eventify.repository;

import com.eventify.entity.UpcomingEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpcomingEventRepository extends JpaRepository<UpcomingEventEntity, Long> {
}
