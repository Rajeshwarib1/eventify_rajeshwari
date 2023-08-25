package com.eventify.service;

import com.eventify.entity.BookingEntity;
import com.eventify.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<BookingEntity> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<BookingEntity> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    public BookingEntity createBooking(BookingEntity booking) {
        return bookingRepository.save(booking);
    }

    public BookingEntity updateBooking(Long id, BookingEntity bookingDetails) {
        Optional<BookingEntity> optionalBooking = bookingRepository.findById(id);
        if (optionalBooking.isPresent()) {
            BookingEntity booking = optionalBooking.get();
            // Update attributes here
            return bookingRepository.save(booking);
        }
        return null; // Handle not found case
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
