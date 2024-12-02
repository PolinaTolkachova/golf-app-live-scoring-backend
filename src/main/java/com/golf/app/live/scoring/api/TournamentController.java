package com.golf.app.live.scoring.api;

import com.golf.app.live.scoring.exception.TournamentNotFoundException;
import com.golf.app.live.scoring.entity.Tournament;
import com.golf.app.live.scoring.service.TournamentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    private final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    @GetMapping("/{id}")
    public Tournament getTournamentById(@PathVariable("id") Long id) {
        Tournament tournament = tournamentService.getTournamentById(id)
            .orElseThrow(() -> new TournamentNotFoundException("Tournament by ID not found"));
        return tournament;
    }
}