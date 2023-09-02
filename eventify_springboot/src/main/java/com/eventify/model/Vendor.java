package com.eventify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private String serviceType;
    private String serviceId;
    private String description;
    private String price;
	public Vendor(long id, String name, String email, String phone, String address, String gender, String serviceType,
			String serviceId, String description, String price) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.serviceType = serviceType;
		this.serviceId = serviceId;
		this.description = description;
		this.price = price;
	}
	public Vendor(Long long1, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
		super();
	}

	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public String getServiceType() {
		return serviceType;
	}
	public String getServiceId() {
		return serviceId;
	}
	public String getDescription() {
		return description;
	}
	public String getPrice() {
		return price;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	
}