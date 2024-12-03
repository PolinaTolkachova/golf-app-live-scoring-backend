package com.golf.app.live.scoring.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Scorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scorecardID;

    private Long playerID;

    @ManyToOne
    @JoinColumn(name = "tournamentID")
    private Tournament tournament;

    @ElementCollection
    private List<Integer> scores;

    private Integer totalScore;
}
