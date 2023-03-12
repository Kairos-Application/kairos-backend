package com.example.kairos.repository;

import com.example.kairos.key.BidSessionTimingKey;
import com.example.kairos.model.BidSessionTiming;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidSessionTimingRepository extends CrudRepository<BidSessionTiming, BidSessionTimingKey> {
}
