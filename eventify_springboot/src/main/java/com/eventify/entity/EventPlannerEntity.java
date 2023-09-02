package com.eventify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EventPlannerEntity {

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
    private String expertise;
    private String portfolioLink;
    private String description;
    private String price;

    // Constructors, getters, setters, toString

    // Default constructor
    public EventPlannerEntity() {
    }

    // Parameterized constructor

    // Getters and setters

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
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

	public EventPlannerEntity(Long id, String username, String password, String firstName, String lastName,
			String email, String phone, String address, String gender, String expertise, String portfolioLink,
			String description, String price) {
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
		this.expertise = expertise;
		this.portfolioLink = portfolioLink;
		this.description = description;
		this.price = price;
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

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getPortfolioLink() {
		return portfolioLink;
	}

	public void setPortfolioLink(String portfolioLink) {
		this.portfolioLink = portfolioLink;
	}

    @Override
	public String toString() {
		return "EventPlannerEntity [id=" + id + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", gender=" + gender + ", expertise=" + expertise + ", portfolioLink=" + portfolioLink
				+ ", description=" + description + ", price=" + price + "]";
	}
}
