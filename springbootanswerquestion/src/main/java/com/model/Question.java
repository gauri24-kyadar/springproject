package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int questionId;
	private String questionName;
   
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Answer answers;

	public Question() {
		super();
	}

	public Question(int questionId, String questionName, Answer answers) {
		super();
		this.questionId = questionId;
		this.questionName = questionName;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public Answer getAnswers() {
		return answers;
	}

	public void setAnswers(Answer answers) {
		this.answers = answers;
	}

	
	
	
	
	
	
}
