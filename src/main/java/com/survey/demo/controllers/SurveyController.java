package com.survey.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SurveyController {
    @GetMapping("/surveys")
    public String surveysMain(Model model) {

        return "surveys_main";
    }
}
