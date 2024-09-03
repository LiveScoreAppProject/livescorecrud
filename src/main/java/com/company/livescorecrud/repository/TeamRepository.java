package com.company.livescorecrud.repository;

import com.company.livescorecrud.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
