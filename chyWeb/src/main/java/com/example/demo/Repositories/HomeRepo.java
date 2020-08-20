package com.example.demo.Repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Homepage;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HomeRepo extends JpaRepository <Homepage,Integer>{

}
