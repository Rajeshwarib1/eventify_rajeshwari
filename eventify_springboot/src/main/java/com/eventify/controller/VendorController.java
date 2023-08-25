package com.eventify.controller;

import com.eventify.entity.VendorEntity;
import com.eventify.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {

    private final VendorService vendorService;

    @Autowired
    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @GetMapping
    public ResponseEntity<List<VendorEntity>> getAllVendors() {
        List<VendorEntity> vendors = vendorService.getAllVendors();
        return ResponseEntity.ok(vendors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendorEntity> getVendorById(@PathVariable Long id) {
        Optional<VendorEntity> vendor = vendorService.getVendorById(id);
        return vendor.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<VendorEntity> createVendor(@RequestBody VendorEntity vendor) {
        VendorEntity newVendor = vendorService.createVendor(vendor);
        return ResponseEntity.status(HttpStatus.CREATED).body(newVendor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VendorEntity> updateVendor(@PathVariable Long id, @RequestBody VendorEntity vendorDetails) {
        VendorEntity updatedVendor = vendorService.updateVendor(id, vendorDetails);
        if (updatedVendor != null) {
            return ResponseEntity.ok(updatedVendor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVendor(@PathVariable Long id) {
        vendorService.deleteVendor(id);
        return ResponseEntity.noContent().build();
    }
}
