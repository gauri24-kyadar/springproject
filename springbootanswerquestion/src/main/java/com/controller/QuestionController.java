package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Question;
import com.service.QuestionService;

@RestController
@RequestMapping("/ques")
public class QuestionController
{

	 @Autowired
		private QuestionService questionService;
		
			
		 @PostMapping("/save")
		   public ResponseEntity<Question> addQuestion (@RequestBody  Question q)
		   {
			   Question question = questionService.addQuestion(q);
			   return ResponseEntity.status(HttpStatus.CREATED).header("add", "add question").body(question);
			   
		   }
}
