package de.fh_muenster.autovermietung.exceptions;

public class InvalidLoginException extends Exception {

    public InvalidLoginException(String message) {
        super(message);
    }

    public InvalidLoginException(String message, Throwable throwable) {
        super(message, throwable);
    }

}