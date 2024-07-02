package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AnswerRepository;
import com.model.Answer;

@Service
public class AnswerServiceImpl implements AnswerService {

	
	@Autowired
	private AnswerRepository answerRepo;

	@Override
	public Answer addAnswer(Answer ans) {
		return answerRepo.save(ans);
	}
}
