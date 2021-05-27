package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "certificates" )
public class Certificates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "certificates")
    private String certificates;

    @Column(name = "timestamp")
    private String timestamp;

    @JoinTable(
            name = "certificates",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"))    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }




}
