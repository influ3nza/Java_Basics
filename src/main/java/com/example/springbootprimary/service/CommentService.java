package com.example.springbootprimary.service;

import com.example.springbootprimary.entity.Comment;
import com.example.springbootprimary.entity.Film;
import com.example.springbootprimary.repository.CommentRepository;
import com.example.springbootprimary.repository.FilmRepository;
import com.example.springbootprimary.util.CommentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    FilmRepository filmRepository;

    public Comment addComment(CommentDto comment) {
        Comment com = new Comment();
        com.setRating(comment.getRating());
        com.setContent(comment.getContent());
        com.setFilm(filmRepository.findById(comment.getFilm_id()).get());
        com.setUserId(comment.getUser_id());

        commentRepository.save(com);

        Film film = com.getFilm();
        Integer reviews = film.getReviews();
        Double rating = (film.getRating() * reviews + com.getRating()) / (double) (reviews + 1);
        film.setRating(rating);
        film.setReviews(reviews + 1);
        filmRepository.save(film);

        return com;
    }

    public List<Comment> getByFilmId(Integer id) {
        Film film = filmRepository.findById(id).orElse(null);
        if (film == null) return new ArrayList<>();

        return film.getCommentList();
    }
}
