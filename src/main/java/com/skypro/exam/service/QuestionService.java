package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import java.util.Collection;
import java.util.Random;


public interface QuestionService {

    Question add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    default int getRandomQuestions() {
        Random random = new Random();
        int min = 0;
        int max = 5;
        return random.nextInt(max - min + 1) + min;
    };

    Collection<Question> getAll();
}
