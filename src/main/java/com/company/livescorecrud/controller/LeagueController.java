package com.company.livescorecrud.controller;

import com.company.livescorecrud.entity.League;
import com.company.livescorecrud.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leagues")
public class LeagueController {

    private final LeagueService leagueService;

    @Autowired
    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @PostMapping
    public ResponseEntity<League> registerTeam(@RequestBody League league) {
        League registeredLeague= leagueService.registerLeague(league);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredLeague);
    }
}
