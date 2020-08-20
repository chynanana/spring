package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Comments;

public interface CommentsRepo extends JpaRepository<Comments, Integer>  {

}
