package com.company.livescorecrud.repository;

import com.company.livescorecrud.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, String> {

}
