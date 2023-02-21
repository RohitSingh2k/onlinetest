package com.onlinetestmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuestionAlreadyExistException extends RuntimeException {

	private static final long serialVersionUID = 1098L;
	private String message;
}