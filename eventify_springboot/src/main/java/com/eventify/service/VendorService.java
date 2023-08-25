package com.eventify.service;

import com.eventify.entity.VendorEntity;
import com.eventify.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorService {

    private final VendorRepository vendorRepository;

    @Autowired
    public VendorService(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public List<VendorEntity> getAllVendors() {
        return vendorRepository.findAll();
    }

    public Optional<VendorEntity> getVendorById(Long id) {
        return vendorRepository.findById(id);
    }

    public VendorEntity createVendor(VendorEntity vendor) {
        return vendorRepository.save(vendor);
    }

    public VendorEntity updateVendor(Long id, VendorEntity vendorDetails) {
        Optional<VendorEntity> optionalVendor = vendorRepository.findById(id);
        if (optionalVendor.isPresent()) {
            VendorEntity vendor = optionalVendor.get();
            vendor.setUsername(vendorDetails.getUsername());
            vendor.setPassword(vendorDetails.getPassword());
            vendor.setFirstName(vendorDetails.getFirstName());
            vendor.setLastName(vendorDetails.getLastName());
            vendor.setEmail(vendorDetails.getEmail());
            vendor.setPhone(vendorDetails.getPhone());
            vendor.setAddress(vendorDetails.getAddress());
            vendor.setGender(vendorDetails.getGender());
            vendor.setServiceType(vendorDetails.getServiceType());
            vendor.setServiceId(vendorDetails.getServiceId());
            // Update other fields here
            return vendorRepository.save(vendor);
        }
        return null; // Handle not found case
    }

    public void deleteVendor(Long id) {
        vendorRepository.deleteById(id);
    }
}
