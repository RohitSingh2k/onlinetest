package com.onlinetestmanagementsystem.service;

import com.onlinetestmanagementsystem.exception.UserAlreadyExistException;
import com.onlinetestmanagementsystem.exception.UserNotFoundException;
import com.onlinetestmanagementsystem.model.User;

public interface UserService {

	public User addUser(User user) throws UserAlreadyExistException;

	public String deleteUser(Long userId) throws UserNotFoundException;
}