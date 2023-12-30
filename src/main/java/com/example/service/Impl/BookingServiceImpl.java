package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Booking;
import com.example.entity.Customer;
import com.example.entity.Driver;
import com.example.entity.DropLocation;
import com.example.entity.PickupLocation;
import com.example.repository.BookingRepository;
import com.example.repository.CustomerRepository;
import com.example.repository.DriverRepository;
import com.example.repository.DropLocationRepository;
import com.example.repository.PickupLocationRepository;
import com.example.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	public CustomerRepository customerRepository;

	@Autowired
	public DropLocationRepository dropLocationRepository;
	@Autowired
	public PickupLocationRepository pickupLocationRepository;
	@Autowired
	private DriverRepository driverRepository;

	@Override
	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(int id) {
		return bookingRepository.findById(id).orElse(null);
	}

	@Override
	public Booking saveBooking(Booking booking) {
		Customer c1 = customerRepository.findById(booking.getCustomerBookingId()).get();
		booking.setCustomer(c1);
		Driver d1=driverRepository.findById(booking.getDriverBookingId()).get();
		booking.setDriver(d1);
		DropLocation dl1=dropLocationRepository.findById(booking.getDropLocationBookingId()).get();
		booking.setDropLocation(dl1);
		PickupLocation pl1=pickupLocationRepository.findById(booking.getPickupLocationId()).get();
		booking.setPickupLocation(pl1);
		return bookingRepository.save(booking);
	}

	@Override
	public void deleteBooking(int id) {
		bookingRepository.deleteById(id);
	}

}
