package com.company.livescorecrud.service;

import com.company.livescorecrud.entity.Stadium;
import com.company.livescorecrud.repository.StadiumRepository;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {

    private final StadiumRepository stadiumRepository;

    public StadiumService(StadiumRepository stadiumRepository){

        this.stadiumRepository = stadiumRepository;
    }

    public Stadium registerStadium(Stadium stadium){
        Stadium registeredStadium = stadiumRepository.save(stadium);
        return registeredStadium;
    }
}
