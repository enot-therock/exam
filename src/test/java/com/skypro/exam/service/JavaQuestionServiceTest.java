package com.skypro.exam.service;

import com.skypro.exam.model.Question;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {

    @Mock
    private QuestionService questionService;
    @Mock
    private Set<Question> questions;

    @InjectMocks
    private JavaQuestionService javaQuestionService;

    @Test
    void whenAddQuestion_thenReturnQuestion() {
        Question result = javaQuestionService.add("Question", "Answer");

        verify(questions).add(result);
    }

    @Test
    void whenRemoveQuestion_thenReturnQuestionIsBlank() {
        Question result = questionService.add("Question", "Answer");
        Question result1 = questionService.add("Question1", "Answer1");
        questions.add(result);
        questions.add(result1);

        javaQuestionService.remove("Question", "Answer");

        verify(questions).remove(result);
    }

    @Test
    void whenGetAllQuestion_thenReturnCollectionQuestion() {
        Question result = new Question("Question", "Answer");
        Question result1 = new Question("Question1", "Answer1");
        questions.add(result1);
        questions.add(result);

        javaQuestionService.getAll();

        verify(questionService).getAll();
    }
}
