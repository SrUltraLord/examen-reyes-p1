package ec.edu.espe.arqui.reyesexamenp1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntitiyNotFoundException extends RuntimeException {
    public EntitiyNotFoundException(String message) {
        super(message);
    }
}
