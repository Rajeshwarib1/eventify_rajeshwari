package com.eventify.model;

public class Venue {
	 private Long id;
	    
	    private String name;
	    private String type;
	    private String address;
	    private String description;
	    private String capacity;
	    private double price;
	    
	    
		public Venue(Long id, String name, String type, String address, String description, String capacity,
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
		public Venue(Long long1, String string, String string2, String string3, String string4, String string5, String string6, Object object) {
			super();
		}

		public Venue() {
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Venue [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + ", description="
					+ description + ", capacity=" + capacity + ", price=" + price + "]";
		}
		public Long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getType() {
			return type;
		}
		public String getAddress() {
			return address;
		}
		public String getDescription() {
			return description;
		}
		public String getCapacity() {
			return capacity;
		}
		public double getPrice() {
			return price;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public void setCapacity(String capacity) {
			this.capacity = capacity;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	    
	    
}
