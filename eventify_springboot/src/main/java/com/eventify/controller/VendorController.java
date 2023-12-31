package com.eventify.controller;

import com.eventify.model.Vendor;
import com.eventify.service.VendorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class VendorController {
	@Autowired
    private final VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping("/vendor")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.createVendor(vendor);
    }

    @GetMapping("/vendor")
    public List<Vendor> getAllVendors() {
        return  vendorService.getAllVendors();
    }

    @DeleteMapping("/vendor/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteVendor(@PathVariable Long id) {
        boolean deleted = false;
        deleted = vendorService.deleteVendor(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/vendor/{id}")
    public ResponseEntity<Vendor> getVendorById(@PathVariable Long id) {
        Vendor vendor = null;
        vendor = vendorService.getVendorById(id);
        return ResponseEntity.ok(vendor);
    }

    @PutMapping("/vendor/{id}")
    public ResponseEntity<Vendor> updateVendor(@PathVariable Long id,
                                               @RequestBody Vendor vendor) {
        vendor = vendorService.updateVendor(id, vendor);
        return ResponseEntity.ok(vendor);
    }
}
