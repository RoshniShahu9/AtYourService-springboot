package com.example.service;

import java.util.List;

import com.example.entity.DropLocation;

public interface DropLocationService {
	
	public List<DropLocation> getAllDropLocations();
	
    public DropLocation getDropLocationById(int id);
    
    public DropLocation saveDropLocation(DropLocation dropLocation);
    
    public void deleteDropLocation(int id);

}
