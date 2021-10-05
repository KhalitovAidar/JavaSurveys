package com.survey.demo.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, description;

    @DateTimeFormat
    private String beginDate, endDate;

    @ForeignKey()
    private  question;

}
