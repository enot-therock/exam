package com.skypro.exam.controller;

import com.skypro.exam.model.Question;
import com.skypro.exam.service.JavaQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping("/add")
    public String addQuestion(@RequestParam(name = "question") String question, @RequestParam(name = "answer") String answer) {
        javaQuestionService.add(question, answer);
        return "Вопрос по Java добавлен";
    }

    @GetMapping("/all")
    public Set<Question> getQuestions() {
        return javaQuestionService.getAll();
    }

    @GetMapping("/remove")
    public String removeQuestion(@RequestParam (name = "question") String question, @RequestParam (name = "answer") String answer) {
        javaQuestionService.remove(question, answer);
        return "Вопрос " + question + " удален";
    }
}
