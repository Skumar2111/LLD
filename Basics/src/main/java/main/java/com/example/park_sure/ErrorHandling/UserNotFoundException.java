package main.java.com.example.park_sure.ErrorHandling;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String error) {
        super(error);
    }

}
