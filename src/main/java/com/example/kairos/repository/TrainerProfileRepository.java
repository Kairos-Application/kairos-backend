package com.example.kairos.repository;

import com.example.kairos.model.TrainerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TrainerProfileRepository extends JpaRepository<TrainerProfile, Integer> {

    List<TrainerProfile> findAllByTrainerIdIn(Set<Integer> trainerIds);

}
