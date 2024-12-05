package com.golf.app.live.scoring.service;

import com.golf.app.live.scoring.entity.Player;
import java.util.Optional;

/**
 * Service interface for managing players within the application.
 */
public interface PlayerService {

    Iterable<Player> getAllPlayers();
    Optional<Player> getPlayerById(Long id);
    Player savePlayer(Player player);
    void deletePlayer(Long id);
}