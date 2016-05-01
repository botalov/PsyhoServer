package com.psyho.repository;

import com.psyho.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by botal on 01.05.2016.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
