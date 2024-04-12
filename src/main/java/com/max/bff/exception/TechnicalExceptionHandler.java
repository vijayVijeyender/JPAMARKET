package com.max.bff.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static java.util.Objects.requireNonNullElse;

@ControllerAdvice
public class TechnicalExceptionHandler {

    @ExceptionHandler(value = TechnicalException.class)
    public ResponseEntity<String> handleException(TechnicalException exception){
        return ResponseEntity.
                status(requireNonNullElse(exception.getHttpStatus(), HttpStatus.INTERNAL_SERVER_ERROR))
                .body(exception.getMessage());
    }
}
