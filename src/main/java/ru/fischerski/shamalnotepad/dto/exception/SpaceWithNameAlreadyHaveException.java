package ru.fischerski.shamalnotepad.dto.exception;

public class SpaceWithNameAlreadyHaveException extends RuntimeException {

    public SpaceWithNameAlreadyHaveException() {
    }

    public SpaceWithNameAlreadyHaveException(String message) {
        super(message);
    }

    public SpaceWithNameAlreadyHaveException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpaceWithNameAlreadyHaveException(Throwable cause) {
        super(cause);
    }

    public SpaceWithNameAlreadyHaveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
