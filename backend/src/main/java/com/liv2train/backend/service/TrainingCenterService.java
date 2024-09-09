package com.liv2train.backend.service;

import com.liv2train.backend.model.TrainingCenter;
import com.liv2train.backend.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    // Method to save a TrainingCenter
    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        // Set the current timestamp for createdOn
        trainingCenter.setCreatedOn(System.currentTimeMillis());
        return trainingCenterRepository.save(trainingCenter); // Save the entity to the database
    }

    // Method to get all TrainingCenters
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll(); // Fetch all training centers from the database
    }
}
