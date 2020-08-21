package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Entities.Movies;



@Repository
public interface MovieRepo extends JpaRepository <Movies,Integer> {

}
