package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PickupLocation;
import com.example.service.PickupLocationService;

@RestController
@RequestMapping("/pickup-locations")
public class PickupLocationController {
	
	@Autowired
    private PickupLocationService pickupLocationService;

    @GetMapping
    public List<PickupLocation> getAllPickupLocations() {
        return pickupLocationService.getAllPickupLocations();
    }

    @GetMapping("/{id}")
    public PickupLocation getPickupLocationById(@PathVariable int id) {
        return pickupLocationService.getPickupLocationById(id);
    }

    @PostMapping("/addlocation")
    public PickupLocation savePickupLocation(@RequestBody PickupLocation pickupLocation) {
        return pickupLocationService.savePickupLocation(pickupLocation);
    }

    @DeleteMapping("/{id}")
    public void deletePickupLocation(@PathVariable int id) {
        pickupLocationService.deletePickupLocation(id);
    }

}
