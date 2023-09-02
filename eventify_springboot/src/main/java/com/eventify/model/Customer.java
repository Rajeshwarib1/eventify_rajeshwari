package com.eventify.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String phone;
    private String address;
    private String gender;

	public Customer(Long long1, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Customer(long id, String firstName, String lastName, String emailId, String phone, String address,
			String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
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
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", phone=" + phone + ", address=" + address + ", gender=" + gender + "]";
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
    
}