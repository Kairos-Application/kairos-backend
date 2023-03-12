package com.example.kairos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Bid")
@SequenceGenerator(name="bidSeq", initialValue=1, allocationSize=1)
public class Bid {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bidSeq")
    @Column(name = "bid_id")
    private Integer bidId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private ClientProfile clientProfile;

    @Column(name = "client_id", insertable = false, updatable = false)
    private Integer clientId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainer_id", nullable = false)
    private TrainerProfile trainerProfile;

    @Column(name = "trainer_id", insertable = false, updatable = false)
    private Integer trainerId;

    @Column(name = "bid_price")
    private Double bidPrice;

    @Column(name = "max_other_clients_to_share_with_this_bid")
    private Integer maxOtherClientsToShareWithThisBid;

    @Column(name = "max_sessions_per_week_by_client_this_bid")
    private Integer maxSessionPerWeekByClientThisBid;

    public Bid() {}

    public Bid(ClientProfile clientProfile, TrainerProfile trainerProfile, Double bidPrice,
               Integer maxOtherClientsToShareWithThisBid, Integer maxSessionPerWeekByClientThisBid) {
        this.clientProfile = clientProfile;
        this.trainerProfile = trainerProfile;
        this.bidPrice = bidPrice;
        this.maxOtherClientsToShareWithThisBid = maxOtherClientsToShareWithThisBid;
        this.maxSessionPerWeekByClientThisBid = maxSessionPerWeekByClientThisBid;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public ClientProfile getClientProfile() {
        return clientProfile;
    }

    public void setClientProfile(ClientProfile clientProfile) {
        this.clientProfile = clientProfile;
    }

    public TrainerProfile getTrainerProfile() {
        return trainerProfile;
    }

    public void setTrainerProfile(TrainerProfile trainerProfile) {
        this.trainerProfile = trainerProfile;
    }

    public Double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Integer getMaxOtherClientsToShareWithThisBid() {
        return maxOtherClientsToShareWithThisBid;
    }

    public void setMaxOtherClientsToShareWithThisBid(Integer maxOtherClientsToShareWithThisBid) {
        this.maxOtherClientsToShareWithThisBid = maxOtherClientsToShareWithThisBid;
    }

    public Integer getMaxSessionPerWeekByClientThisBid() {
        return maxSessionPerWeekByClientThisBid;
    }

    public void setMaxSessionPerWeekByClientThisBid(Integer maxSessionPerWeekByClientThisBid) {
        this.maxSessionPerWeekByClientThisBid = maxSessionPerWeekByClientThisBid;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "bidId=" + bidId +
                ", clientId=" + clientId +
                ", trainerId=" + trainerId +
                ", bidPrice=" + bidPrice +
                ", maxOtherClientsToShareWithThisBid=" + maxOtherClientsToShareWithThisBid +
                ", maxSessionPerWeekByClientThisBid=" + maxSessionPerWeekByClientThisBid +
                '}';
    }
}
