package com.eventify.repository;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventify.entity.CustomerEntity;

public interface CustomerRepository  extends JpaRepository<CustomerEntity, Long>{

	void deleteById(Long id);
	
//	 // Example 1: Find customers by their first name
//    List<CustomerEntity> findByFirstName(String firstName);
//
//    // Example 2: Find customers by their last name
//    List<CustomerEntity> findByLastName(String lastName);
//
//    // Example 3: Find customers by their email (exact match)
//    CustomerEntity findByEmail(String email);
//
//    // Example 4: Find customers by their username containing a certain string
//    List<CustomerEntity> findByUsernameContaining(String keyword);
//
//    // Example 5: Find customers by their first name or last name
//    List<CustomerEntity> findByFirstNameOrLastName(String firstName, String lastName);
//
//    // Example 6: Find customers with a case-insensitive search by username
//    List<CustomerEntity> findByUsernameIgnoreCase(String username);
//
//    // Example 7: Using a custom JPQL query
//    @Query("SELECT c FROM CustomerEntity c WHERE c.gender = :gender")
//    List<CustomerEntity> findCustomersByGender(String gender);
//    
//    // Example 8: Find customers by phone number
//    CustomerEntity findByPhone(String phone);
//
//    // Example 9: Find customers by gender and address
//    List<CustomerEntity> findByGenderAndAddress(String gender, String address);
//
//    // Example 10: Find customers by age greater than a certain value
//    List<CustomerEntity> findByAgeGreaterThan1(int age);
//
//    // Example 11: Find customers by age between a range
//    List<CustomerEntity> findByAgeBetween1(int minAge, int maxAge);
//
//    // Example 12: Find customers by their usernames and sort them by email
//    List<CustomerEntity> findByUsernameInOrderByEmail(List<String> usernames);
//
//    // Example 13: Using a native SQL query
//    @Query(value = "SELECT * FROM customers WHERE gender = :gender", nativeQuery = true)
//    List<CustomerEntity> findCustomersByGenderNative(String gender);
//    
//    List<CustomerEntity> findByAgeGreaterThan(int age);
//
//    List<CustomerEntity> findByAgeBetween(int minAge, int maxAge);
//
//    List<CustomerEntity> findByUsernameIgnoreCase1(String username);
//
//    List<CustomerEntity> findByEmailContaining(String substring);
//
//    List<CustomerEntity> findByAddressStartsWith(String prefix);
//
//    List<CustomerEntity> findByAgeOrderByUsernameDesc(int age);
//
//    @Query("SELECT c FROM CustomerEntity c WHERE c.address = :address")
//    List<CustomerEntity> findCustomersByAddress(String address);
//
//    @Query(value = "SELECT * FROM customers WHERE age >= :minAge AND age <= :maxAge", nativeQuery = true)
//    List<CustomerEntity> findCustomersByAgeRangeNative(int minAge, int maxAge);
}
