package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Directors;
import com.example.demo.Repositories.DirectRepo;

@RestController
public class DirectorController {
	@Autowired
	DirectRepo repo;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/insertDirect")
	
	public String insert(@RequestBody Directors x) {
		repo.save(x);
		return "inserted";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/allDirect")
	public List<Directors> showAll(){
		List<Directors> records= repo.findAll();
		return records;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/saveDirect")
	public String saveRecord(@RequestParam String name, @RequestParam String bio, @RequestParam String movie, @RequestParam String img) {
		Directors s=new Directors();
		s.setName(name);
		s.setBio(bio);
		s.setMovie(movie);
		s.setImg(img);
		repo.save(s);
		return "Record Saved - Director " + name + "has been saved";
	}

	@CrossOrigin(origins = "*")
	@GetMapping("directors/{id}")
	public String deleteByID(@PathVariable int id) {
		repo.deleteById(id);
		return "Deleted director by ID";
	}
	
}
