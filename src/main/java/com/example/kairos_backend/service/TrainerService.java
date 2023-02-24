package com.example.kairos_backend.service;

import com.example.kairos_backend.repository.TrainerRepository;
import com.example.kairos_backend.entity.Trainer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TrainerService {

    private final TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public List<Trainer> getTrainers(){
        return trainerRepository.findAll();
    }
    public void saveTrainer(Trainer trainer){
        Optional<Trainer> trainerByEmail = trainerRepository.findTrainerByEmail(trainer.getEmail());
        if (trainerByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        else {
            trainerRepository.save(trainer);
        }
//        System.out.println(trainer);
    }

    public void delTrainer(Long trainerId){
        boolean exists = trainerRepository.existsById(trainerId);
        if (!exists){
            throw new IllegalStateException("trainer doesn't exist");
        }
        trainerRepository.deleteById(trainerId);
    }

    @Transactional
    public void updateTrainer(Long trainerId, String name, String email){
        Trainer trainer = trainerRepository.findById(trainerId).
                orElseThrow(() -> new IllegalStateException("trainer does not exist"));

//        update name
        if (name != null && name.length() > 0 && !Objects.equals(trainer.getName(), name)){
            trainer.setName(name);
        }

//        update email
        if (email != null && email.length() > 0 && !Objects.equals(trainer.getEmail(), email)){
            Optional<Trainer> trainerOptional = trainerRepository.findTrainerByEmail(email);
            if (trainerOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            trainer.setEmail(email);
        }
//        update phone
//        update age
//        update city
//        update state
//        update max_travel_distance
//        update client_id
    }
}
