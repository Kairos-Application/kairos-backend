package com.example.kairos.pojo;

import java.sql.Date;
import java.util.List;

public class InputFileFormat {

    private Date weekStartDate;

    private Integer trainerId;

    private Integer trainerHomeLocation;

    private List<Integer> trainerGymLocations;

    private List<DayStartEndTime> timesNotAvailable;

    private Integer maxClientsAtOnce;

    private Boolean trainAtClientHome;

    private Boolean trainOnline;

    private List<ClientInfo> clientList;

    private DistanceMatrix distanceMatrix;

    public InputFileFormat() {}

    public InputFileFormat(Date weekStartDate, Integer trainerId, Integer trainerHomeLocation,
                           List<Integer> trainerGymLocations, List<DayStartEndTime> timesNotAvailable,
                           Integer maxClientsAtOnce, Boolean trainAtClientHome, Boolean trainOnline,
                           List<ClientInfo> clientList, DistanceMatrix distanceMatrix) {
        this.weekStartDate = weekStartDate;
        this.trainerId = trainerId;
        this.trainerHomeLocation = trainerHomeLocation;
        this.trainerGymLocations = trainerGymLocations;
        this.timesNotAvailable = timesNotAvailable;
        this.maxClientsAtOnce = maxClientsAtOnce;
        this.trainAtClientHome = trainAtClientHome;
        this.trainOnline = trainOnline;
        this.clientList = clientList;
        this.distanceMatrix = distanceMatrix;
    }

    public Date getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Date weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public Integer getTrainerHomeLocation() {
        return trainerHomeLocation;
    }

    public void setTrainerHomeLocation(Integer trainerHomeLocation) {
        this.trainerHomeLocation = trainerHomeLocation;
    }

    public List<Integer> getTrainerGymLocations() {
        return trainerGymLocations;
    }

    public void setTrainerGymLocations(List<Integer> trainerGymLocations) {
        this.trainerGymLocations = trainerGymLocations;
    }

    public List<DayStartEndTime> getTimesNotAvailable() {
        return timesNotAvailable;
    }

    public void setTimesNotAvailable(List<DayStartEndTime> timesNotAvailable) {
        this.timesNotAvailable = timesNotAvailable;
    }

    public Integer getMaxClientsAtOnce() {
        return maxClientsAtOnce;
    }

    public void setMaxClientsAtOnce(Integer maxClientsAtOnce) {
        this.maxClientsAtOnce = maxClientsAtOnce;
    }

    public Boolean getTrainAtClientHome() {
        return trainAtClientHome;
    }

    public void setTrainAtClientHome(Boolean trainAtClientHome) {
        this.trainAtClientHome = trainAtClientHome;
    }

    public Boolean getTrainOnline() {
        return trainOnline;
    }

    public void setTrainOnline(Boolean trainOnline) {
        this.trainOnline = trainOnline;
    }

    public List<ClientInfo> getClientList() {
        return clientList;
    }

    public void setClientList(List<ClientInfo> clientList) {
        this.clientList = clientList;
    }

    public DistanceMatrix getDistanceMatrix() {
        return distanceMatrix;
    }

    public void setDistanceMatrix(DistanceMatrix distanceMatrix) {
        this.distanceMatrix = distanceMatrix;
    }
}
