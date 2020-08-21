package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Directors;

public interface DirectRepo extends JpaRepository<Directors, Integer>  {

	
}
