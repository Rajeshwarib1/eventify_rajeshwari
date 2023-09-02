package com.eventify.service;

import com.eventify.entity.VendorEntity;
import com.eventify.model.Vendor;
import com.eventify.repository.VendorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendorServiceImpl implements VendorService {

    private VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public Vendor createOwner(Vendor vendor) {
        VendorEntity vendorEntity = new VendorEntity();

        BeanUtils.copyProperties(vendor, vendorEntity);
        vendorRepository.save(vendorEntity);
        return vendor;
    }

    @Override
    public List<Vendor> getAllOwner() {
        List<VendorEntity> vendorEntities = vendorRepository.findAll();

        List<Vendor> vendors = vendorEntities
                .stream()
                .map(vend -> new Vendor(
                        vend.getId(),
                        vend.getFirstName(),
                        vend.getLastName(),
                        vend.getEmail(),
                        vend.getPhone(),
                        vend.getAddress(),
                        vend.getGender(),
                        vend.getServiceType(),
                        vend.getServiceId(),
                        vend.getDescription(),
                        vend.getPrice()))
                .collect(Collectors.toList());
        return vendors;
    }

    @Override
    public boolean deleteOwner(Long id) {
        VendorEntity vendor = vendorRepository.findById(id).get();
        vendorRepository.delete(vendor);
        return true;
    }

    @Override
    public Vendor getOwnerById(Long id) {
        VendorEntity vendorEntity = vendorRepository.findById(id).get();
        Vendor vendor = new Vendor();
        BeanUtils.copyProperties(vendorEntity, vendor);
        return vendor;
    }

    @Override
    public Vendor updateOwner(Long id, Vendor vendor) {
        VendorEntity vendorEntity = vendorRepository.findById(id).get();
        vendorEntity.setFirstName(vendor.getFirstName());
        vendorEntity.setLastName(vendor.getLastName());
        vendorEntity.setServiceType(vendor.getServiceType());
        vendorEntity.setPrice(vendor.getPrice());
        vendorEntity.setAddress(vendor.getAddress());
        vendorEntity.setDescription(vendor.getDescription());

        vendorRepository.save(vendorEntity);
        return vendor;
    }

	@Override
	public Vendor createVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendor> getAllVendors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVendor(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vendor getVendorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vendor updateVendor(Long id, Vendor vendor) {
		// TODO Auto-generated method stub
		return null;
	}
}
