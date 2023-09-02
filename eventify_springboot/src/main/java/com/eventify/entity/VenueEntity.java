package com.eventify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VenueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    	
    private String name;
    private String type;
    private String address;
    private String description;
    private String capacity;
    private double price;
    
    // Constructors, getters, setters, toString

    public void setPrice(double price) {
		this.price = price;
	}
    
	public VenueEntity(Long id, String name, String type, String address, String description, String capacity,
			double price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
		this.description = description;
		this.capacity = capacity;
		this.price = price;
	}

	// Default constructor
    public VenueEntity() {
    }

    // Parameterized constructor
    public VenueEntity(String name, String type, String address, String description, String capacity) {
        this.name = name;
        this.type = type;
        this.address = address;
        this.description = description;
        this.capacity = capacity;
    }

    // Getters and setters

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
	
    // toString method

	public Object getLocality() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "VenueEntity [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + ", description="
				+ description + ", capacity=" + capacity + ", price=" + price + "]";
	}

	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
