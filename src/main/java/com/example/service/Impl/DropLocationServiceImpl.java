package com.example.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.DropLocation;
import com.example.repository.DropLocationRepository;
import com.example.service.DropLocationService;
@Service
public class DropLocationServiceImpl implements DropLocationService {

    @Autowired
    private DropLocationRepository dropLocationRepository;

    @Override
    public List<DropLocation> getAllDropLocations() {
        return dropLocationRepository.findAll();
    }

    @Override
    public DropLocation getDropLocationById(int id) {
        Optional<DropLocation> optionalDropLocation = dropLocationRepository.findById(id);
        return optionalDropLocation.orElse(null);
    }

    @Override
    public DropLocation saveDropLocation(DropLocation dropLocation) {
        return dropLocationRepository.save(dropLocation);
    }

    @Override
    public void deleteDropLocation(int id) {
        dropLocationRepository.deleteById(id);
    }
	
	

}
