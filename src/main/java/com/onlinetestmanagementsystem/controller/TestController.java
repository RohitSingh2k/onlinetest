package com.onlinetestmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetestmanagementsystem.exception.TestAlreadyExistException;
import com.onlinetestmanagementsystem.exception.TestNotFoundException;
import com.onlinetestmanagementsystem.model.Test;
import com.onlinetestmanagementsystem.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;

	@PostMapping("/addTest")
	public Test addTest(@RequestBody Test test) throws TestAlreadyExistException {

		return testService.addTest(test);
	}

	@PutMapping("/updateTest")
	public Test updateTest(@RequestBody Test test) throws TestNotFoundException {

		return testService.updateTest(test);
	}

	@DeleteMapping("/deleteTest/{id}")
	public String deleteTest(@PathVariable("id") Long testId) throws TestNotFoundException {

		return testService.deleteTest(testId);
	}

	@PostMapping("/testResult")
	public Integer getResult(@RequestBody Test test) throws TestNotFoundException {
		return testService.getResult(test);
	}

}
