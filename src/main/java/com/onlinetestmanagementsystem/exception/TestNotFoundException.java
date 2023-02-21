package com.onlinetestmanagementsystem.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TestNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 198956L;
	private String message;

}
