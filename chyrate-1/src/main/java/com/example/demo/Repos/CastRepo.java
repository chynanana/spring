package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Cast;

@Repository
public interface CastRepo extends JpaRepository<Cast, Integer>{
	
	
}