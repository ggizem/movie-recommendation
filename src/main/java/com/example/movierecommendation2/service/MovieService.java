package com.example.movierecommendation2.service;

import com.example.movierecommendation2.entity.Movie;
import com.example.movierecommendation2.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movierecommendation2.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // You can add more methods here for CRUD operations

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie not found with ID: " + id));
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(Long id, Movie updatedMovie) {
        if (movieRepository.existsById(id)) {
            updatedMovie.setId(id); // Ensure the ID is set to the updated movie
            return movieRepository.save(updatedMovie); // Save will update if the ID already exists
        } else {
            throw new ResourceNotFoundException("Movie not found with ID: " + id);
        }
    }


}
