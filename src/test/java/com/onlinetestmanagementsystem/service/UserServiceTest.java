//package com.onlinetestmanagementsystem.service;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.onlinetestmanagementsystem.model.Question;
//import com.onlinetestmanagementsystem.model.User;
//import com.onlinetestmanagementsystem.repositories.QuestionRepo;
//import com.onlinetestmanagementsystem.repositories.UserRepo;
//
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//public class UserServiceTest {
//
//	@InjectMocks
//	UserServiceImpl userService;
//
//	@Autowired
//	UserRepo userRepo;
//
//	@Test
//	public void addUserTest() {
//
//		User user = new User();
//		user.setUserId(101L);
//		user.setUserName("Robin");
//		user.setUserPassword("Rb@123");
//		user.setAdmin(false);
//		userRepo.save(user);
//	}
//	
//	@Test
//	public void deleteUserTest() {
//		User user = new User();
//		userRepo.delete(user);
//	}
//
//	
//	@Autowired
//	QuestionRepo questionRepo;
//
//	@Test
//	public void addQuestionTest() {
//
//		Set<String> al = new HashSet<>();
//		al.add("a1");
//		al.add("a2");
//		al.add("a3");
//		al.add("a4");
//
//		Question question = new Question();
//		question.setQuestionId(11L);
//		question.setQuestionTitle("Q1");
//		question.setChosenAnswer(1);
//		question.setMarksScored(null);
//		question.setQuestionMarks(null);
//		question.setQuestionOptions(al);
//		question.setQuestionAnswer(1);
//		questionRepo.save(question);
//	}
//
//}
