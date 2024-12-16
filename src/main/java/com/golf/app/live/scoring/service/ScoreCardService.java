package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.ScoreCard;

import java.util.Optional;

public interface ScoreCardService {

    Iterable<ScoreCard> getAllScoreCards();
    Optional<ScoreCard> getScoreCardById(Long id);
    ScoreCard saveScoreCard(ScoreCard scoreCard);
    ScoreCard updateScoreCard(Long id, ScoreCard scoreCardDetails);
    void deleteScoreCard(Long id);
}