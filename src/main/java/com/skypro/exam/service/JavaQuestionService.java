package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JavaQuestionService implements QuestionService{

    private Set<Question> questions;

    public JavaQuestionService(Set<Question> questions) {
        this.questions = questions;
        this.createJava();
    }

    public void createJava() {
        Question string = new Question("Class String".toLowerCase(), ("Класс Java, который представляет собой строковый набор символов. " +
                "Это неизменяемый тип данных и все объекты класса String хранятся в пуле строк.").toLowerCase());
        Question memory = new Question("Memory in Java".toLowerCase(), ("Два основных типа памяти в Java - Стек и Куча. В стеке хранятся " +
                "переменные и информация, необходимая для выполнения - ссылки на объекты. В куче создаются сами объекты, так же куча " +
                "запрашивает конкретное количество памяти для объекта.").toLowerCase());
        Question spring = new Question("Spring in Java".toLowerCase(), "Spring это фреймворк для Java, на котором пишут веб-приложения. ".toLowerCase());
        Question integer = new Question("Class Integer".toLowerCase(), ("Это класс обертка, которая содержит в себе единственное поле int. " +
                "Это примитивный тип данных, не предполагающий использование null, в то время, как Integer способен его хранить").toLowerCase());

        questions.add(spring);
        questions.add(string);
        questions.add(memory);
        questions.add(integer);
    }


    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question.toLowerCase(), answer.toLowerCase());
        questions.add(newQuestion);
        return newQuestion;
    }

    @Override
    public Question remove(String question, String answer) {
        Question removeQuestion = new Question(question.toLowerCase(), answer.toLowerCase());
        if (questions.contains(removeQuestion)) {
            questions.remove(removeQuestion);
        } else {
            System.out.println("Такого вопроса нет");
        }
        return removeQuestion;
    }

    @Override
    public int getRandomQuestions(int amount) {
        Random random = new Random();
        int min = 0;
        int max = amount;
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    public Set<Question> getAll() {
        return questions;
    }
}
