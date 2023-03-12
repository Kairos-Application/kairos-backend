package com.example.kairos.pojo;

import lombok.Data;
import lombok.Getter;

import java.util.List;

public class BidInsert {

    private Integer bidId;

    private Integer clientId;

    private Integer trainerId;

    private Double bidPrice;

    private Integer maxOtherClientsToShareWithThisBid;

    private Integer maxSessionPerWeekByClientThisBid;

    private List<Timings> timings;


    public Integer getClientId() {
        return this.clientId;
    }

    public Integer getTrainerId() {
        return this.trainerId;
    }

    public Double getBidPrice() {
        return this.bidPrice;
    }

    public Integer getMaxOtherClientsToShareWithThisBid() {
        return this.maxOtherClientsToShareWithThisBid;
    }

    public Integer getMaxSessionPerWeekByClientThisBid() {
        return this.maxSessionPerWeekByClientThisBid;
    }

    public List<Timings> getTimings() {
        return this.timings;
    }

}
