package com.onlinetestmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetestmanagementsystem.exception.TestAlreadyExistException;
import com.onlinetestmanagementsystem.exception.TestNotFoundException;
import com.onlinetestmanagementsystem.model.Test;
import com.onlinetestmanagementsystem.repositories.TestRepo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepo testRepo;

	@Override
	public Test addTest(Test test) throws TestAlreadyExistException {

		if (testRepo.existsById(test.getTestId())) {
			log.warn("Test Already Exist");
			throw new TestAlreadyExistException();
		}
		return testRepo.save(test);
	}

	@Override
	public Test updateTest(Test test) throws TestNotFoundException {
		Test updatedTest;
		if (testRepo.existsById(test.getTestId())) {
			updatedTest = testRepo.save(test);
			return updatedTest;
		} else {
			log.error("Test Not Found");
			throw new TestNotFoundException();
		}
	}

	@Override
	public String deleteTest(Long testId) throws TestNotFoundException {
		if (testRepo.existsById(testId)) {
			testRepo.deleteById(testId);
			log.info("Test Deleted Successfully");
			return "Test Deleted Successfully";
		} else {
			log.error("Test Not Found");
			throw new TestNotFoundException();
		}
	}

	@Override
	public Integer getResult(Test test) throws TestNotFoundException {
		if (testRepo.existsById(test.getTestId())) {
			return test.getTestMarksScored();
		} else {
			log.error("Test Not Found");
			throw new TestNotFoundException();
		}
	}
}
