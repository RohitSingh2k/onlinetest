package com.onlinetestmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "question_details")
public class Question {

	@Id
	@GeneratedValue
	private Long questionId;

	@NotEmpty
	private String questionTitle;

	@NotEmpty
	private Answers answers;

	@NotEmpty
	private String correctAnswer;

	@NotEmpty
	private Integer questionMarks;

	@ManyToOne // Owning side
	private Test test;

}
