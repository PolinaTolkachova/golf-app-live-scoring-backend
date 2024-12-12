package com.golf.app.live.scoring.api;

import com.golf.app.live.scoring.entity.Player;
import com.golf.app.live.scoring.exception.PlayerNotFoundException;
import com.golf.app.live.scoring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable("id") Long id) {
        Optional<Player> player = playerService.getPlayerById(id);
        return player.map(ResponseEntity::ok)
                .orElseThrow(() -> new PlayerNotFoundException("Player with ID " + id + " not found"));
    }

    @GetMapping
    public ResponseEntity<Iterable<Player>> getAllPlayers() {
        Iterable<Player> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        Player createdPlayer = playerService.savePlayer(player);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }
}