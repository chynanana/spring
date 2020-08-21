package com.example.demo.Entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Connect")
public class Link {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int entry;
	@ManyToOne(targetEntity = Movie.class)
	@JoinColumn(name = "fk_Movie_ID", nullable = false)
	private Movie movie;
	@ManyToOne(targetEntity = Cast.class)
	@JoinColumn(name = "cast_id", nullable = false)
	private Cast cast;
	private String role;
	
	public Link() {
		super();
	}
	
	public int getEntry() {
		return entry;
	}
	public void setEntry(int entry) {
		this.entry = entry;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Cast getCast() {
		return cast;
	}
	public void setCast(Cast cast) {
		this.cast = cast;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	} 


}