package com.company.livescorecrud.entity;

import java.time.LocalDateTime;

public class Event {

    public enum EventType{
        YELLOW_CARD, RED_CARD, GOAL, OWN_GOAL, FAUL, PLAYER_CHANGE, PENALTY;
    }

    private EventType eventType;

    private LocalDateTime eventTime;

    private String description;

}
