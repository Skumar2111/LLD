package main.java.com.example.park_sure.contoller;

import com.example.park_sure.ErrorHandling.ParkingUserException;
import com.example.park_sure.ErrorHandling.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {


    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ParkingUserException> handleException(UserNotFoundException exception)
    {
        ParkingUserException parkingUserException = new ParkingUserException();
        parkingUserException.setStatus(HttpStatus.NOT_FOUND.value());
        parkingUserException.setMessage(exception.getMessage());
        parkingUserException.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity(parkingUserException,HttpStatus.NOT_FOUND);
    }
}
