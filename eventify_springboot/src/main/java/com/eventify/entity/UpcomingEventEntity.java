package com.eventify.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UpcomingEventEntity {

   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventName;
    private String eventType;
    private String eventDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String bookedBy;
    private String description;
    private String venueLocation;
    private String typeOfServiceUsed;
    private double totalexpense;
    // Add more attributes as needed

    // Constructors, getters, setters, toString
    public UpcomingEventEntity() {
		super();
	}
	public UpcomingEventEntity(Long id, String eventName, String eventType, String eventDate, LocalDateTime startTime,
			LocalDateTime endTime, String bookedBy, String description, String venueLocation, String typeOfServiceUsed,
			double totalexpense) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.bookedBy = bookedBy;
		this.description = description;
		this.venueLocation = venueLocation;
		this.typeOfServiceUsed = typeOfServiceUsed;
		this.totalexpense = totalexpense;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVenueLocation() {
		return venueLocation;
	}
	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}
	public String getTypeOfServiceUsed() {
		return typeOfServiceUsed;
	}
	public void setTypeOfServiceUsed(String typeOfServiceUsed) {
		this.typeOfServiceUsed = typeOfServiceUsed;
	}
	public double getTotalexpense() {
		return totalexpense;
	}
	public void setTotalexpense(double totalexpense) {
		this.totalexpense = totalexpense;
	}
	@Override
	public String toString() {
		return "UpcomingEventEntity [id=" + id + ", eventName=" + eventName + ", eventType=" + eventType
				+ ", eventDate=" + eventDate + ", startTime=" + startTime + ", endTime=" + endTime + ", bookedBy="
				+ bookedBy + ", description=" + description + ", venueLocation=" + venueLocation
				+ ", typeOfServiceUsed=" + typeOfServiceUsed + ", totalexpense=" + totalexpense + "]";
	}
    
    

}
