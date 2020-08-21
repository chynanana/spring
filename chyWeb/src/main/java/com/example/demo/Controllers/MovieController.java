package com.example.demo.Controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entities.Movies;
import com.example.demo.Repositories.MovieRepo;

@RestController
public class MovieController {

	@Autowired 
	MovieRepo repo;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/insertMovie")
	
	public String insert(@RequestBody Movies x) {
		repo.save(x);
		return "inserted";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/allMovies")
	public List<Movies> showAll(){
		List<Movies> records= repo.findAll();
		return records;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/saveMovie")
	public String saveRecord(@RequestParam String title, @RequestParam int chyrate, @RequestParam String review, @RequestParam String release, @RequestParam String image) {
		Movies s=new Movies();
		s.setTitle("Chynna film");
		s.setChyrate(6);
		s.setReview("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In quis condimentum magna. Nulla semper bibendum arcu, ut feugiat dolor rutrum at. Praesent dictum mi quis turpis commodo egestas. Vestibulum eu tempor dolor. Duis eget dolor porta sem pellentesque molestie. Donec eu rutrum diam, sed hendrerit neque. Mauris gravida erat mauris, ut iaculis mauris viverra nec. Donec finibus magna in semper tempor. Quisque scelerisque a lorem vel auctor.Proin sem purus, scelerisque non tempor sed, lobortis at augue. Nam consectetur vel urna id eleifend. Aliquam sodales at libero faucibus sollicitudin. Ut id libero mauris. Donec dictum, nisi condimentum congue sollicitudin, nisl purus feugiat lectus, ac dapibus nibh arcu et tortor. Duis hendrerit, lorem vitae porttitor suscipit, elit neque lacinia enim, in ultricies nisi massa non nulla. Quisque non metus leo. Ut feugiat mauris id arcu mollis, facilisis commodo diam vehicula. Donec euismod in ex vitae placerat. Donec nec aliquet leo. Ut ornare velit a justo aliquam, consectetur sodales eros vestibulum.");
		s.setReleaseDate("10/09/1997");
		s.setImage("image");
		repo.save(s);
		
		return "Record Saved - Movie " + title;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/movie/{id}")
	public String deleteByID(@PathVariable int id) {
		repo.deleteById(id);
		return "Deleted comment by ID";
	}
}
