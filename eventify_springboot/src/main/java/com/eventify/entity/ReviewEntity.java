package com.eventify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId; // ID of the event being reviewed
    private Long vendorId; // ID of the vendor being reviewed
    private String customerId; // ID of the customer who wrote the review
    private String reviewText; // Actual review content
    private int rating; // Rating given by the customer (e.g., out of 5)
	

    // Constructors, getters, setters, toString
    public ReviewEntity() {
		super();
	}


	public ReviewEntity(Long id, Long eventId, Long vendorId, String customerId, String reviewText, int rating) {
		super();
		this.id = id;
		this.eventId = eventId;
		this.vendorId = vendorId;
		this.customerId = customerId;
		this.reviewText = reviewText;
		this.rating = rating;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getEventId() {
		return eventId;
	}


	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}


	public Long getVendorId() {
		return vendorId;
	}


	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getReviewText() {
		return reviewText;
	}


	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "ReviewEntity [id=" + id + ", eventId=" + eventId + ", vendorId=" + vendorId + ", customerId="
				+ customerId + ", reviewText=" + reviewText + ", rating=" + rating + "]";
	}
    
    
}
