package com.example.kairos.repository;

import com.example.kairos.key.BidSessionTimingKey;
import com.example.kairos.model.BidSessionTiming;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface BidSessionTimingRepository extends CrudRepository<BidSessionTiming, BidSessionTimingKey> {

    List<BidSessionTiming> findAllByStartDateGreaterThanEqualAndStartDateLessThanEqual(Date startDate, Date endDate);

}
