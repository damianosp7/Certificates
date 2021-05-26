package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "history" )
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "calculation")
    private String calculation;

    @Column(name = "timestamp")
    private String timestamp;

    @JoinTable(
            name = "history",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"))

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getCalculation() {
        return calculation;
    }

    public void setCalculation(String calculation) {
        this.calculation = calculation;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
