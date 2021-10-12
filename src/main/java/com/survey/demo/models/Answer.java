package com.survey.demo.models;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String text;

    @NotNull
    @OneToOne (optional=false)
    @JoinColumn(name="user_id")
    private UserEntity user;

    @NotNull
    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="survey_id")
    private Survey survey;


    public Long getId() {
        return id;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
