package com.psyho.service;

import com.psyho.entity.Question;

import java.util.List;

/**
 * Created by botal on 01.05.2016.
 */
public interface QuestionService {

    List<Question> getAll();
    Question getByID(long id);
    Question save(Question question);
    void remove(long id);
}
