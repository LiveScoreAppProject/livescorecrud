package com.company.livescorecrud.service;

import com.company.livescorecrud.entity.Match;
import com.company.livescorecrud.repository.MatchRepository;
import com.company.livescorecrud.service.kafka.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    private final MatchRepository matchRepository;
    private final KafkaService eventProducer;

    @Autowired
    public MatchService(MatchRepository matchRepository, KafkaService eventProducer) {
        this.matchRepository = matchRepository;
        this.eventProducer = eventProducer;
    }

    public Match registerMatch(Match match) {
        Match savedMatch = matchRepository.save(match);
        String event = "Match registered: " + savedMatch.getMatchId();
        eventProducer.sendEvent(savedMatch.getMatchId(), event);
        return savedMatch;
    }


    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public List<Match> getLiveMatches() {
        return null;
    }
}