package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.DropLocation;

public interface DropLocationRepository extends JpaRepository<DropLocation, Integer> {
    // You can add custom query methods if needed
} 