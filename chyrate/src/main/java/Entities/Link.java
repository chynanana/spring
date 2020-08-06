package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Link {
	@Id
	private int entry;
	private Movie movie;
	private Cast cast;
	private String role;
	
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
