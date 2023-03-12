package com.example.kairos.repository;

import com.example.kairos.model.TrainerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainerRepository extends JpaRepository<TrainerProfile, Long> {

//    Optional<TrainerProfile> findTrainerByEmail(String email);
}
