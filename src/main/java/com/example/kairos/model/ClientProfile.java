package com.example.kairos.model;

import com.example.kairos.util.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "client_profile")
@SequenceGenerator(name="clientProfileSeq", initialValue=1, allocationSize=1)
public class ClientProfile implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="clientProfileSeq")
    @Column(name = "client_id")
    private Integer clientId;

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

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "max_travel_distance")
    private Integer maxTravelDistance;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "home_session")
    private Boolean homeSession;

    @Column(name = "zoom_session")
    private Boolean zoomSession;

    @Column(name = "max_other_clients_to_share_with")
    private Integer maxOtherClientsToShareWith;

    @Column(name = "max_sessions_per_week_by_client")
    private Integer maxSessionsPerWeekByClient;

    public ClientProfile() {}

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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

    public Boolean getHomeSession() {
        return homeSession;
    }

    public void setHomeSession(Boolean homeSession) {
        this.homeSession = homeSession;
    }

    public Boolean getZoomSession() {
        return zoomSession;
    }

    public void setZoomSession(Boolean zoomSession) {
        this.zoomSession = zoomSession;
    }

    public Integer getMaxOtherClientsToShareWith() {
        return maxOtherClientsToShareWith;
    }

    public void setMaxOtherClientsToShareWith(Integer maxOtherClientsToShareWith) {
        this.maxOtherClientsToShareWith = maxOtherClientsToShareWith;
    }

    public Integer getMaxSessionsPerWeekByClient() {
        return maxSessionsPerWeekByClient;
    }

    public void setMaxSessionsPerWeekByClient(Integer maxSessionsPerWeekByClient) {
        this.maxSessionsPerWeekByClient = maxSessionsPerWeekByClient;
    }
}
