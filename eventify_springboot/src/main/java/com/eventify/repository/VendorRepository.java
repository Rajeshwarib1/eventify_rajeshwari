package com.eventify.repository;

import com.eventify.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

}
