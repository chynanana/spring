package com.example.demo.Entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;

class HomeTest {

	@Test
	void test() {
		int id = 12;
		String video = "cats";
		String image = "cats.png";
		String altText = "this is a cat";
		String description = "cute cat"; 
		String title = "cat funny";
		
		Homepage h = new Homepage();
		
		h.setId(id);
		h.setVideo(video);
		h.setImage(image);
		h.setAltText(altText);
		h.setDescription(description);
		h.setTitle(title);
		
		assertEquals(h.getId(),id);
		assertEquals(h.getVideo(),video);
		assertEquals(h.getImage(),image);
		assertEquals(h.getAltText(),altText);
		assertEquals(h.getDescription(),description);
		assertEquals(h.getTitle(),title);
		
	}

}
