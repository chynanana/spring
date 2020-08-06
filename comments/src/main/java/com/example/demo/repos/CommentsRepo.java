package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Comments;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, Integer> {

}
