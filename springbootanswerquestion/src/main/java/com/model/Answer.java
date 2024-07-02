package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer 
{
	 @Id
	 private int answerNo;
	 private String answerName;
	
	 @OneToOne(mappedBy="answers")
	 @JsonIgnore
	private Question que;

	public Answer() {
		super();
	}

	public Answer(int answerNo, String answerName, Question que) {
		super();
		this.answerNo = answerNo;
		this.answerName = answerName;
		this.que = que;
	}

	public int getAnswerNo() {
		return answerNo;
	}

	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}

	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	public Question getQue() {
		return que;
	}

	public void setQue(Question que) {
		this.que = que;
	}

	
	 
}
