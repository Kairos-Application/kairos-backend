package com.example.kairos_backend.entity;
import jakarta.persistence.*;

@Entity
@Table
public class Trainer {
    @Id
    @SequenceGenerator(
            name = "trainer_sequence",
            sequenceName = "trainer_sequence",
            initialValue = 0,
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "trainer_sequence"
    )
    private Long id;
    private String name;
    private String email_address;
    private String phone;
    private int age;
    private String city;
    private String state;
    private int max_travel_distance;
    private String client_id;

    public Trainer(Long id, String name, String email_address, String phone, int age, String city, String state, int max_travel_distance, String client_id) {
        this.id = id;
        this.name = name;
        this.email_address = email_address;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.state = state;
        this.max_travel_distance = max_travel_distance;
        this.client_id = client_id;
    }

    public Trainer(String name, String email_address, String phone, int age, String city, String state, int max_travel_distance, String client_id) {
        this.name = name;
        this.email_address = email_address;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.state = state;
        this.max_travel_distance = max_travel_distance;
        this.client_id = client_id;
    }

    public Trainer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public int getMax_travel_distance() {
        return max_travel_distance;
    }

    public void setMax_travel_distance(int max_travel_distance) {
        this.max_travel_distance = max_travel_distance;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email_address='" + email_address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", max_travel_distance=" + max_travel_distance +
                ", client_id=" + client_id +
                '}';
    }
}
