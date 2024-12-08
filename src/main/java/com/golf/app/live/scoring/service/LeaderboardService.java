package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.Leaderboard;

import java.util.Optional;

public interface LeaderboardService {

    Iterable<Leaderboard> getAllLeaderboards();
    Optional<Leaderboard> getLeaderboardById(Long id);
    Leaderboard saveLeaderboard(Leaderboard leaderboard);
    void deleteLeaderboard(Long id);
}