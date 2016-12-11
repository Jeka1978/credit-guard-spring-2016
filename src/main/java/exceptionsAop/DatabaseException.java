package exceptionsAop;

/**
 * Created by Evegeny on 11/12/2016.
 */
public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
        super(message);
    }
}
