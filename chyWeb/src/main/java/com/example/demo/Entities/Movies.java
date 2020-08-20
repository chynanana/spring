package com.example.demo.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int entry;
	private String title;
	private int chyrate;
	@Column(columnDefinition="TEXT")
	private String review;
	private String releaseDate;
	private String image;
	
	
	public int getEntry() {
		return entry;
	}
	public void setEntry(int entry) {
		this.entry = entry;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getChyrate() {
		return chyrate;
	}
	public void setChyrate(int chyrate) {
		this.chyrate = chyrate;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	


	
	

}
