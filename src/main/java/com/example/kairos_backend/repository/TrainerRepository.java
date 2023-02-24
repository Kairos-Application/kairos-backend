package com.example.kairos_backend.repository;

import com.example.kairos_backend.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    @Query("SELECT trainer from Trainer trainer WHERE trainer.email = ?1")
    Optional<Trainer> findTrainerByEmail(String email);
}
