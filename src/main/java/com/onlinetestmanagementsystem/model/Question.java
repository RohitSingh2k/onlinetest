package com.onlinetestmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question_details")
public class Question {

	@Id
	@GeneratedValue
	private Long questionId;

	private String questionTitle;

	private Answers answers;

	private String correctAnswer;

	private Integer questionMarks;

	@ManyToOne // Owning side
	private Test test;

}
