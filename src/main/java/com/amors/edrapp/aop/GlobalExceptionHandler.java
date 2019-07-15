package com.amors.edrapp.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(EntityNotFoundException.class)
    protected ResponseEntity handleEntityNotFoundException(EntityNotFoundException ex) {
        LOGGER.info("EntityNotFoundException resolved");
        return new ResponseEntity<>(new DefaultResponse(ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    private static class DefaultResponse {
        private String message;

        DefaultResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
