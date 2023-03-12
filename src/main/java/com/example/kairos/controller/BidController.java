package com.example.kairos.controller;

import com.example.kairos.model.Bid;
import com.example.kairos.pojo.BidInsert;
import com.example.kairos.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class BidController {

    @Autowired
    private BidService bidService;

    @CrossOrigin
    @PutMapping(path = "/bid/insert")
    public void insertBid(@RequestBody BidInsert bidInsert) {
        bidService.insertBid(bidInsert);
    }
}
