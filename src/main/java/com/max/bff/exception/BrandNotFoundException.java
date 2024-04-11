package com.max.bff.exception;

public class BrandNotFoundException extends RuntimeException{

    public BrandNotFoundException(String message) {
        super(message);
    }

    public BrandNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
