package com.onlinetestmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.model.Question;
import com.onlinetestmanagementsystem.repositories.QuestionRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

	private final QuestionRepo questionRepo;

	@Override
	public Question addQuestion(Question question) throws QuestionAlreadyExistException {
		log.debug("Adding question to database : {}", question);

		if (question.getQuestionId() != null && questionRepo.existsById(question.getQuestionId())) {
			throw new QuestionAlreadyExistException("Question Already Exist");
		}

		return questionRepo.save(question);
	}

	@Override
	public void updateQuestion(Long questionId, Question question) throws QuestionNotFoundException {
		log.debug("Finding question by questionId: {}", questionId);

		Optional<Question> fetchedQuestion = questionRepo.findById(questionId);

		if (fetchedQuestion.isPresent()) {
			log.debug("Question found in database");
			question.setQuestionId(questionId);
			
			questionRepo.save(question);
		} else {
			throw new QuestionNotFoundException("Question not found in database.");
		}
	}

	@Override
	public void deleteQuestion(Long questionId) throws QuestionNotFoundException {
		log.debug("Deleting question of questionId: {}", questionId);

		Optional<Question> question = questionRepo.findById(questionId);

		if (question.isPresent()) {
			log.debug("Question found in database");
			questionRepo.deleteById(questionId);
		} else {
			throw new QuestionNotFoundException("Question not found in database.");
		}

	}

	@Override
	public List<Question> fetchAllQuestions() throws QuestionNotFoundException {
		log.debug("Fetching all the questions");

		List<Question> questions = (List<Question>) questionRepo.findAll();

		if (!questions.isEmpty()) {
			return questions;
		} else {
			throw new QuestionNotFoundException("Question table is empty");
		}
	}

	@Override
	public Question getQuestion(Long questionId) throws QuestionNotFoundException {
		log.debug("Getting question by questionId: {}", questionId);

		Optional<Question> question = questionRepo.findById(questionId);

		if (question.isPresent()) {
			return question.get();
		} else {
			throw new QuestionNotFoundException("Question not found");
		}
	}

}
