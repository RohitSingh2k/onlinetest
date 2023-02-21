//package com.onlinetestmanagementsystem.controller;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectWriter;
//import com.onlinetestmanagementsystem.model.Question;
//import com.onlinetestmanagementsystem.repositories.QuestionRepo;
//import com.onlinetestmanagementsystem.service.QuestionService;
//
//@RunWith(MockitoJUnitRunner.class)
//class QuestionControllerTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private QuestionService questionService;
//	
//	ObjectMapper objectMapper = new ObjectMapper();
//	ObjectWriter objectWriter = objectMapper.writer();
//	
//	@Mock
//	private QuestionRepo questionRepo;
//	
//	@InjectMocks
//	private QuestionController questionController;
//	
//	ArrayList<String> al = new ArrayList<>(Arrays.asList("op1","op2","op3","op4"));
//	
//	Question QUES_1 = new Question(12L, "Q12", al, 1, 1, null, null, null);
//	Question QUES_2 = new Question(13L, "Q13", al, 1, 0, null, null, null);
//	Question QUES_3 = new Question(14L, "Q14", al, 0, 1, null, null, null);
//	
//	@BeforeEach
//	public void setUp() {
////		MockitoAnnotations.initMocks(this);
////		this.mockMvc = MockMvcBuilders.standaloneSetup(questionController).build();
//		
//		
//	}
//	
//	@Test
//	void getAllQuestion_success() throws Exception {
//		
//		List<Question> questions = new ArrayList<>(Arrays.asList(QUES_1, QUES_2, QUES_3));
//		
//		Mockito.when(questionRepo.findAll()).thenReturn(questions);
//		
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/allQuestion")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
////				.andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(3)))
//				.andExpect(jsonPath("$[2].questionTitle", is("Q14")));
//	}
//	
//	@Test
//	void addQuestion_success() throws Exception {
//		
//		ArrayList<String> al = new ArrayList<>(Arrays.asList("op1","op2","op3","op4"));
//		
//		Question q1 = new Question(12L, "Q12", al, 1, 1, null, null, null);
//		
//		Mockito.when(questionService.addQuestion(q1)).thenReturn(QUES_1);
//		
////		mockMvc.perform(MockMvcRequestBuilders.post("/addQuestion/")
////				.contentType(MediaType.APPLICATION_JSON)
////				
////				.content("{\r\n" + 
////						"  \"questionId\": 12L,\r\n" + 
////						"  \"questionTitle\": \"Q12\",\r\n" + 
////						"  \"questionOptions\": 101,\r\n" + 
////						"  \"address\": \"hyd\"\r\n" + 
////						"}"))
////		
////		.andExpect(MockMvcResultMatchers.status().isOk());
//		
//	}
//}
