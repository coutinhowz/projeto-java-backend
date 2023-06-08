package com.example.fullstack.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("Este usuario nâo existe ou foi deletado. " +id);
    }
}
