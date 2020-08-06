package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Movie;





@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

}

