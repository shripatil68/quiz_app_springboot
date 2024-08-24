package com.example.quizapp.repository;

import com.example.quizapp.model.Question;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@DataJpaTest
@SpringBootTest
public class QuesstionDBTest {

    @Autowired
    private QuestionDB questionDB;
    private Question question;

    @BeforeEach
    void setUp() {
        System.out.println("setting up");
        question  = Question.builder()
                .id(1)
                .questionTitle("6+7")
                .rightAnswer("13")
                .build();
//        question = new Question(1, "5+6", "3", "4", "11", "13", "11", "easy", "Java");
//        questionDB.save(question);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down");
//        question= null;
//        questionDB.deleteAll();
    }

    @Test
    void testFindByCategory_success() {
        List<Question> questionList = questionDB.findByCategory("Java");
        assertThat(questionList.get(0).getId()).isEqualTo(question.getId());
    }
}
