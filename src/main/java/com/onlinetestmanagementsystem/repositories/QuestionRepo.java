package com.onlinetestmanagementsystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinetestmanagementsystem.model.Question;

public interface QuestionRepo extends CrudRepository<Question, Long> {

//	@Query(value = "SELECT q FROM Question q")
//	public List<Question> getQuestionList();
}
