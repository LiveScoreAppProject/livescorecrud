package com.company.livescorecrud.controller;

import com.company.livescorecrud.entity.Match;
import com.company.livescorecrud.entity.Team;
import com.company.livescorecrud.service.MatchService;
import com.company.livescorecrud.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<Team> registerTeam(@RequestBody Team team) {
        Team registeredTeam= teamService.registerMatch(team);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredTeam);
    }
}
