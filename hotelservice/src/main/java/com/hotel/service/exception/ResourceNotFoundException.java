package com.hotel.service.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String ex) {
        super(ex);
    }

    public ResourceNotFoundException() {
        super("Resource not found !!");
    }
}
