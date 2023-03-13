package com.example.kairos.repository;

import com.example.kairos.model.Bid;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BidRepository extends CrudRepository<Bid, Integer> {

    List<Bid> findAllByBidIdIn(Set<Integer> bidIds);

//    @EntityGraph(attributePaths = {"clientProfile.clientid"})
//    Bid findBidByBidId(Integer bidId);

}
