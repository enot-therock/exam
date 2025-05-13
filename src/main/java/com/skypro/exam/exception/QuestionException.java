package com.skypro.exam.exception;

public class QuestionException {

    private final String code;
    private final String message;

    public QuestionException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
