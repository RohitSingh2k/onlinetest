//package com.onlinetestmanagementsystem.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import com.onlinetestmanagementsystem.model.Question;
//import com.onlinetestmanagementsystem.repositories.QuestionRepo;
//
//class QuestionServiceTest {
//
//	@InjectMocks
//	private QuestionServiceImpl questionService;
//
//	@Mock
//    private QuestionRepo questionRepo;
//
//	@Before
//	public void init() {
//		
//		MockitoAnnotations.openMocks(this);
//	}
//	
//    @Test
//    void addQuestionTest() throws Exception {
//    	
////    	ArrayList<String> al = new ArrayList<>(Arrays.asList("op1","op2","op3","op4"));
////    	Question question = new Question(12L, "Q12", al, 1, 1, null, null, null);
//    	
////    	when(questionRepo.save(question)).thenReturn(question);
////    	
////    	questionService.addQuestion(question);
////    	
////    	verify(questionRepo, times(1)).save(question);
//    }
//    
//    @Test
//    void deleteQuestionTest() throws Exception {
//    	
//    	Question question = new Question();
//    	
//    	questionService.deleteQuestion(question.getQuestionId());
//    	
//    	verify(questionRepo, times(1)).delete(question);
//    }
//    
//    @Test
//    void updateQuestionTest() throws Exception {
//    	
////    	ArrayList<String> al = new ArrayList<>(Arrays.asList("op1","op2","op3","op4"));
////    	Question question = new Question();
////    	question.getQuestionId();
////    	question.setQuestionTitle(null);
////    	question.setChosenAnswer(null);
////    	question.setMarksScored(null);
////    	question.setQuestionAnswer(null);
////    	question.setQuestionMarks(null);
////    	question.setQuestionOptions(al);
////    	question.setTest(null);
////    	
////    	when(questionRepo.save(question)).thenReturn(question);
////    	
////    	questionService.addQuestion(question);
////    	
////    	verify(questionRepo, times(1)).save(question);
//    }
//    
//    @Test
//    void showQuestionTest() throws Exception {
//    	
////    	Set<String> al = new HashSet()<String>("op1","op2","op3","op4");
////    	
////    	Question q1 = new Question(12L, "Q12", al, 1, 1, null, null, null);
////    	Question q2 = new Question(13L, "Q13", al, 1, 0, null, null, null);
////    	Question q3 = new Question(14L, "Q14", al, 0, 1, null, null, null);
////    	
////    	List<Question> ql = new ArrayList<>();
////    	ql.add(q1);
////    	ql.add(q2);
////    	ql.add(q3);
////    	
////    	when(questionRepo.findAll()).thenReturn(ql);
////    	
////    	List<Question> qList = questionService.showQuestionList();
////
////		assertEquals(3, qList.size());
////		verify(questionRepo, times(1)).findAll();
//    }
//}
