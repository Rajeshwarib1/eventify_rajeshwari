package com.eventify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String username;
	    private String password;    
	    private String email;
	    private String firstName;
	    private String lastName;
	    private String phone;
	    private String address;
	    private String gender;
	    
	    // Other properties, getters, setters

		public CustomerEntity(Long id, String username, String password, String email, String firstName,
				String lastName, String phone, String address, String gender) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.address = address;
			this.gender = gender;
		}
		
		

		public CustomerEntity(String username, String password, String email, String firstName, String lastName,
				String phone, String address, String gender) {
			super();
			this.username = username;
			this.password = password;
			this.email = email;
			this.firstName = firstName;
			this.lastName = lastName;
			this.phone = phone;
			this.address = address;
			this.gender = gender;
		}



		public CustomerEntity() {
			super();
		}

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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
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

		@Override
		public String toString() {
			return "CustomerEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
					+ ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", address="
					+ address + ", gender=" + gender + "]";
		}		

}
