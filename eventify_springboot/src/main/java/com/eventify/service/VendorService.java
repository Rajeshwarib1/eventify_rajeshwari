package com.eventify.service;

import java.util.List;

 import com.eventify.model.Vendor;

public interface VendorService {
 
	Vendor createVendor(Vendor vendor);

	List<Vendor> getAllVendors();

	boolean deleteVendor(Long id);

	Vendor getVendorById(Long id);

	Vendor updateVendor(Long id, Vendor vendor);

	Vendor createOwner(Vendor vendor);

	List<Vendor> getAllOwner();

	boolean deleteOwner(Long id);

	Vendor getOwnerById(Long id);

	Vendor updateOwner(Long id, Vendor vendor);

}
