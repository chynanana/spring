package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Comments;
import com.example.demo.repos.CommentsRepo;

@RestController
public class NavControllers {
	
	@Autowired 
	CommentsRepo repo;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/insert")
	
	public String insert(@RequestBody Comments x) {
		repo.save(x);
		return "inserted";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/all")
	public List<Comments> showAll(){
		List<Comments> records= repo.findAll();
		return records;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/save")
	public String saveRecord(@RequestParam String comment, @RequestParam String name) {
		Comments s=new Comments();
		s.setComment(comment);
		s.setName(name);
		repo.save(s);
		
		return "Record Saved - name was " + name;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/comment/{id}")
	public String deleteByID(@PathVariable int id) {
		repo.deleteById(id);
		return "Deleted comment by ID";
	}


	


}
