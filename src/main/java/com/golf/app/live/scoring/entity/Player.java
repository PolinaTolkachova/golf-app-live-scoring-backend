package com.golf.app.live.scoring.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

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

    @OneToMany(mappedBy = "player")
    private List<Scorecard> scorecards;
}
