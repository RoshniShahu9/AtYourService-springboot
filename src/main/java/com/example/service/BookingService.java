package com.example.service;

import java.util.List;

import com.example.entity.Booking;

public interface BookingService {
	
	public List<Booking> getAllBookings();
	
    public Booking getBookingById(int id);
    
    public Booking saveBooking(Booking booking);
    
    void deleteBooking(int id);
	
	


}
