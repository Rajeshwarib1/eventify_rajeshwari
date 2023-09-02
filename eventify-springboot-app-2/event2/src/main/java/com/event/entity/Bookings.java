package com.event.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bookings {
	
		@Id
		@GeneratedValue
		private long bookingId;
		private String type;
		private String description;
		private String city;
		private String date;
		private double price;
		private String status;
		public Bookings() {
			super();
		}
		public Bookings(String type, String description, String city, String date, double price, String status) {
			super();
			this.type = type;
			this.description = description;
			this.city = city;
			this.date = date;
			this.price = price;
			this.status = status;
		}
		public Bookings(long bookingId, String type, String description, String city, String date, double price,
				String status) {
			super();
			this.bookingId = bookingId;
			this.type = type;
			this.description = description;
			this.city = city;
			this.date = date;
			this.price = price;
			this.status = status;
		}
		public long getBookingId() {
			return bookingId;
		}
		public String getType() {
			return type;
		}
		public String getDescription() {
			return description;
		}
		public String getCity() {
			return city;
		}
		public String getDate() {
			return date;
		}
		public double getPrice() {
			return price;
		}
		public String getStatus() {
			return status;
		}
		public void setBookingId(long bookingId) {
			this.bookingId = bookingId;
		}
		public void setType(String type) {
			this.type = type;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Bookings [bookingId=" + bookingId + ", type=" + type + ", description=" + description + ", city="
					+ city + ", date=" + date + ", price=" + price + ", status=" + status + "]";
		}
		
		
}
