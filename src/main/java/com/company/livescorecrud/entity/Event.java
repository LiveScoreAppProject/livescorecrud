package com.company.livescorecrud.entity;

import jakarta.persistence.*;

@Entity
public class Event {

    public enum EventType{
        YELLOW_CARD, RED_CARD, GOAL, OWN_GOAL, FAUL, PLAYER_CHANGE, PENALTY;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    private int minute;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private String description;

}
