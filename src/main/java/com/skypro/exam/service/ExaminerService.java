package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import java.util.Collection;


public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
