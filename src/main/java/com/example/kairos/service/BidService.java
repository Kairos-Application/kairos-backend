package com.example.kairos.service;

import com.example.kairos.model.Bid;
import com.example.kairos.model.BidSessionTiming;
import com.example.kairos.model.ClientProfile;
import com.example.kairos.model.TrainerProfile;
import com.example.kairos.pojo.BidInsert;
import com.example.kairos.pojo.Timings;
import com.example.kairos.repository.BidRepository;
import com.example.kairos.repository.BidSessionTimingRepository;
import com.example.kairos.repository.TrainerRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

    @Autowired
    private BidSessionTimingRepository bidSessionTimingRepository;

    @Autowired
    private TrainerRepository trainerRepository;

    public void insertBid(BidInsert bidInsert) {
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setClientId(bidInsert.getClientId());

        TrainerProfile trainerProfile = new TrainerProfile();
        trainerProfile.setTrainerId(bidInsert.getTrainerId());

        Bid bid = new Bid(clientProfile, trainerProfile, bidInsert.getBidPrice(),
                bidInsert.getMaxOtherClientsToShareWithThisBid(), bidInsert.getMaxSessionPerWeekByClientThisBid());
        Bid newBid = bidRepository.save(bid);
        newBid.setClientId(clientProfile.getClientId());
        newBid.setTrainerId(trainerProfile.getTrainerId());

        List<Timings> timingsList = bidInsert.getTimings();
        List<BidSessionTiming> bidSessionTimings = new ArrayList<>();
        for (Timings timing : timingsList) {
            bidSessionTimings.add(new BidSessionTiming(newBid, timing.getStartDate(),
                    timing.getStartTime(), timing.getSessionTimeLength()));
        }
        bidSessionTimingRepository.saveAll(bidSessionTimings);
    }

}
