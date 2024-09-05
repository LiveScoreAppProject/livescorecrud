package com.company.livescorecrud.service;

import com.company.livescorecrud.entity.Match;
import com.company.livescorecrud.entity.Team;
import com.company.livescorecrud.repository.TeamRepository;
import com.company.livescorecrud.service.kafka.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository, KafkaService eventProducer) {
        this.teamRepository = teamRepository;
    }

    public Team registerMatch(Team team) {
        Team savedMatch = teamRepository.save(team);
        return savedMatch;
    }
    
}
