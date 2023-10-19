package com.example.springbootprimary.repository;

import com.example.springbootprimary.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
