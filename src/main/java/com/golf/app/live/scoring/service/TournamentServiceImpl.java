package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.Tournament;
import com.golf.app.live.scoring.exception.TournamentNotFoundException;
import com.golf.app.live.scoring.repo.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TournamentServiceImpl implements TournamentService {

    private final TournamentRepository tournamentRepository;

    @Autowired
    public TournamentServiceImpl(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @Override
    public Iterable<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    @Override
    public Optional<Tournament> getTournamentById(Long id) {
        return tournamentRepository.findById(id);
    }

    @Override
    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Override
    public void deleteTournament(Long id) {
        if (!tournamentRepository.existsById(id)) {
            throw new TournamentNotFoundException("Tournament with ID " + id + " not found");
        }
        tournamentRepository.deleteById(id);
    }

    @Override
    public Optional<Tournament> getTournamentByName(String name) {
        return tournamentRepository.findByName(name);
    }
}