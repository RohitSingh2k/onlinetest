package com.onlinetestmanagementsystem.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_details")
public class Test {

	@Id
	@GeneratedValue
	private Long testId;

	@NotEmpty(message = "Test title must not be empty")
	private String testTitle;

	private Integer testTotalMarks;

	private Integer testMarksScored;

	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Temporal(TemporalType.TIME)
	private Date endTime;

	@OneToMany(mappedBy = "test") // inverse side
	private Set<Question> questions;

	@OneToMany(mappedBy = "test")
	private Set<UserTestDetails> details;

}
