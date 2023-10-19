package com.example.springbootprimary.controller;

import com.example.springbootprimary.entity.Film;
import com.example.springbootprimary.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;

    @RequestMapping("/getById/{id}")
    public Film getById(@PathVariable Integer id) {
        return filmService.getById(id);
    }
}
