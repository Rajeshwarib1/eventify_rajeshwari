package com.eventify.repository;

import com.eventify.entity.VendorEntity;
import com.eventify.model.Model;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<VendorEntity, Long> {

	void save(Model model);

	Model findByEmail(String em);

}
