package com.example.kairos_backend.service;

import com.example.kairos_backend.repository.TrainerRepository;
import com.example.kairos_backend.entity.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    private final TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public List<Trainer> getTrainer(){
        return trainerRepository.findAll();
    }
}
