package com.onlinetestmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.model.Question;
import com.onlinetestmanagementsystem.service.QuestionService;

@RestController
@RequestMapping("/api")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@PostMapping("/question")
	public Question addQuestion(@RequestBody Question question) throws QuestionAlreadyExistException {

		return questionService.addQuestion(question);
	}

	@PutMapping("/question/{id}")
	public Question updateQuestion(@PathVariable("id") Long questionId, @RequestBody Question question) throws QuestionNotFoundException {

		return questionService.updateQuestion(questionId, question);
	}

	@DeleteMapping("/question/{id}")
	public String deleteQuestion(@PathVariable("id") Long questionId) throws QuestionNotFoundException {

		return questionService.deleteQuestion(questionId);
	}

	@GetMapping("/question")
	public List<Question> getQuestions() throws QuestionNotFoundException {

		return questionService.showQuestionList();
	}
	
	@GetMapping("/question/{id}")
	public Question getQuestion() throws QuestionNotFoundException {
		return null;
	}
}
