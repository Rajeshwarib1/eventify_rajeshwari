package com.eventify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventPlanner {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private String expertise;
    private String portfolioLink;
    private String description;
    private String price;
	public EventPlanner(long id, String name, String email, String phone, String address, String gender,
			String expertise, String portfolioLink, String description, String price) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.expertise = expertise;
		this.portfolioLink = portfolioLink;
		this.description = description;
		this.price = price;
	}
	public EventPlanner() {
		super();
	}
	public EventPlanner(Long id2, String firstName, String lastName, String expertise2, String price2, String address2,
			String description2) {
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
	public String getExpertise() {
		return expertise;
	}
	public String getPortfolioLink() {
		return portfolioLink;
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
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public void setPortfolioLink(String portfolioLink) {
		this.portfolioLink = portfolioLink;
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