package com.psyho.controller;

import com.psyho.entity.Question;
import com.psyho.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by botal on 01.05.2016.
 */
@RestController
public class QuestionController {

    @Autowired
    private QuestionService service;

    @RequestMapping(value = "/questions", method = RequestMethod.GET)
    @ResponseBody
    public List<Question> getAllQuestion() {
        return service.getAll();
    }

    @RequestMapping(value = "/questions/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Question getQuestion(@PathVariable("id") long questionID) {
        return service.getByID(questionID);
    }

    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    @ResponseBody
    public Question saveQuestion(@RequestBody Question question) {
        return service.save(question);

    }

    @RequestMapping(value = "/questions/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }


}
