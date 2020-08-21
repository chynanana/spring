package com.example.demo.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cast {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@OneToMany(mappedBy = "cast")
//	, fetch = FetchType.LAZY, cascade = CascadeType.ALL
	private int id;
	private String Name; 
	
	public Cast() {
		super();
	}
	
//	protected Cast() {}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}