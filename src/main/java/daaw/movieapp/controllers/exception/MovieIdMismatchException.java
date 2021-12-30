package daaw.movieapp.controllers.exception;

public class MovieIdMismatchException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MovieIdMismatchException() {
        super();
    }

    public MovieIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MovieIdMismatchException(final String message) {
        super(message);
    }

    public MovieIdMismatchException(final Throwable cause) {
        super(cause);
    }
}