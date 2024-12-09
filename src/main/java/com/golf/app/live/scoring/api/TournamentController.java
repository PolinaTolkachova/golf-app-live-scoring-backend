package com.golf.app.live.scoring.api;

import com.golf.app.live.scoring.entity.Tournament;
import com.golf.app.live.scoring.exception.TournamentNotFoundException;
import com.golf.app.live.scoring.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    private final TournamentService tournamentService;

    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tournament> getTournamentById(@PathVariable("id") Long id) {
        Optional<Tournament> tournament = tournamentService.getTournamentById(id);
        return tournament.map(ResponseEntity::ok)
            .orElseThrow(() -> new TournamentNotFoundException("Tournament with ID " + id + " not found"));
    }

    @GetMapping
    public ResponseEntity<Iterable<Tournament>> getAllTournaments() {
        Iterable<Tournament> tournaments = tournamentService.getAllTournaments();
        return ResponseEntity.ok(tournaments);
    }

    @PostMapping
    public ResponseEntity<Tournament> createTournament(@RequestBody Tournament tournament) {
        Tournament createdTournament = tournamentService.saveTournament(tournament);
        return new ResponseEntity<>(createdTournament, HttpStatus.CREATED);
    }
}