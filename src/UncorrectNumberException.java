public class UncorrectNumberException extends Exception {
    public UncorrectNumberException() {
        super();
    }

    public UncorrectNumberException(String message) {
        super(message);
    }

    public UncorrectNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncorrectNumberException(Throwable cause) {
        super(cause);
    }
}
