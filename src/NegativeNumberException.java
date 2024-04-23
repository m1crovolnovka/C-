public class NegativeNumberException extends Exception {

    public NegativeNumberException() {
        super();
    }
    public NegativeNumberException(String message) {
        super(message);
    }
    public NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumberException(Throwable cause) {
        super(cause);
    }
}
