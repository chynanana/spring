package com.example.demo.Entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.Column;

import org.junit.jupiter.api.Test;

class DirectorsTest {

	@Test
	void test() {
//		int id = 11;
		String name = "Thomas";
		String bio = "Good movie";
		String movie = "train film";
		String img = "train.png";
		
		Directors d = new Directors();
		
		d.setName(name);
		d.setBio(bio);
		d.setMovie(movie);
		d.setImg(img);
		
		assertEquals(d.getName(),name);
		assertEquals(d.getBio(),bio);
		assertEquals(d.getMovie(),movie);
		assertEquals(d.getImg(),img);
		
	}

}
