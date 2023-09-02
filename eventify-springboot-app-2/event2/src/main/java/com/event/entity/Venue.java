package com.event.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Venue {
	@Id
    @GeneratedValue
    private Long id;
    
    private String name;
    private String type;
    private String address;
    private String description;
    private String capacity;
    private double price;
	public Venue(Long id, String name, String type, String address, String description, String capacity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
		this.description = description;
		this.capacity = capacity;
		this.price = price;
	}
	public Venue(String name, String type, String address, String description, String capacity, double price) {
		super();
		this.name = name;
		this.type = type;
		this.address = address;
		this.description = description;
		this.capacity = capacity;
		this.price = price;
	}
	public Venue() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Venue [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + ", description="
				+ description + ", capacity=" + capacity + ", price=" + price + "]";
	}

    
}