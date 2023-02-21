package com.onlinetestmanagementsystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinetestmanagementsystem.model.User;

public interface UserRepo extends CrudRepository<User, Long> {

}
