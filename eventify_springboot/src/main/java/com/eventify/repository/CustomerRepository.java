package com.eventify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventify.entity.CustomerEntity;

public interface CustomerRepository  extends JpaRepository<CustomerEntity, Long>{

}
