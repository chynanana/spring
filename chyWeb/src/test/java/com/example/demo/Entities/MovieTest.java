package com.example.demo.Entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void test() {
		int entry = 33;
		String title = "cat film";
		int chyrate = 9;
		String review = "good film";
		String releaseDate = "catday";
		String image = "cat.png";
		
		Movies m = new Movies();
		
		m.setEntry(entry);
		m.setTitle(title);
		m.setChyrate(chyrate);
		m.setReview(review);
		m.setReleaseDate(releaseDate);
		m.setImage(image);
		
		assertEquals(m.getEntry(),entry);
		assertEquals(m.getTitle(),title);
		assertEquals(m.getChyrate(),chyrate);
		assertEquals(m.getReview(),review);
		assertEquals(m.getReleaseDate(),releaseDate);
		assertEquals(m.getImage(),image);
	}

}
