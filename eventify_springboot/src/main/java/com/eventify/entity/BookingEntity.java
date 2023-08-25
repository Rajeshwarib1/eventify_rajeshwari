package com.eventify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CustomerEntity customer;

    @ManyToOne
    private UpcomingEventEntity event;

    private Date bookingDate;
    private boolean isPaid;
    private double totalAmount;
    private String paymentMethod;
    private String bookingStatus;
    // Add more attributes as needed

    // Constructors, getters, setters, toString

    // Default constructor
    public BookingEntity() {
    }

    // Parameterized constructor
    public BookingEntity(CustomerEntity customer, UpcomingEventEntity event, Date bookingDate, 
                         boolean isPaid, double totalAmount, String paymentMethod, String bookingStatus) {
        this.customer = customer;
        this.event = event;
        this.bookingDate = bookingDate;
        this.isPaid = isPaid;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.bookingStatus = bookingStatus;
    }

    // Getters and setters

    // toString method
    @Override
    public String toString() {
        return "BookingEntity [id=" + id + ", customer=" + customer + ", event=" + event +
               ", bookingDate=" + bookingDate + ", numberOfTickets=" +
               ", isPaid=" + isPaid + ", totalAmount=" + totalAmount + ", paymentMethod=" + paymentMethod +
               ", bookingStatus=" + bookingStatus + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public UpcomingEventEntity getEvent() {
		return event;
	}

	public void setEvent(UpcomingEventEntity event) {
		this.event = event;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
}
