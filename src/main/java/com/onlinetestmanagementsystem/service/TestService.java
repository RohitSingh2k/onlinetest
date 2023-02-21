package com.onlinetestmanagementsystem.service;

import com.onlinetestmanagementsystem.exception.TestAlreadyExistException;
import com.onlinetestmanagementsystem.exception.TestNotFoundException;
import com.onlinetestmanagementsystem.model.Test;

public interface TestService {

	public Test addTest(Test test) throws TestAlreadyExistException;

	public Test updateTest(Test test) throws TestNotFoundException;

	public String deleteTest(Long testId) throws TestNotFoundException;

	public Integer getResult(Test test) throws TestNotFoundException;

}
