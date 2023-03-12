package com.example.kairos.key;

import com.example.kairos.model.Bid;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Date;

public class BidSessionTimingKey implements Serializable {
    private Bid bid;

    private Date startDate;

    private String startTime;
}
