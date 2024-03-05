import java.io.FileNotFoundException;
import java.io.IOException;

public class WrongLoginException extends IOException {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLoginException(Throwable cause) {
        super(cause);
    }
}
