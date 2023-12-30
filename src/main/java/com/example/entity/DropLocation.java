package com.example.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class DropLocation {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    int dropid;
	 
	 @Column(length=20)
	    private String droplocationname;

	   

}
