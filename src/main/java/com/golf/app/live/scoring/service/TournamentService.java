package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.Tournament;

import java.util.Optional;

public interface TournamentService {

    Iterable<Tournament> getAllTournaments();

    Optional<Tournament> getTournamentById(Long id);

    Tournament saveTournament(Tournament tournament);

    void deleteTournament(Long id);

    Optional<Tournament> getTournamentByName(String name);
}