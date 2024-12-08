package com.golf.app.live.scoring.api;

import com.golf.app.live.scoring.entity.Leaderboard;
import com.golf.app.live.scoring.exception.LeaderboardNotFoundException;
import com.golf.app.live.scoring.service.LeaderboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/leaderboard")
public class LeaderboardController {

    private final LeaderboardService leaderboardService;

    public LeaderboardController(LeaderboardService leaderboardService) {
        this.leaderboardService = leaderboardService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Leaderboard> getLeaderboardById(@PathVariable("id") Long id) {
        Optional<Leaderboard> leaderboard = leaderboardService.getLeaderboardById(id);
        return leaderboard.map(ResponseEntity::ok)
                .orElseThrow(() -> new LeaderboardNotFoundException("Leaderboard with ID " + id + " not found"));
    }

    @GetMapping
    public ResponseEntity<Iterable<Leaderboard>> getAllLeaderboards() {
        Iterable<Leaderboard> leaderboards = leaderboardService.getAllLeaderboards();
        return ResponseEntity.ok(leaderboards);
    }
}
