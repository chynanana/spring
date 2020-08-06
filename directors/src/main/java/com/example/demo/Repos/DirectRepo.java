package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Directors;

@Repository
public interface DirectRepo extends JpaRepository<Directors, Integer> {
	
	

}
