package com.onlinetestmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetestmanagementsystem.exception.UserAlreadyExistException;
import com.onlinetestmanagementsystem.exception.UserNotFoundException;
import com.onlinetestmanagementsystem.model.User;
import com.onlinetestmanagementsystem.repositories.UserRepo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public User addUser(User user) throws UserAlreadyExistException {
		if (userRepo.existsById(user.getUserId())) {
			log.warn("User Already Exist");
			throw new UserAlreadyExistException();
		}
		return userRepo.save(user);
	}

	@Override
	public String deleteUser(Long userId) throws UserNotFoundException {

		if (userRepo.existsById(userId)) {
			userRepo.deleteById(userId);
			log.info("User Deleted Successfully");
			return "User Deleted Successfully";
		} else {
			log.error("User Not Found");
			throw new UserNotFoundException();
		}
	}

}