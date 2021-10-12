package com.survey.demo.controllers;


import com.survey.demo.models.Question;
import com.survey.demo.models.Survey;
import com.survey.demo.repo.QuestionRepository;
import com.survey.demo.repo.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/surveys")
    public String surveysMain(Model model) {
        Iterable<Survey> surveys = surveyRepository.findAll();
        model.addAttribute("surveys", surveys);
        return "surveys_main";
    }
}
