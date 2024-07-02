package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
