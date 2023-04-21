package com.example.demowithtests.util.exception;

public class NoSuchPassportException extends RuntimeException {
    public NoSuchPassportException(String message) {
        super(message);
    }
}
