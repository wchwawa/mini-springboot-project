package com.wchwawa.quizapp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;
    String questionTitle;
    String difficultylevel;
    String category;
    String option1;
    String option2;
    String option3;
    String option4;
    String rightAnswer;
}
