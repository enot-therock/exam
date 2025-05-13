package com.skypro.exam.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QuestionExceptionController {

    @ExceptionHandler(NoSuchQuestionException.class)
    public ResponseEntity<String> questionException(NoSuchQuestionException e) {
        return ResponseEntity.badRequest().body("Уменьши количество вопросов");
    }
}
