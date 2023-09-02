package com.event.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.event.entity.Customer;

public interface CustoRepo extends CrudRepository<Customer, Long>{
	
	@Query("select c from Customer c where c.username = :n")
	public Customer validLogin(@Param("n") String un);

}
