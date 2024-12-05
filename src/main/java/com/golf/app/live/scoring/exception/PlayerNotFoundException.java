package com.golf.app.live.scoring.exception;

public class PlayerNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L; // Serialization ID for consistent deserialization

    public PlayerNotFoundException(String message) {
        super(message);
    }

    public PlayerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerNotFoundException(Throwable cause) {
        super(cause);
    }
}