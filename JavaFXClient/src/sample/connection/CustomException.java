package sample.connection;

import org.springframework.http.HttpStatus;

/**
 * Created by Damir on 24.05.2016.
 */
public class CustomException extends RuntimeException {
    private HttpStatus statusCode;

    public CustomException(HttpStatus status) {
        statusCode = status;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }
}
