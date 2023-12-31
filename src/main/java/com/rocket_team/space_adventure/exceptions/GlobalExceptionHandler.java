package com.rocket_team.space_adventure.exceptions;

import com.rocket_team.space_adventure.exceptions.part.IllegalPartTypeException;
import com.rocket_team.space_adventure.exceptions.part.PartAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        Map<String, Object> result = new HashMap<>();

        exception.getBindingResult().getFieldErrors()
                .forEach(error -> result.put(error.getField(), error.getDefaultMessage()));

        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PartAlreadyExistsException.class)
    public ResponseEntity<Object> handlePartAlreadyExists(PartAlreadyExistsException e) {
        return getResponse(e, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(IllegalPartTypeException.class)
    public ResponseEntity<Object> handleIllegalPartType(IllegalPartTypeException e) {
        return getResponse(e, HttpStatus.BAD_REQUEST);
    }

    private ResponseEntity<Object> getResponse(RuntimeException e, HttpStatus httpStatus) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", e.getMessage());
        return new ResponseEntity<>(result, httpStatus);
    }
}
