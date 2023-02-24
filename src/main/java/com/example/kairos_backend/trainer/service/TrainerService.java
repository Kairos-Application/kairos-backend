package com.example.kairos_backend.trainer.service;

import com.example.kairos_backend.trainer.repository.TrainerRepository;
import com.example.kairos_backend.trainer.entity.Trainer;
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
