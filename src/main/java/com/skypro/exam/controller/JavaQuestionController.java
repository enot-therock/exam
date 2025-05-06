package com.skypro.exam.controller;

import com.skypro.exam.model.Question;
import com.skypro.exam.service.JavaQuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/add")
    public String addQuestion(@PathVariable("question") String question,@PathVariable("answer") String answer) {
        javaQuestionService.add(question, answer);
        return "Вопрос по Java добавлен";
    }

    @GetMapping("/java")
    public Collection<Question> getQuestions() {
        return javaQuestionService.getAll();
    }

    @GetMapping("/remove")
    public String removeQuestion(Question question) {
        javaQuestionService.remove(question);
        return "Вопрос " + question + " удален";
    }
}
