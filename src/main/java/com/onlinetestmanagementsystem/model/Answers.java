package com.onlinetestmanagementsystem.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Answers {

	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;

}
