package com.golf.app.live.scoring.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tournamentID;

    private String name;
    private String startDate;
    private String finishDate;

    @ElementCollection
    private List<Long> players;

    private String format;
    private String group;
    private String scoringType;

    @OneToOne(mappedBy = "tournament")
    private Leaderboard leaderboard;
}
