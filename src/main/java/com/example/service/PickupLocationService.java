package com.example.service;

import java.util.List;

import com.example.entity.PickupLocation;

public interface PickupLocationService {
	
	public List<PickupLocation> getAllPickupLocations();
	
    public PickupLocation getPickupLocationById(int id);
    
    public PickupLocation savePickupLocation(PickupLocation pickupLocation);
    
    public void deletePickupLocation(int id);
	
	
	

}
