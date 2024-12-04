package com.golf.app.live.scoring.entity;

import jakarta.persistence.*;
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

    /*@ElementCollection
    @CollectionTable(name = "tournament_players", joinColumns = @JoinColumn(name = "tournamentID"))
    @Column(name = "playerID")
    private List<Long> players;*/

    private String format;
    @Column(name = "group_name")
    private String groupName;
    private String scoringType;
    private String location;

    /*@OneToOne(mappedBy = "tournament")
    private SomeOtherEntity someOtherEntity;*/
}