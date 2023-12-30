package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.DropLocation;
import com.example.service.DropLocationService;

import java.util.List;

@RestController
@RequestMapping("/droplocations")
public class DropLocationController {

    @Autowired
    private DropLocationService dropLocationService;

    @GetMapping
    public List<DropLocation> getAllDropLocations() {
        return dropLocationService.getAllDropLocations();
    }

    @GetMapping("/{id}")
    public DropLocation getDropLocationById(@PathVariable int id) {
        return dropLocationService.getDropLocationById(id);
    }

    @PostMapping("/adddroplocation")
    public DropLocation saveDropLocation(@RequestBody DropLocation dropLocation) {
        return dropLocationService.saveDropLocation(dropLocation);
    }

    @DeleteMapping("/{id}")
    public void deleteDropLocation(@PathVariable int id) {
        dropLocationService.deleteDropLocation(id);
    }
}
