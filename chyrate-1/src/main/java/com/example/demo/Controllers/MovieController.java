package com.example.demo.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Movie;
import com.example.demo.Repos.MovieRepo;



@RestController
public class MovieController {
	@Autowired
	MovieRepo repo;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/test")
	public String testFunction() {
		return "Testing";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/all")
	public List<Movie> showAll(){
		List<Movie> record= repo.findAll();
		return record;
	}

	@CrossOrigin(origins = "*")
	@PostMapping("/save")
	public String saveRecord(@RequestParam String id, @RequestParam String title, @RequestParam String chyrate, @RequestParam String review, @RequestParam String date, @RequestParam String  reviewed) throws ParseException {
		Movie x=new Movie();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		x.setTitle(title);
		x.setChyrate(Integer.parseInt(chyrate));
		x.setReview(review);
//		x.setReleaseDate(dateFormat.parse(date));
//		x.setReviewedDate(dateFormat.parse(reviewed));
		repo.save(x);
		
		return "Movie added!";
	}
}