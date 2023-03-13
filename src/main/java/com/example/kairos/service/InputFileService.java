package com.example.kairos.service;

import com.example.kairos.model.Bid;
import com.example.kairos.model.BidSessionTiming;
import com.example.kairos.model.ClientProfile;
import com.example.kairos.model.TrainerProfile;
import com.example.kairos.pojo.InputFileFormat;
import com.example.kairos.repository.BidRepository;
import com.example.kairos.repository.BidSessionTimingRepository;
import com.example.kairos.repository.ClientProfileRepository;
import com.example.kairos.repository.TrainerProfileRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class InputFileService {

    @Autowired
    private AWSService awsService;

    @Autowired
    private BidSessionTimingRepository bidSessionTimingRepository;

    @Autowired
    private BidRepository bidRepository;

    @Autowired
    private TrainerProfileRepository trainerProfileRepository;

    @Autowired
    private ClientProfileRepository clientProfileRepository;

    public void createAndUploadFile() throws Exception {
        String fileName = "inputFile.json";
        File file = new File(fileName);

        InputFileFormat inputFileFormat = new InputFileFormat(null, 1, null, null, null, null, null, null, null, null);

        Writer writer = new FileWriter(fileName);
        Gson gson = new GsonBuilder().create();
        gson.toJson(inputFileFormat, writer);
        writer.flush();
        writer.close();

        awsService.upload(file);

        file.delete();

//        Date date = new Date();
//        Calendar c = Calendar.getInstance();
//        c.setTime(date);
//        c.add(Calendar.DATE, 1);
//        Date tomorrowDate = c.getTime();
//        System.out.println(tomorrowDate);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String weekStartDateStr = format.format(tomorrowDate);
//        Date weekStartDate = format.parse(weekStartDateStr);
//
//        c.add(Calendar.DATE, 6);
//        Date endDate = c.getTime();
//        String weekEndDateStr = format.format(endDate);
//        Date weekEndDate = format.parse(weekEndDateStr);
//
//        List<BidSessionTiming> bidSessionTimingList = bidSessionTimingRepository
//                .findAllByStartDateGreaterThanEqualAndStartDateLessThanEqual(
//                        new java.sql.Date(weekStartDate.getTime()), new java.sql.Date(weekEndDate.getTime()));
//
//        Set<Integer> bidIds = bidSessionTimingList
//                                    .stream()
//                                    .map(BidSessionTiming::getBidId)
//                                    .collect(Collectors.toSet());
//
//        List<Bid> bids = bidRepository.findAllByBidIdIn(bidIds);
//        Set<Integer> trainerIds = bids.stream().map(Bid::getTrainerId).collect(Collectors.toSet());
//        Set<Integer> clientIds = bids.stream().map(Bid::getClientId).collect(Collectors.toSet());
//
//        List<TrainerProfile> trainerProfiles = trainerProfileRepository.findAllByTrainerIdIn(trainerIds);
//        List<ClientProfile> clientProfiles = clientProfileRepository.findAllByClientIdIn(clientIds);
    }

}
