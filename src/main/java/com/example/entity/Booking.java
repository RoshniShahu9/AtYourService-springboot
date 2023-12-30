package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Booking {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int bid;
	 
	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;
	    
	    @ManyToOne
	    @JoinColumn(name = "driver_id")
	    private Driver driver;

	    @ManyToOne
	    @JoinColumn(name = "pickup_id")
	    private PickupLocation pickupLocation;

	    @ManyToOne
	    @JoinColumn(name = "drop_id")
	    private DropLocation dropLocation;
	    
	    @Column
	    private String Price;
	    
	    @Transient
	    private Integer customerBookingId;
	    @Transient
	    private Integer driverBookingId;
	    @Transient
	    private Integer dropLocationBookingId;
	    @Transient
	    private Integer pickupLocationId;
	    
	  //"customerid":1,
	   // "driverid":2,
	   // "pickupLocationid":1,
	   // "dropLocationid":2
	    

	  
	    // other fields

	    // Getters and Setters
//new
	  
	}
	
	 
	



