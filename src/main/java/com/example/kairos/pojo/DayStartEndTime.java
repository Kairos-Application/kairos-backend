package com.example.kairos.pojo;

import java.sql.Date;

public class DayStartEndTime {

    private String day;

    private Date startTime;

    private Date endTime;

    public DayStartEndTime(String day, Date startTime, Date endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
