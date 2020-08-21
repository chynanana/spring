package com.example.demo.Entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommentTest {

	@Test
	void test() {
		String comment = "I like cats";
		String name = "cool cat";
		int entry = 9;
		
		Comments c = new Comments();
		
		c.setComment(comment);
		c.setName(name);
		c.setEntry(entry);
		
		assertEquals(c.getComment(),comment);
		assertEquals(c.getName(),name);
		assertEquals(c.getEntry(),entry);
	}
	

}
