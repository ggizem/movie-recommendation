package com.example.movierecommendation2.repository;

import com.example.movierecommendation2.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
