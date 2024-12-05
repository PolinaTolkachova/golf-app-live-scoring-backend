package com.golf.app.live.scoring.repo;

import com.golf.app.live.scoring.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

    Optional<Tournament> findByName(String name);
}