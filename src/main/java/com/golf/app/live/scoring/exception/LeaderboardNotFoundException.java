package com.golf.app.live.scoring.exception;

public class LeaderboardNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LeaderboardNotFoundException(String message) {
        super(message);
    }

    public LeaderboardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public LeaderboardNotFoundException(Throwable cause) {
        super(cause);
    }
}
