package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Booking;

import com.example.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	 @Autowired
	    private BookingService bookingService;

	    @GetMapping
	    public List<Booking> getAllBookings() {
	        return bookingService.getAllBookings();
	    }

	    @GetMapping("/{id}")
	    public Booking getBookingById(@PathVariable int id) {
	        return bookingService.getBookingById(id);
	    }

	    @PostMapping("/addbooking")
	    public Booking saveBooking(@RequestBody Booking booking) {
	       
	        return bookingService.saveBooking(booking);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBooking(@PathVariable int id) {
	        bookingService.deleteBooking(id);
	    }
	
//new

}
