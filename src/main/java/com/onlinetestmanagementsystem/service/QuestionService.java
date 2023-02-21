package com.onlinetestmanagementsystem.service;

import java.util.List;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.model.Question;

public interface QuestionService {

	public Question addQuestion(Question question) throws QuestionAlreadyExistException;

	public void deleteQuestion(Long questionId) throws QuestionNotFoundException;

	public void updateQuestion(Long questionId, Question question) throws QuestionNotFoundException;

	public List<Question> fetchAllQuestions() throws QuestionNotFoundException;
	
	public Question getQuestion(Long questionId) throws QuestionNotFoundException;

}
