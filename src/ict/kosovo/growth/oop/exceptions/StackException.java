package ict.kosovo.growth.oop.exceptions;

public class StackException extends Exception {
    public StackException() {
        super();
    }

    public StackException(String message) {
        super(message);
    }

    //perdoret kur don me throw nje gabim te stack ehde me ja bashkangjit
    //exception prej ka ndodhe
    public StackException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
