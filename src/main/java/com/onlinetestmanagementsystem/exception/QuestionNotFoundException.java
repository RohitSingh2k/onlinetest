package com.onlinetestmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuestionNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1874658L;
	
	private String message;

}