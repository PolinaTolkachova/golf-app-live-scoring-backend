package com.golf.app.live.scoring.exception;

public class TournamentNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public TournamentNotFoundException(String message) {
        super(message);
    }

    public TournamentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TournamentNotFoundException(Throwable cause) {
        super(cause);
    }
}