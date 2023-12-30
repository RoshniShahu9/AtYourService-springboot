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

public class Customer {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int cid;

	    @Column(length=50) 
	    private String cname;
	    
	    @Column(length=25)
	    private String cemail;
	    
	    @Column(length=10)
	    private String password;  
	    
	    @Column(length=10)
		private String ccontact;
	    
	    @OneToMany(cascade = CascadeType.ALL)
	    @JsonIgnore
	    private List<Booking> booking;
	    
	    //"cname": "Riya",
	    //"cemail":"riya@13gmail.com",
	     //"password":"123",
	    //"ccontact": "8348857787"


	   
	    // Other attributes and relationships
	}


