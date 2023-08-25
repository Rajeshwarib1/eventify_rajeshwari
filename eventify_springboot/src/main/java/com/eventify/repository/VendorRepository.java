package com.eventify.repository;

import com.eventify.entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VendorRepository extends JpaRepository<VendorEntity, Long> {

//    // Find vendors by service type
//    List<VendorEntity> findByServiceType(String serviceType);
//
//    // Find vendors by address
//    List<VendorEntity> findByAddress(String address);
//
//    // Find vendors by gender and service type
//    List<VendorEntity> findByGenderAndServiceType(String gender, String serviceType);
//
//    // Find vendors by service type and service ID
//    List<VendorEntity> findByServiceTypeAndServiceId(String serviceType, Long serviceId);
//
//    // Find vendors by service type or address
//    List<VendorEntity> findByServiceTypeOrAddress(String serviceType, String address);
//
//    // Using a custom JPQL query to find vendors by expertise
//    @Query("SELECT v FROM VendorEntity v WHERE v.expertise = :expertise")
//    List<VendorEntity> findVendorsByExpertise(String expertise);
//
//    // Using a native SQL query to find vendors by name
//    @Query(value = "SELECT * FROM vendors WHERE LOWER(name) LIKE %:keyword%", nativeQuery = true)
//    List<VendorEntity> findVendorsByNameNative(String keyword);
}
