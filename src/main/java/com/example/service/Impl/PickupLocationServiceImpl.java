package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.PickupLocation;
import com.example.repository.PickupLocationRepository;
import com.example.service.PickupLocationService;

@Service
public class PickupLocationServiceImpl implements PickupLocationService {
    @Autowired
    private PickupLocationRepository pickupLocationRepository;

    @Override
    public List<PickupLocation> getAllPickupLocations() {
        return pickupLocationRepository.findAll();
    }

    @Override
    public PickupLocation getPickupLocationById(int id) {
        return pickupLocationRepository.findById(id).orElse(null);
    }

    @Override
    public PickupLocation savePickupLocation(PickupLocation pickupLocation) {
        return pickupLocationRepository.save(pickupLocation);
    }

    @Override
    public void deletePickupLocation(int id) {
        pickupLocationRepository.deleteById(id);
    }
}


