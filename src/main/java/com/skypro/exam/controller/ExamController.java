package com.skypro.exam.controller;

import com.skypro.exam.model.Question;
import com.skypro.exam.service.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
public class ExamController {

    private ExaminerServiceImpl examinerServiceImpl;

    public ExamController(ExaminerServiceImpl examinerServiceImpl) {
        this.examinerServiceImpl = examinerServiceImpl;
    }

    @GetMapping("/get")
    public Collection<Question> getQuestions(@RequestParam(name = "amount") int amount) {
        return examinerServiceImpl.getQuestions(amount);
    }
}
