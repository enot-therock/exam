package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService{

    private Set<Question> questions;

    public JavaQuestionService(Set<Question> questions) {
        this.questions = questions;
        this.createJava();
    }

    public void createJava() {
        Question string = new Question("String", "Class string ...");
        Question memory = new Question("Memory", "Memory is ...");
        Question spring = new Question("Spring", "Spring is ...");
        Question integer = new Question("Integer", "Class Integer ...");

        questions.add(spring);
        questions.add(string);
        questions.add(memory);
        questions.add(integer);
    }


    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
        } else {
            System.out.println("Такого вопроса нет");
        }
        return question;
    }

    @Override
    public int getRandomQuestions() {
        Random random = new Random();
        int min = 0;
        int max = 5;
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }
}
