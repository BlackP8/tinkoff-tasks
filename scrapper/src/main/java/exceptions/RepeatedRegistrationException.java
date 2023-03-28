package exceptions;

public class RepeatedRegistrationException extends Exception {
    public RepeatedRegistrationException(String message) {
        super(message);
    }
}
