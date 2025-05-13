package com.skypro.exam.exception;

public class NoSuchQuestionException extends RuntimeException {
    public NoSuchQuestionException() {
        super("Уменьши количество вопросов");
    }
}
