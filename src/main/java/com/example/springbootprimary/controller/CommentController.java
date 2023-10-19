package com.example.springbootprimary.controller;

import com.example.springbootprimary.entity.Comment;
import com.example.springbootprimary.service.CommentService;
import com.example.springbootprimary.util.CommentDto;
import com.example.springbootprimary.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping("/add")
    public Comment addComment(@RequestBody CommentDto comment) {
        return commentService.addComment(comment);
    }

    @RequestMapping("/getByFilmId/{id}")
    public List<Comment> getByFilmId(@PathVariable Integer id) {
        return commentService.getByFilmId(id);
    }
}
