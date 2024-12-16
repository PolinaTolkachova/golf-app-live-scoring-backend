package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.ScoreCard;
import com.golf.app.live.scoring.exception.ScoreCardNotFoundException;
import com.golf.app.live.scoring.repo.ScoreCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScoreCardServiceImpl implements ScoreCardService {

    private final ScoreCardRepository scoreCardRepository;

    @Autowired
    public ScoreCardServiceImpl(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    @Override
    public Iterable<ScoreCard> getAllScoreCards() {
        return scoreCardRepository.findAll();
    }

    @Override
    public Optional<ScoreCard> getScoreCardById(Long id) {
        return scoreCardRepository.findById(id);
    }

    @Override
    public ScoreCard saveScoreCard(ScoreCard scoreCard) {
        return scoreCardRepository.save(scoreCard);
    }

    @Override
    public ScoreCard updateScoreCard(Long id, ScoreCard scoreCardDetails) {
        ScoreCard existingScoreCard = scoreCardRepository.findById(id)
            .orElseThrow(() -> new ScoreCardNotFoundException("ScoreCard with ID " + id + " not found"));

        existingScoreCard.setTournament(scoreCardDetails.getTournament());
        existingScoreCard.setPlayers(scoreCardDetails.getPlayers());
        existingScoreCard.setHoleScores(scoreCardDetails.getHoleScores());

        return scoreCardRepository.save(existingScoreCard);
    }

    @Override
    public void deleteScoreCard(Long id) {
        if (!scoreCardRepository.existsById(id)) {
            throw new ScoreCardNotFoundException("ScoreCard with ID " + id + " not found");
        }
        scoreCardRepository.deleteById(id);
    }
}