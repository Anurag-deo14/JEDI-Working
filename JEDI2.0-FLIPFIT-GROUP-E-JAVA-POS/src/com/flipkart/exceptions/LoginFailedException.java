package com.flipkart.exceptions;

import static com.flipkart.constants.Constants.RED_COLOR;
import static com.flipkart.constants.Constants.RESET_COLOR;

/**
 * Exception thrown when Login fails
 */
public class LoginFailedException extends RuntimeException{
    public LoginFailedException(String message){
        super(message);
        System.out.println(RED_COLOR+"Unable to login, Check your username and password"+RESET_COLOR);
    }
}