package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cast {
	@Id
	private int id;
	private String Name; 
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