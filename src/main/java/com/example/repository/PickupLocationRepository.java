package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PickupLocation;

public interface PickupLocationRepository extends JpaRepository<PickupLocation, Integer> {
    // Add custom query methods if needed {

}
