package com.golf.app.live.scoring.repo;

import com.golf.app.live.scoring.entity.ScoreCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreCardRepository extends JpaRepository<ScoreCard, Long> {
}