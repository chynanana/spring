package com.example.demo.Entities;


import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Films")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(mappedBy = "id")
	private List<Integer> Connect;
	
	private int id;
	@Column(unique = true)
	private String title;
	private int chyrate;
	private String review;
	private Date date;
	private Date reviewed;
	
	public Movie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getReviewed() {
		return reviewed;
	}

	public void setReviewed(Date reviewed) {
		this.reviewed = reviewed;
	}

	
	
}