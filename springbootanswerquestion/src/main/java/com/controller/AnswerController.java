package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Answer;
import com.service.AnswerService;

@RestController
@RequestMapping("/ans")
public class AnswerController
{

	 @Autowired
		private AnswerService answerService;
		
			
		 @PostMapping("/save")
		   public ResponseEntity<Answer> addCourse (@RequestBody  Answer a)
		   {
			   Answer answer = answerService.addAnswer(a);
			   return ResponseEntity.status(HttpStatus.CREATED).header("add", "add answer").body(answer);
			   
		   }
	
}
