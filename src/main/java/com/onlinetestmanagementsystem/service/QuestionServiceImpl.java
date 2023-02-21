package com.onlinetestmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.model.Question;
import com.onlinetestmanagementsystem.repositories.QuestionRepo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepo questionRepo;

	@Override
	public Question addQuestion(Question question) throws QuestionAlreadyExistException {
		if (question.getQuestionId() != null && questionRepo.existsById(question.getQuestionId())) {
			log.warn("Question Already Exist");
			throw new QuestionAlreadyExistException();
		}
		return questionRepo.save(question);
	}

	@Override
	public Question updateQuestion(Long questionId, Question question) throws QuestionNotFoundException {
		if (questionId == null || !questionRepo.existsById(questionId)) {
			log.error("Question Not Found");
			throw new QuestionNotFoundException();
		} else {
			return questionRepo.save(question);
		}
	}

	@Override
	public String deleteQuestion(Long questionId) throws QuestionNotFoundException {

		if (questionRepo.existsById(questionId)) {
			questionRepo.deleteById(questionId);
			log.info("Question Deleted Successfully");
			return "Question Deleted Successfully";
		} else {
			log.error("Question Not Found");
			throw new QuestionNotFoundException();
		}

	}

	@Override
	public List<Question> showQuestionList() throws QuestionNotFoundException {

		List<Question> questions = (List<Question>) questionRepo.findAll();
		if (!questions.isEmpty()) {
			return questions;
		} else {
			log.error("Question Not Found");
			throw new QuestionNotFoundException();
		}
	}

}
