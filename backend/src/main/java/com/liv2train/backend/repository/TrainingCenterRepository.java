package com.liv2train.backend.repository;

import com.liv2train.backend.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    // No need to define any methods; JpaRepository provides basic CRUD operations
}
