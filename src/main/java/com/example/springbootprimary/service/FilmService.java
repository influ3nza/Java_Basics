package com.example.springbootprimary.service;

import com.example.springbootprimary.entity.Film;
import com.example.springbootprimary.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService {
    @Autowired
    FilmRepository filmRepository;

    public Film getById(Integer id) {
        return filmRepository.findById(id).get();
    }
}
