package Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int id;
	private String title;
	private int chyrate;
	private String review;
	private Date date;
	private Date reviewed;
	
	
	public int getId() {
		return id;
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


	public Date getReleaseDate() {
		return date;
	}


	public void setReleaseDate(Date date) {
		this.date = date;
	}


	public Date getReviewedDate() {
		return reviewed;
	}


	public void setReviewedDate(Date reviewed) {
		this.reviewed = reviewed;
	}


}