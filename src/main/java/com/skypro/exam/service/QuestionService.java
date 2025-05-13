package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Set;

public interface QuestionService {

    Question add(String question, String answer);

    Question remove(String question, String answer);

    default int getRandomQuestions(int amount) {
        Random random = new Random();
        int min = 0;
        int max = amount;
        return random.nextInt(max - min + 1) + min;
    }

    Set<Question> getAll();
}
