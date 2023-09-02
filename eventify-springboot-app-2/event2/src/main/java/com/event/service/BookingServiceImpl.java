package com.event.service;

import com.event.entity.Bookings;
import com.event.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
    private final BookingRepo bookingsRepository;

    public BookingServiceImpl(BookingRepo bookingsRepository) {
        this.bookingsRepository = bookingsRepository;
    }

    @Override
    public List<Bookings> getAllBookings() {
        return bookingsRepository.findAll();
    }

    @Override
    public Bookings getBookingById(long id) {
        return bookingsRepository.findById(id).orElse(null);
    }

    @Override
    public Bookings createBooking(Bookings booking) {
        return bookingsRepository.save(booking);
    }

    @Override
    public Bookings updateBooking(long id, Bookings booking) {
        if (bookingsRepository.existsById(id)) {
            booking.setBookingId(id);
            return bookingsRepository.save(booking);
        }
        return null;
    }

    @Override
    public void deleteBooking(long id) {
        bookingsRepository.deleteById(id);
    }
}
