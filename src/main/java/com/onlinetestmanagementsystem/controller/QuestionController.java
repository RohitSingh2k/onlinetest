package com.onlinetestmanagementsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
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

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api")
@Log4j2
@RequiredArgsConstructor
public class QuestionController {

	private final QuestionService questionService;

	@PostMapping("/question")
	public ResponseEntity<Question> addQuestion(@RequestBody @Valid Question question) throws QuestionAlreadyExistException {
		log.info("Creating new question");
		Question addedQuestion = questionService.addQuestion(question);
		return ResponseEntity.ok().body(addedQuestion);
	}

	@PutMapping("/question/{id}")
	public ResponseEntity<?> updateQuestion(@Valid @PathVariable("id") Long questionId, @RequestBody Question question)
			throws QuestionNotFoundException {
		log.info("Updating question of questionId : {}", questionId);
		questionService.updateQuestion(questionId, question);
		return ResponseEntity.ok().body("Question updated successfully");
	}

	@DeleteMapping("/question/{id}")
	public ResponseEntity<?> deleteQuestion(@PathVariable("id") Long questionId) throws QuestionNotFoundException {
		log.info("Deleting question of questionId : {}", questionId);
		questionService.deleteQuestion(questionId);
		return ResponseEntity.ok().body("Question deleted successfully");
	}

	@GetMapping("/question")
	public ResponseEntity<List<Question>> getQuestions() throws QuestionNotFoundException {
		log.info("Fetching all questions.");
		List<Question> allQuestion = questionService.fetchAllQuestions();
		return ResponseEntity.ok().body(allQuestion);
	}

	@GetMapping("/question/{id}")
	public ResponseEntity<Question> getQuestion(@PathVariable("id") Long questionId) throws QuestionNotFoundException {
		Question question = questionService.getQuestion(questionId);
		return ResponseEntity.ok().body(question);
	}
}
