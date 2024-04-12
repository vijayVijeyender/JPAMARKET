package com.max.bff.exception;

import org.springframework.http.HttpStatus;

public class TechnicalException extends RuntimeException{
    private final String message;

    private final HttpStatus httpStatus;

    public TechnicalException(String message, HttpStatus httpStatus){
        this.message=message;
        this.httpStatus=httpStatus;
    }
    public TechnicalException (final Throwable throwable){
        this(throwable.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
    public TechnicalException(HttpStatus httpStatus){
        this(null,httpStatus);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
