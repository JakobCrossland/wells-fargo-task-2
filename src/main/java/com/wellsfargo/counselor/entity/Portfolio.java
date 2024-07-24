package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private Long portid;

    @Id
    private Long clientid;

    @Column(nullable=false)
    private String date;

    protected Portfolio() {}

    public Portfolio(Long portid, Long clientid, String date) {
        this.portid = portid;
        this.clientid = clientid;
        this.date = date;
    }

    public Long getPortid() {
        return portid;
    }

    public Long getClientid() {
        return clientid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
