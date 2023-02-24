package com.example.kairos_backend.controller;

import com.example.kairos_backend.service.TrainerService;
import com.example.kairos_backend.entity.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/trainer")
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainers(){
        return trainerService.getTrainers();
    }

    @PostMapping
    public void saveTrainer(@RequestBody Trainer trainer){
        trainerService.saveTrainer(trainer);
    }

    @DeleteMapping(path = "{trainerId}")
    public void delTrainer(@PathVariable("trainerId") Long trainerId){
        trainerService.delTrainer(trainerId);
    }

    @PutMapping(path = "{trainerId}")
    public void updateTrainer(
            @PathVariable("trainerId") Long trainerId,
            @RequestParam(required = true) String name,
            @RequestParam(required = true) String email
    ){
        trainerService.updateTrainer(trainerId, name, email);
    }
}
