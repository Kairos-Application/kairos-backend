package com.example.kairos.repository;

import com.example.kairos.model.Bid;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends CrudRepository<Bid, Integer> {

//    @EntityGraph(attributePaths = {"clientProfile.clientid"})
//    Bid findBidByBidId(Integer bidId);

}
