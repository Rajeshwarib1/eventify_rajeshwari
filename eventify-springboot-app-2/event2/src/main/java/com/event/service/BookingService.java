package com.event.service;

import com.event.entity.Bookings;

import java.util.List;

public interface BookingService {
    List<Bookings> getAllBookings();
    Bookings getBookingById(long id);
    Bookings createBooking(Bookings booking);
    Bookings updateBooking(long id, Bookings booking);
    void deleteBooking(long id);
}
