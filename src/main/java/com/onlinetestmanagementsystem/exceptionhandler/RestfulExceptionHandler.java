package com.onlinetestmanagementsystem.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onlinetestmanagementsystem.exception.QuestionAlreadyExistException;
import com.onlinetestmanagementsystem.exception.QuestionNotFoundException;
import com.onlinetestmanagementsystem.exception.TestAlreadyExistException;
import com.onlinetestmanagementsystem.exception.TestNotFoundException;
import com.onlinetestmanagementsystem.exception.UserAlreadyExistException;
import com.onlinetestmanagementsystem.exception.UserNotFoundException;
import com.onlinetestmanagementsystem.exceptionhandler.model.ApiException;

@RestControllerAdvice
public class RestfulExceptionHandler {
	@ExceptionHandler(TestNotFoundException.class)
	public ResponseEntity<ApiException> handleTestNotFoundException(TestNotFoundException ex) {
		ApiException response = ApiException.builder().message(ex.getMessage()).build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(TestAlreadyExistException.class)
	public ResponseEntity<ApiException> handleTestAlreadyExistException(TestAlreadyExistException ex) {
		ApiException response = ApiException.builder().message(ex.getMessage()).build();
		return ResponseEntity.status(HttpStatus.SEE_OTHER).body(response);
	}

	@ExceptionHandler(UserAlreadyExistException.class)
	public ResponseEntity<ApiException> handleUserAlreadyExistException(UserAlreadyExistException ex) {
		ApiException response = ApiException.builder().message(ex.getMessage()).build();
		return ResponseEntity.status(HttpStatus.SEE_OTHER).body(response);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ApiException> handleUsersFoundException(UserNotFoundException ex) {
		ApiException response = ApiException.builder().message(ex.getMessage()).build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(QuestionNotFoundException.class)
	public ResponseEntity<ApiException> handleQuestionNotFoundException(QuestionNotFoundException ex) {
		ApiException response = ApiException.builder().message(ex.getMessage()).build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

	@ExceptionHandler(QuestionAlreadyExistException.class)
	public ResponseEntity<ApiException> handleQuestionAlreadyExistException(QuestionAlreadyExistException ex) {
		ApiException response = ApiException.builder().message(ex.getMessage()).build();
		return ResponseEntity.status(HttpStatus.SEE_OTHER).body(response);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ApiException> handleValidationException(MethodArgumentNotValidException ex) {
		Map<String,String> errorMap = new HashMap<>();
		
		for (FieldError err : ex.getBindingResult().getFieldErrors()) {
			errorMap.put(err.getField(), err.getDefaultMessage());
		}
		
		ApiException response = ApiException.builder().message(errorMap).build();
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

}
