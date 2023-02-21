package com.onlinetestmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserAlreadyExistException extends RuntimeException {

	private static final long serialVersionUID = 19865542L;
	private String message;
}
