package com.example.movierecommendation2.service;

import com.example.movierecommendation2.entity.Rating;
import com.example.movierecommendation2.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movierecommendation2.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    // You can add more methods here for CRUD operations

    public Rating getRatingById(Long id) {
        return ratingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Rating not found with ID: " + id));
    }

    public Rating addRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }

}
