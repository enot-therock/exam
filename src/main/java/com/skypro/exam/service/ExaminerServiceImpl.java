package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class ExaminerServiceImpl implements ExaminerService {

    private QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    //    public ExaminerServiceImpl(String question, String answer, JavaQuestionService javaQuestionService) {
//        super(question, answer);
//        this.javaQuestionService = javaQuestionService;
//    }

//    public ExaminerServiceImpl(JavaQuestionService javaQuestionService) {
//        this.javaQuestionService = javaQuestionService;
//    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Question string = new Question("String", "Class string ...");
        Question memory = new Question("Memory", "Memory is ...");
        Question spring = new Question("Spring", "Spring is ...");
        Question integer = new Question("Integer", "Class Integer ...");
        Collection<Question> actualQuestion = new ArrayList<>();
        actualQuestion.add(string);
        actualQuestion.add(memory);
        actualQuestion.add(spring);
        actualQuestion.add(integer);

        Collection<Question> randomQuestions = new ArrayList<>();
        for (int i = 0; i <= amount; questionService.getRandomQuestions()) {
            randomQuestions.add(actualQuestion.stream().skip(i).findFirst().orElse(null));
        }
        return randomQuestions;
    }

//    @Override
//    public Collection<Question> getQuestions(int amount) {
//        Collection<Question> actualQuestion;
//        actualQuestion = javaQuestionService.getAll();
//
//        Collection<Question> randomQuestions = new ArrayList<>();
//        for (int i = 0; i <= amount; javaQuestionService.getRandomQuestions()) {
//            randomQuestions.add(actualQuestion.stream().skip(i).findFirst().orElse(null));
//        }
//        return randomQuestions;
//    }
}
