package com.skypro.exam.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@EqualsAndHashCode
public class Question {

    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

//    Question string = new Question("String", "Class string ...");
//    Question memory = new Question("Memory", "Memory is ...");
//    Question spring = new Question("Spring", "Spring is ...");
//    Question integer = new Question("Integer", "Class Integer ...");
}
