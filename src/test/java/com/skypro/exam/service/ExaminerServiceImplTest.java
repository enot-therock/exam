package com.skypro.exam.service;

import com.skypro.exam.exception.NoSuchQuestionException;
import com.skypro.exam.model.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void whenQuestionMore_ThenReturnException() {
        assertThrows(NoSuchQuestionException.class, () -> examinerService.getQuestions(10));
    }

    @Test
    void whenQuestionFewer_ThenReturnQuestion() {
        Question question = new Question("question", "answer");

        Collection<Question> questionList = new ArrayList<>();
        questionList.add(question);

        when(questionService.getAll()).thenReturn(questionList.stream().collect(Collectors.toSet()));

        Collection<Question> result;
        result = new ArrayList<>(examinerService.getQuestions(1));

        assertEquals(questionList, result);
    }
}
