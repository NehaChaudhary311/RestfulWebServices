package com.firstapi.rest.webservices.restfulwebservices.user;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// This will return 500 Internal Server Error
//public class UserNotFoundException extends RuntimeException {
//    public UserNotFoundException(String s) {
//    }
//
//    public UserNotFoundException(String message, Throwable cause) {
//        super(message, cause);
//    }
//}

// 500 is not meaningful
// Better to return 404
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String s) {
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
