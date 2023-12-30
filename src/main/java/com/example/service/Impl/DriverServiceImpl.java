package com.example.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Driver;
import com.example.repository.DriverRepository;
import com.example.service.DriverService;

import java.util.List;


@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }
    
    @Override
    public Driver getDriverById(int id) {
        return driverRepository.findById(id).orElse(null);
    }

    

    @Override
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public void deleteDriver(int id) {
        driverRepository.deleteById(id);
    }
}