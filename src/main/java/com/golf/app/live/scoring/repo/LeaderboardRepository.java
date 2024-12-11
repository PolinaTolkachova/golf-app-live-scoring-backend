package com.golf.app.live.scoring.repo;

import com.golf.app.live.scoring.entity.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardRepository extends JpaRepository<Leaderboard, Long> {
}
