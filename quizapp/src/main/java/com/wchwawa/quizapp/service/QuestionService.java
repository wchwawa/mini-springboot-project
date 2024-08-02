package com.wchwawa.quizapp.service;

import com.wchwawa.quizapp.Question;
import com.wchwawa.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions(){
        return questionDao.findAll();
    }

    public Question getQuestionById(int id){
        return questionDao.findById(id).get();
    }

    public List<Question> getQuestionByCategory(String category){
        return questionDao.findByCategory(category);
    }
}

