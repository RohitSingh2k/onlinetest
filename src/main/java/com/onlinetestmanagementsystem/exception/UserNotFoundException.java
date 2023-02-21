package com.onlinetestmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 145675685737L;
	private String message;

}
