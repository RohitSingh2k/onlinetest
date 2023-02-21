package com.onlinetestmanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetestmanagementsystem.exception.UserAlreadyExistException;
import com.onlinetestmanagementsystem.exception.UserNotFoundException;
import com.onlinetestmanagementsystem.model.User;
import com.onlinetestmanagementsystem.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public User addUser(@Valid @RequestBody User user) throws UserAlreadyExistException {

		return userService.addUser(user);
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") Long userId) throws UserNotFoundException {

		return userService.deleteUser(userId);
	}
}
