package com.company.livescorecrud.service;

import com.company.livescorecrud.entity.League;
import com.company.livescorecrud.repository.LeagueRepository;
import com.company.livescorecrud.service.kafka.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    @Autowired
    public LeagueService(LeagueRepository teamRepository, KafkaService eventProducer) {
        this.leagueRepository = teamRepository;
    }

    public League registerLeague(League league) {
        League savedLeague = leagueRepository.save(league);
        return savedLeague;
    }
}
