package com.example.service;

import java.util.List;

import com.example.entity.Driver;

public interface DriverService {
	
    public List<Driver> getAllDrivers();
    
    public Driver getDriverById(int id);
    
    public Driver saveDriver(Driver driver);
    
    public void deleteDriver(int id);
}