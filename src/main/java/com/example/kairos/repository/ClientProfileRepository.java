package com.example.kairos.repository;

import com.example.kairos.model.ClientProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ClientProfileRepository extends CrudRepository<ClientProfile, Integer> {

    List<ClientProfile> findAllByClientIdIn(Set<Integer> clientIds);

}
