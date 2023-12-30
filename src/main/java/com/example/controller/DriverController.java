package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Driver;
import com.example.service.DriverService;



@RestController
@RequestMapping("/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping
    public List<Driver> getAllDriver() {
        return driverService.getAllDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable int id) {
        return driverService.getDriverById(id);
    }

    @PostMapping("/adddriver")
    public Driver saveDriver(@RequestBody Driver driver) {
        return driverService.saveDriver(driver);
    }

    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable int id) {
        driverService.deleteDriver(id);
    }
}
