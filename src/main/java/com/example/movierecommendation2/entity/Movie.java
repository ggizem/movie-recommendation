package com.example.movierecommendation2.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
}
