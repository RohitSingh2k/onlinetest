package com.onlinetestmanagementsystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.onlinetestmanagementsystem.model.Test;

public interface TestRepo extends CrudRepository<Test, Long> {

}
