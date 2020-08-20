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

import com.example.demo.Entities.Homepage;
import com.example.demo.Repositories.HomeRepo;

@RestController
public class HomepageController {
	
	@Autowired
	HomeRepo repo;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/insertHome")
	
	public String insert(@RequestBody Homepage x) {
		repo.save(x);
		return "inserted";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/allHome")
	public List<Homepage> showAll(){
		List<Homepage> records= repo.findAll();
		return records;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/saveHome")
	public String saveRecord(@RequestParam String video, @RequestParam String image, @RequestParam String altText, @RequestParam String description, @RequestParam String title) {
		Homepage s=new Homepage();
		s.setVideo(video);
		s.setImage(image);
		s.setAltText(altText);
		s.setDescription(description);
		s.setTitle(title);
		repo.save(s);
		return "Record Saved - Director has been saved";
	}

	


}
