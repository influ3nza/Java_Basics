package com.example.springbootprimary.repository;

import com.example.springbootprimary.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
//    List<Comment> findByFilmId(Integer id);
}
