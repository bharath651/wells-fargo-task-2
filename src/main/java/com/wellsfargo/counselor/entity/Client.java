package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    // ✅ Default constructor
    protected Client() {}

    // ✅ Constructor
    public Client(String name, Advisor advisor) {
        this.name = name;
        this.advisor = advisor;
    }

    // ✅ Getters & Setters
    public long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
