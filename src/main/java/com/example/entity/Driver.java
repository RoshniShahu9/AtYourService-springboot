package com.example.entity;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Driver {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int did;

	    @Column(length=25)
	    private String dname;
	    
	    @Column(length=10)
	    private String dlicense;
	    
	    @Column(length=10)
		private String dcontact;
	    
	    @Column(length=25)
	    private String vehicleName;

	    @Column(length=15)
	    private String vehicleNumber;
	    
	    
	    @OneToMany(cascade = CascadeType.ALL)
	    @JsonIgnore
	    private List<Booking> booking;

	    // Other attributes and relationships
	}


