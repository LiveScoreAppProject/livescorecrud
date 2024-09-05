package com.company.livescorecrud.controller;

import com.company.livescorecrud.entity.League;
import com.company.livescorecrud.entity.Stadium;
import com.company.livescorecrud.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {

    private final StadiumService stadiumService;

    @Autowired
    public StadiumController(StadiumService stadiumService){

        this.stadiumService = stadiumService;
    }

    @PostMapping
    public ResponseEntity<Stadium> registerTeam(@RequestBody Stadium stadium) {
        Stadium registeredStadium= stadiumService.registerStadium(stadium);
        return ResponseEntity.status(HttpStatus.CREATED).body(registeredStadium);
    }
}
