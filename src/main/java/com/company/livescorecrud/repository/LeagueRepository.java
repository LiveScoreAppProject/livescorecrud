package com.company.livescorecrud.repository;

import com.company.livescorecrud.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
