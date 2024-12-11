package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.Leaderboard;
import com.golf.app.live.scoring.exception.LeaderboardNotFoundException;
import com.golf.app.live.scoring.repo.LeaderboardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LeaderboardServiceImpl implements LeaderboardService {

    private final LeaderboardRepository leaderboardRepository;

    public LeaderboardServiceImpl(LeaderboardRepository leaderboardRepository) {
        this.leaderboardRepository = leaderboardRepository;
    }

    @Override
    public Iterable<Leaderboard> getAllLeaderboards() {
        return leaderboardRepository.findAll();
    }

    @Override
    public Optional<Leaderboard> getLeaderboardById(Long id) {
        return leaderboardRepository.findById(id);
    }

    @Override
    public Leaderboard saveLeaderboard(Leaderboard leaderboard) {
        return leaderboardRepository.save(leaderboard);
    }

    @Override
    public void deleteLeaderboard(Long id) {
        if (!leaderboardRepository.existsById(id)) {
            throw new LeaderboardNotFoundException("Leaderboard with id " + id + " does not exist");
        }
        leaderboardRepository.deleteById(id);
    }
}
