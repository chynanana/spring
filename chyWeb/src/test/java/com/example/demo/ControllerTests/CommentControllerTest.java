package com.example.demo.ControllerTests;

import com.example.demo.Controllers.CommentController;
import com.example.demo.Entities.Comments;
import com.example.demo.Repositories.CommentsRepo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CommentControllerTest {

	@MockBean
	private CommentsRepo repo;
	
	@Autowired
	CommentController ctrl;
	
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
	
	@Test
	public void myNewTest() {
//		CommentController c = Mockito.mock(CommentController.class);
//		c.saveRecord("I like cheese", "Cheesoid");
//		List<Comments> com = c.showAll();
//		boolean passed = false;
//		for(Comments myCom : com) {
//			if(myCom.getName() == "Cheesoid" && myCom.getComment() == "I like cheese") {
//				passed = true;
//			}
//		}
//		assertTrue(passed);
		
		// Setup variables
		String comment;
		String name;
		Comments testComment = new Comments();
		
		//	Setup values
		comment = "Saving Record";
		name = "Article 5";
		testComment.setComment(comment);
		testComment.setName(name);
		
		// Mockito mockbean rule
		when(repo.save(testComment)).thenReturn(testComment);
		
		// action
		String result = ctrl.saveRecord(comment, name);
		
		// Assertion
		assertEquals("Record Saved - name was " + name, result);
		
		
	}
	
	
	
	
//	@Test
//	public void contexLoads() throws Exception {
//		assertThat(CommentController).isNotNull();
//	}
	
	/*
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CommentsRepo repo;
	
	@Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ObjectMapper mapper = new ObjectMapper();
	
	private long id;
	private Comments entry;
	private Comments name;
	private Comments comment;
	*/
	
	
	
	
//	@Test
//    public void add_NewComment() throws Exception {
//        Comments comment = new TodoDTOBuilder()
//                .description("description")
//                .title("title")
//                .build();
//	
//	@Test
//	public void insertTest() throws Exception {
//		when(repo.save(x).thenReturn("\"entry\": 1,\r\n" + 
//				"        \"name\": \"Tom\",\r\n" + 
//				"        \"comment\": \"I love the trailers"));
//		this.mockMvc.perform(get("/insert")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("\"entry\": 1,\r\n" + 
//						"        \"name\": \"Tom\",\r\n" + 
//						"        \"comment\": \"I love the trailers\""));
//	}
	
//	@Test
//	public void InsertTest(CommentsRepo repo) {
//		this.repo = repo;	
//	}
//	@Test
//	@PostMapping("/insert")
//	public @ResponseBody Comments InsertTest(@RequestBody Comments x) {
//		return repo.save(x);
//	}
	

}
