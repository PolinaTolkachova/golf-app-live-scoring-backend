package com.golf.app.live.scoring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerID;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @ElementCollection
    private List<Long> tournamentIDs;

    private String gender;

    private Integer handicap;

    @OneToMany(mappedBy = "playerID")
    private List<Scorecard> scorecards;
}