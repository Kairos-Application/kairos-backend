package com.example.kairos.model;
import com.example.kairos.util.Gender;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "trainer_profile")
@SequenceGenerator(name="trainerProfileSeq", initialValue=1, allocationSize=1)
public class TrainerProfile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trainerProfileSeq")
    @Column(name = "trainer_id")
    private Integer trainerId;

    @Column(name = "name")
    private String name;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "age")
    private Integer age;

    @Column(name = "max_travel_distance")
    private Integer maxTravelDistance;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "minimum_bid")
    private Integer minimumBid;

    @Column(name = "bio")
    private String bio;

    @Column(name = "max_clients_per_session")
    private Integer maxClientsPerSession;

    @Column(name = "clients_home_session")
    private Boolean clientsHomeSession;

    @Column(name = "zoom_session")
    private Boolean zoomSession;

    public TrainerProfile() {}

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMaxTravelDistance() {
        return maxTravelDistance;
    }

    public void setMaxTravelDistance(Integer maxTravelDistance) {
        this.maxTravelDistance = maxTravelDistance;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getMinimumBid() {
        return minimumBid;
    }

    public void setMinimumBid(Integer minimumBid) {
        this.minimumBid = minimumBid;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getMaxClientsPerSession() {
        return maxClientsPerSession;
    }

    public void setMaxClientsPerSession(Integer maxClientsPerSession) {
        this.maxClientsPerSession = maxClientsPerSession;
    }

    public Boolean getClientsHomeSession() {
        return clientsHomeSession;
    }

    public void setClientsHomeSession(Boolean clientsHomeSession) {
        this.clientsHomeSession = clientsHomeSession;
    }

    public Boolean getZoomSession() {
        return zoomSession;
    }

    public void setZoomSession(Boolean zoomSession) {
        this.zoomSession = zoomSession;
    }
}
