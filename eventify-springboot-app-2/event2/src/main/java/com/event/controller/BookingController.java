package com.event.controller;

import com.event.entity.Bookings;
import com.event.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/bookings")
public class BookingController {

	@Autowired
    private final BookingService bookingsService;

    
    public BookingController(BookingService bookingsService) {
        this.bookingsService = bookingsService;
    }

    @GetMapping("/getall")
    public List<Bookings> getAllBookings() {
    	
    	System.out.println(bookingsService.getAllBookings());
        return bookingsService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Bookings getBookingById(@PathVariable long id) {
        return bookingsService.getBookingById(id);
    }

    @PostMapping
    public Bookings createBooking(@RequestBody Bookings booking) {
        return bookingsService.createBooking(booking);
    }

    @PutMapping("/{id}")
    public Bookings updateBooking(@PathVariable long id, @RequestBody Bookings booking) {
        return bookingsService.updateBooking(id, booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable long id) {
        bookingsService.deleteBooking(id);
    }
}
