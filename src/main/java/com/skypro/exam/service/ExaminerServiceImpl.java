package com.skypro.exam.service;

import com.skypro.exam.exception.NoSuchQuestionException;
import com.skypro.exam.model.Question;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public List<Question> getQuestions(int amount) {
        List<Question> actualQuestion;
        actualQuestion = questionService.getAll().stream().toList();

        if (questionService.getAll().size() < amount) {
            throw new NoSuchQuestionException();
        }

        List<Question> randomQuestions = new ArrayList<>();
        int count = 0;
        while (count < amount) {
            Question actual = actualQuestion.get(questionService.getRandomQuestions(amount));
            if (!randomQuestions.contains(actual)) {
                randomQuestions.add(actual);
                count++;
            }
        }
        return randomQuestions;
    }
}
