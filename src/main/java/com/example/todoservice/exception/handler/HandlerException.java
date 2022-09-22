package com.example.todoservice.exception.handler;

import com.example.todoservice.exception.HelpersException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(value = HelpersException.class)
    public ResponseEntity<?> handleHelpersException(HelpersException helpersException) {
        helpersException.printStackTrace();
        return ResponseEntity.status(500).body(new HelpersException(helpersException.getMessage()));
    }

}
