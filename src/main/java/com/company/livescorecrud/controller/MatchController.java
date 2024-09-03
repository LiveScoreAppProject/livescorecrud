package com.company.livescorecrud.controller;

import com.company.livescorecrud.entity.Match;
import com.company.livescorecrud.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matches")
public class MatchController {
    private final MatchService matchService;

    @Autowired
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @PostMapping
    public ResponseEntity<Match> registerMatch(@RequestBody Match match) {
        Match registeredMatch = matchService.registerMatch(match);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredMatch);
    }

}

