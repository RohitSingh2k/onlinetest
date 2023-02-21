package com.onlinetestmanagementsystem.exceptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.exception.TestAlreadyExistException;
import com.onlinetestmanagementsystem.exception.TestNotFoundException;
import com.onlinetestmanagementsystem.exception.UserAlreadyExistException;
import com.onlinetestmanagementsystem.exception.UserNotFoundException;

@RestControllerAdvice
public class RestfulExceptionHandler {
	@ExceptionHandler(TestNotFoundException.class)
	public String handleTestNotFoundException() {
		return "Test not found";
	}

	@ExceptionHandler(TestAlreadyExistException.class)
	public String handleTestAlreadyExistException() {
		return "Test Already Exist";
	}

	@ExceptionHandler(UserAlreadyExistException.class)
	public String handleUserAlreadyExistException() {
		return "User Already Exist";
	}

	@ExceptionHandler(UserNotFoundException.class)
	public String handleUsersFoundException() {
		return "User not found";
	}

	@ExceptionHandler(QuestionNotFoundException.class)
	public String handleQuestionNotFoundException() {
		return "Question not found";
	}

	@ExceptionHandler(QuestionAlreadyExistException.class)
	public String handleQuestionAlreadyExistException() {
		return "Question Already Exist";
	}

}
