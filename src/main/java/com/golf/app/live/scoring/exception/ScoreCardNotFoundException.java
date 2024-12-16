package com.golf.app.live.scoring.exception;

public class ScoreCardNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ScoreCardNotFoundException(String message) {super(message);}

    public ScoreCardNotFoundException(String message, Throwable cause) {super(message, cause);}

    public ScoreCardNotFoundException(Throwable cause) {super(cause);}
}