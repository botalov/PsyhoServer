package com.psyho.service;

import com.psyho.entity.Question;
import com.psyho.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by botal on 01.05.2016.
 */

@Service
public class QuestionServiceImpl  implements QuestionService {
    @Autowired
    private QuestionRepository repository;

    public List<Question> getAll() {
        return repository.findAll();
    }

    public Question getByID(long id) {
        return repository.findOne(id);
    }

    public Question save(Question remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }

}
