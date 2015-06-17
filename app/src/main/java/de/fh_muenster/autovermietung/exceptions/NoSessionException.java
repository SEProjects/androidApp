package de.fh_muenster.autovermietung.exceptions;

public class NoSessionException extends Exception {

    public NoSessionException(String message) {
        super(message);
    }

    public NoSessionException(String message, Throwable throwable) {
        super(message, throwable);
    }

}