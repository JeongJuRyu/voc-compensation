package com.voccompensation.voccompensation.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoSuchElementException.class)
    protected ResponseEntity<ExceptionResponse> handleNoSuchElementFoundException(NoSuchElementException e) {
        final ExceptionResponse exceptionResponse = ExceptionResponse.builder()
                .httpStatus(HttpStatus.NOT_FOUND)
                .message(e.getMessage()).build();
        log.info(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionResponse);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<ExceptionResponse> handleIllegalArgumentException(IllegalArgumentException e) {
        final ExceptionResponse exceptionResponse = ExceptionResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(e.getMessage()).build();
        log.info(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    protected ResponseEntity<ExceptionResponse> handleServletRequestBindingException(MissingRequestHeaderException e){
        final ExceptionResponse exceptionResponse = ExceptionResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(e.getMessage()).build();
        log.info(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
    }

    @ExceptionHandler(NullPointerException.class)
    protected ResponseEntity<ExceptionResponse> handleNullPointerException(NullPointerException e){
        final ExceptionResponse exceptionResponse = ExceptionResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message(e.getMessage()).build();
        log.info(e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionResponse);
    }
}
