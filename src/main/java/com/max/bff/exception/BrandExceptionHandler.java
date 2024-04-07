package com.max.bff.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BrandExceptionHandler {


    @ExceptionHandler(value = {AlreadyExistException.class})
    public ResponseEntity<Object> handleBrandAlreadyExistException(AlreadyExistException alreadyExistException) {
        BrandException brandException = new BrandException(alreadyExistException.getMessage(),
                alreadyExistException.getCause(),
                HttpStatus.CONFLICT);

        return new ResponseEntity<>(brandException, HttpStatus.CONFLICT);
    }
}
