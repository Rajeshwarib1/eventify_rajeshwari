package com.eventify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VendorEntity {

    public static final String getDescription = null;

	public static String getGetdescription() {
		return getDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public VendorEntity(Long id, String username, String password, String firstName, String lastName, String email,
			String phone, String address, String gender, String serviceType, String serviceId, String description,
			String price) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.serviceType = serviceType;
		this.serviceId = serviceId;
		this.description = description;
		this.price = price;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private String serviceType;
    private String serviceId;
    private String description;
    private String price;

    // Constructors, getters, setters, toString

    // Default constructor
    public VendorEntity() {
    }

    // Parameterized constructor
    public VendorEntity(String username, String password, String firstName, String lastName,
            String email, String phone, String address, String gender, String serviceType, String serviceId) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.serviceType = serviceType;
        this.serviceId = serviceId;
    }

    // Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}  

    @Override
	public String toString() {
		return "VendorEntity [id=" + id + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", gender=" + gender + ", serviceType=" + serviceType + ", serviceId=" + serviceId
				+ ", description=" + description + ", price=" + price + "]";
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
