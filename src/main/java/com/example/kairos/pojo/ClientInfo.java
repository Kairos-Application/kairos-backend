package com.example.kairos.pojo;

import java.util.List;

public class ClientInfo {

    private Integer clientId;

    private Integer clientHomeLocation;

    private List<Integer> clientGymLocations;

    private Integer sessionTimeRequested;

    private Double bidValueDollars;

    private Integer maxSessionPerWeek;

    private Integer maxOtherClientsToShareWith;

    private List<DayStartEndTime> timesAvailableToStart;

    private Boolean canTrainAtHome;

    private Boolean canTrainOnline;

    public ClientInfo(Integer clientId, Integer clientHomeLocation, List<Integer> clientGymLocations,
                      Integer sessionTimeRequested, Double bidValueDollars, Integer maxSessionPerWeek,
                      Integer maxOtherClientsToShareWith, List<DayStartEndTime> timesAvailableToStart,
                      Boolean canTrainAtHome, Boolean canTrainOnline) {
        this.clientId = clientId;
        this.clientHomeLocation = clientHomeLocation;
        this.clientGymLocations = clientGymLocations;
        this.sessionTimeRequested = sessionTimeRequested;
        this.bidValueDollars = bidValueDollars;
        this.maxSessionPerWeek = maxSessionPerWeek;
        this.maxOtherClientsToShareWith = maxOtherClientsToShareWith;
        this.timesAvailableToStart = timesAvailableToStart;
        this.canTrainAtHome = canTrainAtHome;
        this.canTrainOnline = canTrainOnline;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getClientHomeLocation() {
        return clientHomeLocation;
    }

    public void setClientHomeLocation(Integer clientHomeLocation) {
        this.clientHomeLocation = clientHomeLocation;
    }

    public List<Integer> getClientGymLocations() {
        return clientGymLocations;
    }

    public void setClientGymLocations(List<Integer> clientGymLocations) {
        this.clientGymLocations = clientGymLocations;
    }

    public Integer getSessionTimeRequested() {
        return sessionTimeRequested;
    }

    public void setSessionTimeRequested(Integer sessionTimeRequested) {
        this.sessionTimeRequested = sessionTimeRequested;
    }

    public Double getBidValueDollars() {
        return bidValueDollars;
    }

    public void setBidValueDollars(Double bidValueDollars) {
        this.bidValueDollars = bidValueDollars;
    }

    public Integer getMaxSessionPerWeek() {
        return maxSessionPerWeek;
    }

    public void setMaxSessionPerWeek(Integer maxSessionPerWeek) {
        this.maxSessionPerWeek = maxSessionPerWeek;
    }

    public Integer getMaxOtherClientsToShareWith() {
        return maxOtherClientsToShareWith;
    }

    public void setMaxOtherClientsToShareWith(Integer maxOtherClientsToShareWith) {
        this.maxOtherClientsToShareWith = maxOtherClientsToShareWith;
    }

    public List<DayStartEndTime> getTimesAvailableToStart() {
        return timesAvailableToStart;
    }

    public void setTimesAvailableToStart(List<DayStartEndTime> timesAvailableToStart) {
        this.timesAvailableToStart = timesAvailableToStart;
    }

    public Boolean getCanTrainAtHome() {
        return canTrainAtHome;
    }

    public void setCanTrainAtHome(Boolean canTrainAtHome) {
        this.canTrainAtHome = canTrainAtHome;
    }

    public Boolean getCanTrainOnline() {
        return canTrainOnline;
    }

    public void setCanTrainOnline(Boolean canTrainOnline) {
        this.canTrainOnline = canTrainOnline;
    }
}
