package com.golf.app.live.scoring.api;

import com.golf.app.live.scoring.entity.ScoreCard;
import com.golf.app.live.scoring.exception.ScoreCardNotFoundException;
import com.golf.app.live.scoring.service.ScoreCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/scorecard")
public class ScoreCardController {

    private final ScoreCardService scoreCardService;

    @Autowired
    public ScoreCardController(ScoreCardService scoreCardService) {
        this.scoreCardService = scoreCardService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScoreCard> getScoreCardById(@PathVariable("id") Long id) {
        Optional<ScoreCard> scoreCard = scoreCardService.getScoreCardById(id);
        return scoreCard.map(ResponseEntity::ok)
            .orElseThrow(() -> new ScoreCardNotFoundException("ScoreCard with ID " + id + " not found"));
    }

    @GetMapping
    public ResponseEntity<Iterable<ScoreCard>> getAllScoreCards() {
        Iterable<ScoreCard> scoreCards = scoreCardService.getAllScoreCards();
        return ResponseEntity.ok(scoreCards);
    }

    @PostMapping
    public ResponseEntity<ScoreCard> createScoreCard(@RequestBody ScoreCard scoreCard) {
        ScoreCard createdScoreCard = scoreCardService.saveScoreCard(scoreCard);
        return new ResponseEntity<>(createdScoreCard, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ScoreCard> updateScoreCard(@PathVariable("id") Long id, @RequestBody ScoreCard scoreCardDetails) {
        ScoreCard updatedScoreCard = scoreCardService.updateScoreCard(id, scoreCardDetails);
        return ResponseEntity.ok(updatedScoreCard);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScoreCard(@PathVariable("id") Long id) {
        scoreCardService.deleteScoreCard(id);
        return ResponseEntity.noContent().build();
    }
}