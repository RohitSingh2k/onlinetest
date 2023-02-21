package com.onlinetestmanagementsystem.service;

import java.util.List;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.model.Question;

public interface QuestionService {

	public Question addQuestion(Question question) throws QuestionAlreadyExistException;

	public String deleteQuestion(Long questionId) throws QuestionNotFoundException;

	public Question updateQuestion(Long questionId, Question question) throws QuestionNotFoundException;

	public List<Question> showQuestionList() throws QuestionNotFoundException;

}
