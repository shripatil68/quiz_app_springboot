package com.example.quizapp.service;

import com.example.quizapp.model.Question;
import com.example.quizapp.repository.QuestionDB;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;


import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class QuestionServiceTest {

    @Mock
    private QuestionDB questionDB;

    @InjectMocks
    private QuestionService questionService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllQuestions() {
        Question question1 = new Question(1, "5+6", "3", "4", "11", "13", "11", "easy", "Java");
        Question question2 = new Question(2, "5+6", "3", "4", "11", "13", "11", "easy", "Java");
        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);

        List<Question> questionList = questionDB.findAll();
        System.out.println("a");

        when(questionDB.findAll()).thenReturn(questions);
        System.out.println("a");
    }

    @Test
    void getQuestionByCategory() {
    }

    @Test
    void addQuestion() {
        Question question = new Question(1, "5+6", "3", "4", "11", "13", "11", "easy", "Java");
        when(questionDB.save(question)).thenReturn(question);

    }
}