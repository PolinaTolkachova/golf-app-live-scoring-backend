package com.golf.app.live.scoring.repo;

import com.golf.app.live.scoring.entity.Tournament;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TournamentRepository extends CrudRepository<Tournament, Long> {

    Iterable<Tournament> findAll(Sort sort);

    Optional<Tournament> findByName(String name);

}
