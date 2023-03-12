package com.example.kairos.model;

import com.example.kairos.key.BidSessionTimingKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "Bid_Session_Timing")
@IdClass(BidSessionTimingKey.class)
@SequenceGenerator(name="bidSessionTimingSeq", initialValue=1, allocationSize=1)
public class BidSessionTiming {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bid_id", nullable = false)
    private Bid bid;

    @Column(name = "bid_id", insertable = false, updatable = false)
    private Integer bidId;

    @Id
    @Column(name = "start_date")
    private Date startDate;

    @Id
    @Column(name = "start_time")
    private String startTime;

    @Column(name = "session_time_length", nullable = false)
    private Integer sessionTimeLength;

    public BidSessionTiming() {
    }

    public BidSessionTiming(Bid bid, Date startDate, String startTime, Integer sessionTimeLength) {
        this.bid = bid;
        this.startDate = startDate;
        this.startTime = startTime;
        this.sessionTimeLength = sessionTimeLength;
    }

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getSessionTimeLength() {
        return sessionTimeLength;
    }

    public void setSessionTimeLength(Integer sessionTimeLength) {
        this.sessionTimeLength = sessionTimeLength;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }
}
